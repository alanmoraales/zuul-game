package src;

public class ZuulGame {
  private GameState currentState;
  private CommandBuilder commandBuilder;

  public ZuulGame(Room initialRoom) {
    this.currentState = new GameState();
    this.currentState.setCurrentRoom(initialRoom);
    this.currentState.setPlaying(true);
    this.commandBuilder = new CommandBuilder();
  }

  public void play() {
    this.printWelcome();

    while (this.currentState.isPlaying()) {
      try {
        printStatus();
        var userCommand = this.commandBuilder.getCommand();
        userCommand.run(this.currentState);
      } catch (UnknownCommandException e) {
        printUnknownCommandMessage();
      }
    }

    this.printGoodBye();
  }

  private void printUnknownCommandMessage() {
    System.out.println();
    System.out.println("Unknown command, type 'help' to see available commands");
  }

  private void printStatus() {
    System.out.println();
    this.currentState.getCurrentRoom().printDescription();
    this.currentState.getCurrentRoom().printAvailableExist();
    System.out.println();
  }

  private void printGoodBye() {
    System.out.println("Thank you for playing.  Good bye.");
  }

  private void printWelcome() {
    System.out.println();
    System.out.println("Welcome to the World of Zuul!");
    System.out.println("World of Zuul is a new, incredibly boring adventure game.");
    System.out.println("Type 'help' if you need help.");
    System.out.println();
  }
}
