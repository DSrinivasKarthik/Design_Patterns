package Behavioral_DP.GamingChat.src.com.DSK.gamingchat;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Player player3 = new Player("Player3");

        chatRoom.registerObserver(player1);
        chatRoom.registerObserver(player2);
        chatRoom.registerObserver(player3);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect a player to send a message or exit:");
            for (int i = 0; i < chatRoom.getObservers().size(); i++) {
                System.out.println((i + 1) + ". " + chatRoom.getObservers().get(i));
            }
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int playerChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (playerChoice > 0 && playerChoice <= chatRoom.getObservers().size()) {
                    Player selectedPlayer = (Player) chatRoom.getObservers().get(playerChoice - 1);
                    System.out.println("\nSelected Player: " + selectedPlayer);

                    boolean playerExit = false;

                    while (!playerExit) {
                        System.out.println("\n1. Send Message");
                        System.out.println("2. Exit Chat Room for " + selectedPlayer);
                        System.out.print("Enter your choice: ");

                        if (scanner.hasNextInt()) {
                            int choice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            switch (choice) {
                                case 1:
                                    System.out.print("Enter message: ");
                                    String message = scanner.nextLine();
                                    chatRoom.sendMessage(selectedPlayer.toString(), message);
                                    logger.log(Level.INFO, "Message sent by " + selectedPlayer + ": " + message);
                                    break;
                                case 2:
                                    chatRoom.removeObserver(selectedPlayer);
                                    playerExit = true;
                                    logger.log(Level.INFO, selectedPlayer + " exited the chat room.");
                                    break;
                                default:
                                    System.out.println("Invalid choice! Please try again.");
                                    logger.log(Level.WARNING, "Invalid choice entered: " + choice);
                            }
                        } else {
                            System.out.println("Invalid input! Please enter a number.");
                            logger.log(Level.WARNING, "Non-integer input entered.");
                            scanner.next(); // Consume the invalid input
                        }
                    }
                } else {
                    System.out.println("Invalid player selection! Please try again.");
                    logger.log(Level.WARNING, "Invalid player selection entered: " + playerChoice);
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                logger.log(Level.WARNING, "Non-integer input entered.");
                scanner.next(); // Consume the invalid input
            }

            if (chatRoom.getObservers().isEmpty()) {
                exit = true;
                logger.log(Level.INFO, "All players have exited. Terminating chat room.");
            }
        }

        scanner.close();
    }
}
