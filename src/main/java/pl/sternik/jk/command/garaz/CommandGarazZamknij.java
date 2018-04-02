package pl.sternik.jk.command.garaz;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.garaz.*;

public class CommandGarazZamknij implements Command{

	@Override
	public void execute() {
		Garaz.getInstance().zamknij();
		
	}

	@Override
	public String getOpis() {
		return "Garaz zamknij";
	}

}
