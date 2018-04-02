package pl.sternik.jk.command.telewizor;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.telewizor.*;

public class CommandsTelewizorGlosniej implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().glosniej();
		
	}

	@Override
	public String getOpis() {
		return "Telewizor glosniej";
	}

}
