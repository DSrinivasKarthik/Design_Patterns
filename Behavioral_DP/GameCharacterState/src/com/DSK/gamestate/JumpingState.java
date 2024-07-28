package Behavioral_DP.GameCharacterState.src.com.DSK.gamestate;

public class JumpingState implements State {
    @Override
    public void handleInput(Character character, String input) {
        switch (input.toLowerCase()) {
            case "land":
                System.out.println("Character lands and stands.");
                character.setState(new StandingState());
                break;
            default:
                System.out.println("Character is in the air.");
        }
    }
}

