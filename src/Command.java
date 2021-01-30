package src;

import java.util.ArrayList;

public abstract class Command {

    protected ArrayList<String> directions = new ArrayList<String>();

    public Command() {
        directions.add("north");
        directions.add("east");
        directions.add("south");
        directions.add("west");
    }

    public abstract void run(GameState currentState);
}
