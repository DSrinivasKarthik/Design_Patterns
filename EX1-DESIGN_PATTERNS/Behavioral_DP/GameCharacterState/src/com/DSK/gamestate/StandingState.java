package Behavioral_DP.GameCharacterState.src.com.DSK.gamestate;

public class StandingState implements State {
    @Override
    public void handleInput(Character character, String input) {
        switch (input.toLowerCase()) {
            case "run":
                System.out.println("Character starts running.");
                character.setState(new RunningState());
                break;
            case "jump":
                System.out.println("Character jumps.");
                character.setState(new JumpingState());
                break;
            default:
                System.out.println("Character remains standing.");
        }
    }
}