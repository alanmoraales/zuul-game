package src;

public class CommandBuilder {
	
	
	
	public Command getCommand() throws UnknownCommandException {
		Command command = null;
		ConsoleReader getCommandInput = new ConsoleReader();	
		String commandInput = new String();
		commandInput = getCommandInput.readCommand();
		var commandArray = commandInput.split(" ");
		var commandWord = "";
		var commandParam = "";

		if (commandArray.length > 0) {
			commandWord = commandArray[0];
		}

		if (commandArray.length > 1) {
			commandParam = commandArray[1];
		}
		
		switch(commandWord)
		{
			   
			   case "go" :
						Go commandGo = new Go();
						 commandGo.setDestiny(commandParam);
			       command = commandGo;
			      break;
			   
			   case "help" :
				   Help commandHelp = new Help();
				   command = commandHelp;
			      break; 
			   case "quit" :
				   Quit commandQuit = new Quit();
				   command = commandQuit;
				      break; 
			   
			   
			   default : 
				   throw new UnknownCommandException("Unknown command, try again" );
			}
		
		
		
		
			return command;
			
		}
}
