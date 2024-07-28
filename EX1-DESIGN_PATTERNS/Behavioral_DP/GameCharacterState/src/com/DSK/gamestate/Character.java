package Behavioral_DP.GameCharacterState.src.com.DSK.gamestate;

public class Character {
    private State state;

    public Character() {
        state = new StandingState(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleInput(String input) {
        state.handleInput(this, input);
    }
}

