package src;

public class Quit implements Command {

=======
public class Quit extends Command {

	@Override
  public void run(GameState currentGameState) {
    currentGameState.setPlaying(false);
	}

}
