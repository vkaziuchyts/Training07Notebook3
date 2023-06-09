package lt.lhu.training07.input.command.impl;

import lt.lhu.training07.input.Display;
import lt.lhu.training07.input.InputTerminal;
import lt.lhu.training07.input.MenuBuilder;
import lt.lhu.training07.input.command.Command;
import lt.lhu.training07.logic.NotebookLogic;

public class ConsoleFindItemByContent implements Command {

	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	private NotebookLogic logic = new NotebookLogic();
	private Display display = MenuBuilder.getInstance().getDisplay();

	@Override
	public void execute() {

		String content = terminal.inputContent();

		display.printNotes(logic.find(content));

	}

}