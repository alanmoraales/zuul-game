package src;

public class Go extends Command{
	private String destiny;

	@Override
	public void run(GameState currentGameState) {
	  var newRoom = new Room();

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
