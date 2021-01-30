package src;

public class Quit extends Command {

	@Override
	public void run(GameState gameState) {
		gameState.setPlaying(false);
	}
}
