package src;

public class GameState {
  private boolean isPlaying;
  private Room currentRoom;

  public boolean isPlaying() {
    return isPlaying;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }
  
  public void setPlaying(boolean isPlaying) {
    this.isPlaying = isPlaying;
  }
}
