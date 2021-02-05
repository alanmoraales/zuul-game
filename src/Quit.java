package src;

public class Quit extends Command {
	@Override
  public void run(GameState currentGameState) {
    currentGameState.setPlaying(false);
	}

}
