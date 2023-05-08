package lt.lhu.training07.input.command.impl;

import lt.lhu.training07.input.InputTerminal;
import lt.lhu.training07.input.MenuBuilder;
import lt.lhu.training07.input.command.Command;
import lt.lhu.training07.logic.NotebookLogic;

public class ConsoleCreateNewItem implements Command {

	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	NotebookLogic logic = new NotebookLogic();

	@Override
	public void execute() {

		String title = terminal.inputTitle();
		String content = terminal.inputContent();

		logic.add(title, content);

	}

}