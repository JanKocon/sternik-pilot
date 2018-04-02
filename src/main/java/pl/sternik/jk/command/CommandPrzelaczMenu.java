package pl.sternik.jk.command;

import pl.sternik.jk.pilot.Pilot;

public class CommandPrzelaczMenu implements Command {

	private Pilot pilot;
	
	public CommandPrzelaczMenu(Pilot pilot) {
		this.pilot = pilot;
	}
	
	@Override
	public void execute() {
		pilot.przelaczMenu();

	}

	@Override
	public String getOpis() {
		return "Zmiana trybu pilota";
	}

}
