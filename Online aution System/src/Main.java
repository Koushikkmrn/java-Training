import Repository.AuctionRepository;
import Repository.UserRepository;
import model.Auction;
import model.User;
import service.AuctionService;
import service.BidService;
import service.UserService;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static UserService userService;
    private static AuctionService auctionService;
    private static BidService bidService;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        UserRepository userRepository = new UserRepository();
        AuctionRepository auctionRepository = new AuctionRepository();

        userService = new UserService(userRepository);
        auctionService = new AuctionService(auctionRepository);
        bidService = new BidService();

        System.out.println("========= ONLINE AUCTION SYSTEM =========");

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("---- Main Menu ----");
            System.out.println("1. Admin Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    if (adminLogin()) {
                        runAdminMenu();
                    }
                    break;
                case 2:
                    exit = true;
                    System.out.println("Exiting Online Auction System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }

        scanner.close();
    }

    private static boolean adminLogin() {
        System.out.println();
        System.out.println("---- Admin Login ----");

        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Username: ");
            String username = scanner.nextLine().trim();
            System.out.print("Password: ");
            String password = scanner.nextLine().trim();

            if (auctionService.adminLogin(username, password)) {
                System.out.println("Login Successful");
                return true;
            }

            attempts++;
            System.out.println("Invalid Credentials, try again (" + (3 - attempts) + " attempts left)");
        }

        System.out.println("Too many failed attempts. Returning to Main Menu.");
        return false;
    }

    private static void runAdminMenu() {
        boolean logout = false;
        while (!logout) {
            System.out.println();
            System.out.println("---- Admin Menu ----");
            System.out.println("1. Create Auction");
            System.out.println("2. View All Auctions");
            System.out.println("3. Logout");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    createAndRunAuction();
                    break;
                case 2:
                    viewAllAuctions();
                    break;
                case 3:
                    logout = true;
                    System.out.println("Logged out.");
                    break;
                case 4:
                    System.out.println("Exiting Online Auction System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }

    private static void createAndRunAuction() {
        System.out.println();
        System.out.println("---- Create Auction ----");
        System.out.print("Item Name: ");
        String itemName = scanner.nextLine().trim();
        System.out.print("Description: ");
        String description = scanner.nextLine().trim();
        System.out.print("Starting Price: Rs.");
        double startingPrice = Double.parseDouble(scanner.nextLine().trim());

        Auction auction = auctionService.createAuction(itemName, description, startingPrice);

        List<User> turnOrder = userService.getTurnOrder();

        bidService.runAuction(auction, turnOrder, scanner);
    }

    private static void viewAllAuctions() {
        List<Auction> auctions = auctionService.getAllAuctions();
        System.out.println();
        System.out.println("---- All Auctions ----");

        if (auctions.isEmpty()) {
            System.out.println("No auctions created yet.");
            return;
        }

        for (Auction auction : auctions) {
            System.out.println(
                    "ID: " + auction.getId()
                    + " | Item: " + auction.getItemName()
                    + " | Status: " + auction.getStatus()
                    + " | Highest Bid: Rs." + auction.getCurrentHighestBid()
                    + (auction.getCurrentHighestBidder() != null ? " by " + auction.getCurrentHighestBidder().getName() : "")
            );
        }
    }
}