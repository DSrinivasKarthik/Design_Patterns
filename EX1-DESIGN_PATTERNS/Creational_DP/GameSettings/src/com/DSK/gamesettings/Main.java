package com.DSK.gamesettings;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        GameSettings settings = GameSettings.getInstance();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\nGame Settings:");
                System.out.println("1. View current settings");
                System.out.println("2. Change volume");
                System.out.println("3. Change screen resolution");
                System.out.println("4. Exit");

                System.out.print("Choose an option: ");
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Current settings:");
                        System.out.println("Volume: " + settings.getVolume());
                        System.out.println("Screen Resolution: " + settings.getScreenResolution());
                        break;

                    case 2:
                        System.out.print("Enter new volume (0-100): ");
                        int volume = Integer.parseInt(scanner.nextLine());
                        settings.setVolume(volume);
                        break;

                    case 3:
                        System.out.print("Enter new screen resolution (e.g., 1920x1080): ");
                        String resolution = scanner.nextLine();
                        settings.setScreenResolution(resolution);
                        break;

                    case 4:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, "An error occurred: ", e);
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
