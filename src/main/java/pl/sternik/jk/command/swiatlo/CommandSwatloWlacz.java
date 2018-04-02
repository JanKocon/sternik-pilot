package pl.sternik.jk.command.swiatlo;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.swiatlo.*;

public class CommandSwatloWlacz implements Command{

	@Override
	public void execute() {
		Swiatlo.getInstance().wlacz();
		
	}

	@Override
	public String getOpis() {
		return "Swiatlo wlacz";
	}

}
