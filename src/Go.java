package src;

public class Go extends Command {
	private String destiny;

	@Override
	public void run(GameState currentGameState) {
		try {
			var destinyRoom = currentGameState.getCurrentRoom().getRoom(destiny);
			currentGameState.setCurrentRoom(destinyRoom);
		} catch (NotExistingRoomException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

}
