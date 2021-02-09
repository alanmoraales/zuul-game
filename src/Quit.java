package src;

public class Quit implements Command {

	@Override
	public void run(GameState currentState) {
		currentState.setPlaying(false);
	}
}
