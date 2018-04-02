package pl.sternik.jk.menu;

import pl.sternik.jk.command.Command;

public interface MenuPilota {

	String getOpis();
	public void wyswietlMenu();
	Command getCommandForKey(String upperCase);
}
