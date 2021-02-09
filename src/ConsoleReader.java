package src;

import java.util.Scanner;

public class ConsoleReader {
  public String readCommand() {
    var commandReader = new Scanner(System.in);
    var command = commandReader.nextLine();
    commandReader.close();
    return command;
  }
}
