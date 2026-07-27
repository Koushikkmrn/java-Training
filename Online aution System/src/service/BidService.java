package service;

import model.Auction;
import model.Bid;
import model.User;

import java.util.List;
import java.util.Scanner;

public class BidService {

    public void runAuction(Auction auction, List<User> turnOrder, Scanner scanner) {
        System.out.println();
        System.out.println("Auction Started for: " + auction.getItemName());
        System.out.println("Description: " + auction.getDescription());
        System.out.println("Starting Price: Rs." + auction.getStartingPrice());

        boolean auctionClosed = false;

        while (!auctionClosed) {
            int skipCount = 0;

            for (User user : turnOrder) {
                System.out.println();
                System.out.println("Current Highest Bid: Rs." + auction.getCurrentHighestBid()
                        + (auction.getCurrentHighestBidder() != null ? " by " + auction.getCurrentHighestBidder().getName() : ""));
                System.out.println(user.getName() + "'s turn");
                System.out.println("1. Place Bid");
                System.out.println("2. Skip");
                System.out.print("Enter choice: ");
                int choice = readInt(scanner);

                if (choice == 1) {
                    double amount = readBidAmount(scanner, auction, user);
                    auction.placeBid(user, amount);
                    System.out.println("Bid Accepted! Current Highest Bid: Rs." + auction.getCurrentHighestBid() + " by " + user.getName());
                } else {
                    System.out.println(user.getName() + " skipped");
                    skipCount++;
                }
            }

            if (skipCount == turnOrder.size()) {
                boolean interrupted = runCountdown(auction, turnOrder, scanner);
                if (!interrupted) {
                    auctionClosed = true;
                    closeAuction(auction);
                }
            }
        }
    }

    private boolean runCountdown(Auction auction, List<User> turnOrder, Scanner scanner) {
        for (int level = 3; level >= 1; level--) {
            System.out.println();
            System.out.println("Countdown: " + level);
            System.out.println("Interrupt Countdown?");
            for (int i = 0; i < turnOrder.size(); i++) {
                System.out.println((i + 1) + ". " + turnOrder.get(i).getName());
            }
            System.out.println("0. Continue");
            System.out.print("Enter choice: ");
            int choice = readInt(scanner);

            if (choice >= 1 && choice <= turnOrder.size()) {
                User interruptingUser = turnOrder.get(choice - 1);
                double amount = readBidAmount(scanner, auction, interruptingUser);
                auction.placeBid(interruptingUser, amount);
                System.out.println("Bid Accepted! Current Highest Bid: Rs." + auction.getCurrentHighestBid() + " by " + interruptingUser.getName());
                System.out.println("Countdown Reset. New Bidding Round Begins.");
                return true;
            }
        }
        return false;
    }

    private double readBidAmount(Scanner scanner, Auction auction, User user) {
        double amount;
        while (true) {
            System.out.print(user.getName() + ", enter your bid amount: Rs.");
            amount = readDouble(scanner);
            if (amount > auction.getCurrentHighestBid()) {
                break;
            }
            System.out.println("Bid must be greater than current highest bid of Rs." + auction.getCurrentHighestBid());
        }
        return amount;
    }

    private void closeAuction(Auction auction) {
        auction.setStatus("CLOSED");
        System.out.println();
        System.out.println("******** AUCTION CLOSED ********");
        System.out.println();
        if (auction.getCurrentHighestBidder() != null) {
            System.out.println("Winner : " + auction.getCurrentHighestBidder().getName());
            System.out.println("Winning Bid : Rs." + auction.getCurrentHighestBid());
        } else {
            System.out.println("No bids were placed. Auction closed without a winner.");
        }
        System.out.println();
        System.out.println("========= BID HISTORY =========");
        for (Bid bid : auction.getBidHistory()) {
            System.out.println(bid.getUser().getName() + " -> Rs." + bid.getAmount());
        }
    }

    private int readInt(Scanner scanner) {
        while (true) {
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, enter a number: ");
            }
        }
    }

    private double readDouble(Scanner scanner) {
        while (true) {
            String line = scanner.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, enter a valid amount: ");
            }
        }
    }
}
