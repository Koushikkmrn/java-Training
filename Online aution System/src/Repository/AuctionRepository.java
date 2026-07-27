package Repository;

import model.Auction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuctionRepository {
    private Map<Integer, Auction> auctions;
    private int nextId;

    public AuctionRepository() {
        auctions = new HashMap<>();
        nextId = 1;
    }

    public Auction createAuction(String itemName, String description, double startingPrice) {
        Auction auction = new Auction(nextId, itemName, description, startingPrice);
        auctions.put(nextId, auction);
        nextId++;
        return auction;
    }

    public Auction getAuctionById(int id) {
        return auctions.get(id);
    }

    public List<Auction> getAllAuctions() {
        return new ArrayList<>(auctions.values());
    }
}
