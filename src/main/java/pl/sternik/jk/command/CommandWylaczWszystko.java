package pl.sternik.jk.command;

import pl.sternik.jk.pilot.SprzetyFasada;

public class CommandWylaczWszystko implements Command{

	@Override
	public void execute() {
		SprzetyFasada.wylaczWszystko();
	}

	@Override
	public String getOpis() {
		return "Wylacz wszystko";
	}

}
