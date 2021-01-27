package src;

public class Room {
  private String description;
  private Room eastExit;
  private Room westExit;
  private Room southExit;
  private Room northExit;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Room getEastExit() {
    return eastExit;
  }

  public void setEastExit(Room eastExit) {
    this.eastExit = eastExit;
  }

  public Room getWestExit() {
    return westExit;
  }

  public void setWestExit(Room westExit) {
    this.westExit = westExit;
  }

  public Room getSouthExit() {
    return southExit;
  }

  public void setSouthExit(Room southExit) {
    this.southExit = southExit;
  }

  public Room getNorthExit() {
    return northExit;
  }
  
  public void setNorthExit(Room northExit) {
    this.northExit = northExit;
  }

}