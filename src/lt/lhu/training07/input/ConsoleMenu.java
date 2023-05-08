package lt.lhu.training07.input;

import lt.lhu.training07.input.command.Command;
import lt.lhu.training07.input.command.CommandProvider;
import lt.lhu.training07.input.command.MenuCommand;

public class ConsoleMenu {

	public void execute() {

		Command command = CommandProvider.getInstance().getCommand(MenuCommand.SHOW_MAIN_MENU);
		command.execute();
	}

}
