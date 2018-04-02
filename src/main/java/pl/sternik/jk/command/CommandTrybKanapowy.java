package pl.sternik.jk.command;

import pl.sternik.jk.pilot.SprzetyFasada;

public class CommandTrybKanapowy implements Command{

	@Override
	public void execute() {
		SprzetyFasada.wlaczTrybKanapowy();
	}

	@Override
	public String getOpis() {
		return "Wlacz tryb kanapowy";
	}

}
