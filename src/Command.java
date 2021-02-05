package src;

import java.util.ArrayList;

public abstract class Command {
  protected ArrayList<String> availableExits = new ArrayList<String>();

  public Command() {
    availableExits.add("north");
    availableExits.add("east");
    availableExits.add("south");
    availableExits.add("west");
  }

  public abstract void run(GameState currentGameState);
}
