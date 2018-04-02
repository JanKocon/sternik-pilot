package pl.sternik.jk.command.wentylator;

import pl.sternik.jk.command.Command;

import pl.sternik.jk.wentylator.*;

public class CommandWentylatorWlacz implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().wlacz();
	}

	@Override
	public String getOpis() {
		return "Wentylator wlacz";
	}

}
