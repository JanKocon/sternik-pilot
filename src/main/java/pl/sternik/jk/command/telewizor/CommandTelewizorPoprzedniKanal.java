package pl.sternik.jk.command.telewizor;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.telewizor.*;

public class CommandTelewizorPoprzedniKanal implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().poprzedniKanal();
	}

	@Override
	public String getOpis() {
		return "Telewizor poprzedni kanal";
	}

}
