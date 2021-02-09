package src;

public class CommandBuilder {
	
  public Command getCommand() throws UnknownCommandException {
    Command command = null;
	var getCommandInput = new ConsoleReader();	
	var commandInput = new String();
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
			
	switch(commandWord) { 
	  case "go" :
	    var commandGo = new Go();
		commandGo.setDestiny(commandParam);
		command = commandGo;
		break;
		
      case "help" :
		var commandHelp = new Help();
		command = commandHelp;
		break; 
		
      case "quit" :
		var commandQuit = new Quit();
		command = commandQuit;
		break; 	

      default : 
		throw new UnknownCommandException("Unknown command, try again" );
		
	}

	return command;
		
  }
}

	