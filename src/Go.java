package src;

import java.util.ArrayList;

public class Go extends Command{

	protected ArrayList<String> directions = new ArrayList<String>();
	private String destiny;

	public Go() {
		directions.add("north");
  	directions.add("east");
    directions.add("south");
    directions.add("west");
	}

	@Override
	public void run(GameState currentState) {
		Room newRoom = null;

		if(directions.contains(destiny)) {
			if(destiny.equals("north")) {
				newRoom = currentState.getCurrentRoom().getNorthExit();
			}
			if(destiny.equals("east")) {
				newRoom = currentState.getCurrentRoom().getEastExit();
			}
			if(destiny.equals("south")) {
				newRoom = currentState.getCurrentRoom().getSouthExit();
			}
			if(destiny.equals("west")) {
				newRoom = currentState.getCurrentRoom().getWestExit();
			}
		} else {
			System.out.println("That exit doesn't exists");
		}

		if (newRoom != null) {
			currentState.setCurrentRoom(newRoom);
		} else {
			System.out.println("That exit doesn't exists");
		}
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
}
