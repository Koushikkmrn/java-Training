package service;

import Repository.AuctionRepository;
import model.Auction;

import java.util.List;

public class AuctionService {
    private AuctionRepository auctionRepository;
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    public boolean adminLogin(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public Auction createAuction(String itemName, String description, double startingPrice) {
        return auctionRepository.createAuction(itemName, description, startingPrice);
    }

    public List<Auction> getAllAuctions() {
        return auctionRepository.getAllAuctions();
    }
}
