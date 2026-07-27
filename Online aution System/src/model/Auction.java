package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Auction {
    private int id;
    private String itemName;
    private String description;
    private double startingPrice;
    private double currentHighestBid;
    private User currentHighestBidder;
    private List<Bid> bidHistory;
    private PriorityQueue<Bid> highestBidQueue;
    private String status;

    public Auction(int id, String itemName, String description, double startingPrice) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.startingPrice = startingPrice;
        this.currentHighestBid = startingPrice;
        this.currentHighestBidder = null;
        this.bidHistory = new ArrayList<>();
        this.highestBidQueue = new PriorityQueue<>(Comparator.comparingDouble(Bid::getAmount).reversed());
        this.status = "OPEN";
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public double getCurrentHighestBid() {
        return currentHighestBid;
    }

    public User getCurrentHighestBidder() {
        return currentHighestBidder;
    }

    public List<Bid> getBidHistory() {
        return bidHistory;
    }

    public PriorityQueue<Bid> getHighestBidQueue() {
        return highestBidQueue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void placeBid(User user, double amount) {
        Bid bid = new Bid(user, amount);
        bidHistory.add(bid);
        highestBidQueue.add(bid);
        currentHighestBid = amount;
        currentHighestBidder = user;
    }
}
