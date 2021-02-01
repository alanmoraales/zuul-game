package src;

public class Go extends Command{

	private String destiny;

	@Override
	public void run(GameState currentState) {

		if(this.directions.contains(destiny)) {
			if(destiny.equals("north")) {
				Room newRoom = currentState.getCurrentRoom().getNorthExit();
				currentState.setCurrentRoom(newRoom);
			}
			if(destiny.equals("east")) {
				Room newRoom = currentState.getCurrentRoom().getEastExit();
				currentState.setCurrentRoom(newRoom);
			}
			if(destiny.equals("south")) {
				Room newRoom = currentState.getCurrentRoom().getSouthExit();
				currentState.setCurrentRoom(newRoom);
			}
			if(destiny.equals("west")) {
				Room newRoom = currentState.getCurrentRoom().getWestExit();
				currentState.setCurrentRoom(newRoom);
			}
		}else {
			System.out.println("No existe esa direccion");
		}
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
}
