package Behavioral_DP.GameCharacterState.src.com.DSK.gamestate;

public class RunningState implements State {
    @Override
    public void handleInput(Character character, String input) {
        switch (input.toLowerCase()) {
            case "stop":
                System.out.println("Character stops running and stands.");
                character.setState(new StandingState());
                break;
            case "jump":
                System.out.println("Character jumps while running.");
                character.setState(new JumpingState());
                break;
            default:
                System.out.println("Character keeps running.");
        }
    }
}
