package pl.sternik.jk.command.wentylator;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.wentylator.*;

public class CommandWentylatorObroty1 implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().obroty1();
	}

	@Override
	public String getOpis() {
		return "Wentylator, obroty: 1";
	}

}
