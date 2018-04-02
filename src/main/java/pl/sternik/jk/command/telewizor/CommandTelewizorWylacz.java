package pl.sternik.jk.command.telewizor;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.telewizor.*;

public class CommandTelewizorWylacz implements Command {

	@Override
	public void execute() {
		Telewizor.getInstance().wylacz();
		
	}

	@Override
	public String getOpis() {
		return "Telewizor wylacz";
	}

}
