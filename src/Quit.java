package src;

public class Quit extends Command {
	@Override
  public void run(GameState currentState) {
    currentState.setPlaying(false);
	}
	
}
