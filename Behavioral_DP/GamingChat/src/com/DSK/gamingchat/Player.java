package Behavioral_DP.GamingChat.src.com.DSK.gamingchat;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Player implements Observer {
    private String playerName;
    private static final Logger logger = Logger.getLogger(Player.class.getName());

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(String message) {
        System.out.println(playerName + " received message: " + message);
        logger.log(Level.INFO, playerName + " received message: " + message);
    }

    @Override
    public String toString() {
        return playerName;
    }
}
