package pl.sternik.jk.command.wentylator;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.wentylator.*;

public class CommandWentylatorWylacz implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().wylacz();
	}

	@Override
	public String getOpis() {
		return "Wentylator wylacz";
	}

}
