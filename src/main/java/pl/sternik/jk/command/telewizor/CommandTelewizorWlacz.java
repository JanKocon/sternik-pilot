package pl.sternik.jk.command.telewizor;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.telewizor.*;

public class CommandTelewizorWlacz implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().wlacz();
		
	}

	@Override
	public String getOpis() {
		return "Telewizor wlacz";
	}

}
