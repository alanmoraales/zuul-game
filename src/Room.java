package src;

public class Room {
  private String description;
  private Room eastExit;
  private Room westExit;
  private Room southExit;
  private Room northExit;

  public void printDescription() {
    System.out.println(this.getDescription());
  }

  public void printAvailableExist() {
    System.out.print("Exits: ");
    
    if (this.northExit != null) {
      System.out.print("north ");
    }
    
    if (this.eastExit != null) {
      System.out.print("east ");
    }
    
    if (this.southExit != null) {
      System.out.print("south ");
    }
    
    if (this.westExit != null) {
      System.out.print("west ");
    }
    
    System.out.println();
  }

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