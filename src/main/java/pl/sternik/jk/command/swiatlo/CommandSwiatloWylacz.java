package pl.sternik.jk.command.swiatlo;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.swiatlo.*;

public class CommandSwiatloWylacz implements Command{

	@Override
	public void execute() {
		Swiatlo.getInstance().wylacz();
		
	}

	@Override
	public String getOpis() {
		return "Swiatlo wylacz";
	}

}
