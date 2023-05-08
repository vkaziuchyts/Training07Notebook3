package lt.lhu.training07.input.command.impl;

import lt.lhu.training07.input.Display;
import lt.lhu.training07.input.MenuBuilder;
import lt.lhu.training07.input.command.Command;
import lt.lhu.training07.logic.NotebookLogic;

public class ConsoleShowAllNotes implements Command {

	private NotebookLogic logic = new NotebookLogic();
	private Display display = MenuBuilder.getInstance().getDisplay();

	@Override
	public void execute() {

		display.printNotes(logic.allNotes());

	}

}
