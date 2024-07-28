package Behavioral_DP.GamingChat.src.com.DSK.gamingchat;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}
