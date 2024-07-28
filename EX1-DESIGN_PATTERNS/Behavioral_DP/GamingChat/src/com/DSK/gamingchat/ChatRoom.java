package Behavioral_DP.GamingChat.src.com.DSK.gamingchat;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatRoom implements Subject {
    private List<Observer> observers;
    private static final Logger logger = Logger.getLogger(ChatRoom.class.getName());

    public ChatRoom() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        logger.log(Level.INFO, "Observer registered: " + o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        logger.log(Level.INFO, "Observer removed: " + o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
        logger.log(Level.INFO, "Notified observers with message: " + message);
    }

    public void sendMessage(String sender, String message) {
        String formattedMessage = sender + ": " + message;
        System.out.println("\n[ChatRoom] " + formattedMessage);
        notifyObservers(formattedMessage);
    }

    public List<Observer> getObservers() {
        return observers;
    }
}