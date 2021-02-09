package src;

public class CommandBuilder {
	public Command getCommand() throws UnknownCommandException {
		var getCommandInput = new ConsoleReader();
		var commandInput = getCommandInput.readCommand();
		var commandArray = commandInput.split(" ");
		var commandWord = "";
		var commandParam = "";

		if (commandArray.length > 0) {
			commandWord = commandArray[0];
		}

		if (commandArray.length > 1) {
			commandParam = commandArray[1];
		}

		switch (commandWord) {
			case "go":
				var commandGo = new Go();
				commandGo.setDestiny(commandParam);
				return commandGo;

			case "help":
				return new Help();

			case "quit":
				return new Quit();

			default:
				throw new UnknownCommandException("Unknown command, try again");
		}
	}
}
