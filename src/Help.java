package src;

public class Help extends Command {
	@Override
  public void run(GameState currentGameState) {
    currentGameState.setPlaying(true);
    System.out.println("You are lost. You are alone. You wander");
    System.out.println("around at the university.");
    System.out.println();
    System.out.println("Your command words are:");
    System.out.println("   go quit help");
    }

}
