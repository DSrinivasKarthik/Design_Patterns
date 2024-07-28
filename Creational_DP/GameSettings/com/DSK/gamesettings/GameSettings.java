package com.DSK.gamesettings;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameSettings {
    private static final Logger logger = Logger.getLogger(GameSettings.class.getName());

    private static GameSettings instance;

    private int volume;
    private String screenResolution;

    private GameSettings() {
        this.volume = 50; // Default volume
        this.screenResolution = "1920x1080"; // Default screen resolution
        logger.info("GameSettings initialized with default values.");
    }

    public static synchronized GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
            logger.info("New GameSettings instance created.");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100.");
        }
        this.volume = volume;
        logger.info("Volume set to " + volume);
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        if (screenResolution == null || screenResolution.isEmpty()) {
            throw new IllegalArgumentException("Screen resolution cannot be null or empty.");
        }
        this.screenResolution = screenResolution;
        logger.info("Screen resolution set to " + screenResolution);
    }
}
