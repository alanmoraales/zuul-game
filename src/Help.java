package src;

public class Help implements Command {
  @Override
  public void run(GameState currentState) {
    System.out.println();
    System.out.println("You are lost. You are alone. You wander");
    System.out.println("around at the university.");
    System.out.println();
    System.out.println("Your command words are:");
    System.out.println("go quit help");
  }
}
