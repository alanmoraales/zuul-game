package src;

public class CommandBuilder {
	
	
	
	public Command getCommand() throws UnknownCommandException {
		Command command = null;
		ConsoleReader getCommandInput = new ConsoleReader();	
		String commandInput = new String();
		commandInput = getCommandInput.readCommand();
		
		switch(commandInput)
		{
			   
			   case "go" :
			       Go commandGo = new Go();
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
