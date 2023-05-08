package lt.lhu.training07.input.command.impl;

import lt.lhu.training07.input.command.Command;

public class ConsoleNoAction implements Command {
	@Override
	public void execute() {
		System.out.println("Такое действие пока не выполняется. Извините.");
	}

}
