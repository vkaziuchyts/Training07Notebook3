package lt.lhu.training07.input.command.impl;

import lt.lhu.training07.input.command.Command;

public class ConsoleFindItemByDate implements Command {

	@Override
	public void execute() {
		System.out.println("find item by date");
	}

}
