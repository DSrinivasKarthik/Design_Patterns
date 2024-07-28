package Behavioral_DP.GameCharacterState.src.com.DSK.gamestate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter command (run, jump, stop, land, exit): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                exit = true;
            } else {
                character.handleInput(input);
            }
        }

        scanner.close();
    }
}
