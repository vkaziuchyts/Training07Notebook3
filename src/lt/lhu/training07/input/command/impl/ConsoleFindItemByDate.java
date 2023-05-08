package lt.lhu.training07.input.command.impl;

import java.text.ParseException;
import java.util.Date;

import lt.lhu.training07.input.Display;
import lt.lhu.training07.input.InputTerminal;
import lt.lhu.training07.input.MenuBuilder;
import lt.lhu.training07.input.command.Command;
import lt.lhu.training07.logic.NotebookLogic;

public class ConsoleFindItemByDate implements Command {

	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	private NotebookLogic logic = new NotebookLogic();
	private Display display = MenuBuilder.getInstance().getDisplay();

	@Override
	public void execute() {
	    Date date = null;
	    try {
	    	date = terminal.inputDate();
	    } catch (ParseException e) {
	    	e.printStackTrace();
	    }
	
	    display.printNotes(logic.find(date));          
	}

}
