package src;

import java.util.Scanner;

public class ConsoleReader {
	 
  public String readCommand() {
	  String commandInput = new String();
	  Scanner commandReader = new Scanner(System.in);
	  commandInput = commandReader.nextLine();

	  return commandInput;
  }
  
  
}
