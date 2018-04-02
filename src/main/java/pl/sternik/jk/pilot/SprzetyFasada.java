package pl.sternik.jk.pilot;

import pl.sternik.jk.swiatlo.Swiatlo;
import pl.sternik.jk.telewizor.Telewizor;
import pl.sternik.jk.wentylator.Wentylator;

public abstract class SprzetyFasada {

	public static void wylaczWszystko() {
		Swiatlo.getInstance().wylacz();
		Telewizor.getInstance().wylacz();
		Wentylator.getInstance().wylacz();
	}
	
	public static void wlaczTrybKanapowy() {
		Swiatlo.getInstance().wylacz();
		Telewizor.getInstance().wlacz();
		Wentylator.getInstance().wlacz();
	}
}
