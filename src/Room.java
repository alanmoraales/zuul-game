package src;

import java.util.HashMap;

public class Room {
  private String description;
  private HashMap<String, Room> exits;

  public Room() {
    this.exits = new HashMap<>();
  }

  public void printDescription() {
    System.out.println(this.getDescription());
  }

  public void printAvailableExist() {
    var availableExits = this.exits.keySet();

    System.out.print("Exits: ");
    availableExits.forEach(exitName -> {
      System.out.print(String.format("%s ", exitName));
    });

    System.out.println();
  }

  public Room getRoom(String roomName) throws NotExistingRoomException {
    var room = this.exits.get(roomName);

    if (room == null) {
      throw new NotExistingRoomException("That exit doesn't exists");
    }

    return room;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setEastExit(Room eastExit) {
    this.exits.put("east", eastExit);
  }

  public void setWestExit(Room westExit) {
    this.exits.put("west", westExit);
  }

  public void setSouthExit(Room southExit) {
    this.exits.put("south", southExit);
  }

  public void setNorthExit(Room northExit) {
    this.exits.put("north", northExit);
  }
}