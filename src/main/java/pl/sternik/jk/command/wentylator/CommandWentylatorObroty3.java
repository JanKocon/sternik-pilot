package pl.sternik.jk.command.wentylator;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.wentylator.*;

public class CommandWentylatorObroty3 implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().obroty3();
	}

	@Override
	public String getOpis() {
		return "Wentylator, obroty: 3";
	}

}
