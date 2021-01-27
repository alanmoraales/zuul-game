package src;

public class Help extends Command{

	@Override
	public void run(GameState gameState) {
		gameState.setPlaying(true);
	}
}
