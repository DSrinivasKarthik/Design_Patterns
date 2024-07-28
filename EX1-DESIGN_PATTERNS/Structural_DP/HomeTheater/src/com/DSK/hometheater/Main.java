package Structural_DP.HomeTheater.src.com.DSK.hometheater;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, amplifier, lights);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Home Theater System:");
            System.out.println("1. Watch Movie");
            System.out.println("2. End Movie");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter movie name: ");
                        String movie = scanner.nextLine();
                        homeTheater.watchMovie(movie);
                        logger.log(Level.INFO, "Started watching movie: " + movie);
                        break;
                    case 2:
                        homeTheater.endMovie();
                        logger.log(Level.INFO, "Movie ended");
                        break;
                    case 3:
                        exit = true;
                        logger.log(Level.INFO, "Exiting Home Theater System...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        logger.log(Level.WARNING, "Invalid choice entered: " + choice);
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                logger.log(Level.WARNING, "Non-integer input entered.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}