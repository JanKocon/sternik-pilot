package pl.sternik.jk.command.telewizor;

import pl.sternik.jk.command.Command;
import pl.sternik.jk.telewizor.*;

public class CommandTelewizorNastepnyKanal implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().nastepnyKanal();
	}

	@Override
	public String getOpis() {
		return "Telewizor nastepny kanal";
	}

	
}
