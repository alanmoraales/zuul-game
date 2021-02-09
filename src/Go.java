package src;

import java.util.ArrayList;

public class Go implements Command{

	protected ArrayList<String> directions = new ArrayList<String>();
=======
public class Go extends Command {
	private String destiny;

	public Go() {
		directions.add("north");
  	directions.add("east");
    directions.add("south");
    directions.add("west");
	}

	@Override
	public void run(GameState currentGameState) {
	  var newRoom = new Room();

		if(directions.contains(destiny)) {
			if(destiny.equals("north")) {
				newRoom = currentState.getCurrentRoom().getNorthExit();
=======
	  if(this.availableExits.contains(destiny)) {
		  if(destiny.equals("north")) {
			  newRoom = currentGameState.getCurrentRoom().getNorthExit();
			}
			
		  if(destiny.equals("east")) {
		  	newRoom = currentGameState.getCurrentRoom().getEastExit();
			}
			
		  if(destiny.equals("south")) {
		  	newRoom = currentGameState.getCurrentRoom().getSouthExit();
			}
			
		  if(destiny.equals("west")) {
		  	newRoom = currentGameState.getCurrentRoom().getWestExit();
			}
			
	  } else {
	  	System.out.println("That exit doesn't exists");
	  }

	  if(newRoom != null) {
	  	currentGameState.setCurrentRoom(newRoom);
	  } else {
	  	System.out.println("That exit doesn't exists");
    }

		
	}

  public void setDestiny(String destiny) {
	  this.destiny = destiny;
	}
	
}
