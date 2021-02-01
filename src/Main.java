package src;

public class Main {
  public static void main(String[] args) {
    var initialRoom = createRoomsAndGetInitialRoom();
    var zuulGame = new ZuulGame(initialRoom);
    zuulGame.play();
  }

  public static Room createRoomsAndGetInitialRoom() {
    var outside = new Room();
    outside.setDescription("outside the main entrance of the university");

    var theatre = new Room();
    theatre.setDescription("in a lecture theatre");

    var pub = new Room();
    pub.setDescription("in the campus pub");

    var lab = new Room();
    lab.setDescription("in a computing lab");

    var office = new Room();
    office.setDescription("in the computing admin office");

    outside.setEastExit(theatre);
    outside.setSouthExit(lab);
    outside.setWestExit(pub);

    theatre.setWestExit(outside);

    pub.setEastExit(outside);

    lab.setNorthExit(outside);
    lab.setEastExit(office);

    office.setWestExit(lab);

    return outside;
  }
}
