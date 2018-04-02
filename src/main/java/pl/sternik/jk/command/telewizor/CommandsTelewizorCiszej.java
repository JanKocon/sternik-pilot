package pl.sternik.jk.command.telewizor;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.telewizor.*;

public class CommandsTelewizorCiszej implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().ciszej();
	}

	@Override
	public String getOpis() {
		return "Telewizor ciszej";
	}

}
