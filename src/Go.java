package src;

public class Go extends Command{

	private String destiny;

	@Override
	public void run(GameState currentState) {
	  var newRoom = new Room();

	  if(this.directions.contains(destiny)) {
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

	  if(newRoom != null) {
	  	currentState.setCurrentRoom(newRoom);
	  } else {
	  	System.out.println("That exit doesn't exists");
	  }


	}

  public void setDestiny(String destiny) {
	  this.destiny = destiny;
  }
}
