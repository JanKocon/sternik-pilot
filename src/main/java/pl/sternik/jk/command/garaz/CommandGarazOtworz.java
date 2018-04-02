package pl.sternik.jk.command.garaz;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.garaz.*;

public class CommandGarazOtworz implements Command{

	@Override
	public void execute() {
		Garaz.getInstance().otworz();
		
	}

	@Override
	public String getOpis() {
		return "Garaz otworz";
	}

}
