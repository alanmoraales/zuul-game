package src;

public class Help extends Command{

	@Override
	public void run(GameState currentState) {
		currentState.setPlaying(true);
	}
}
