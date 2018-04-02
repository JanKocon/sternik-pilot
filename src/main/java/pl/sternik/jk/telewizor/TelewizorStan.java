package pl.sternik.jk.telewizor;

public interface TelewizorStan {
	
	TelewizorStan wlacz();
	TelewizorStan wylacz();
	
	TelewizorStan glosniej();
	TelewizorStan ciszej();
	
	TelewizorStan nastepnyKanal();
	TelewizorStan poprzedniKanal();
}
