package src;

import java.util.Scanner;

public class ConsoleReader {
	 
  public String readCommand() {
    var commandInput = new String();
	var commandReader = new Scanner(System.in);
	commandInput = commandReader.nextLine();

	return commandInput;
  }
  
  
}
