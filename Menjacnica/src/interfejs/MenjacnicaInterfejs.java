package interfejs;

import java.util.GregorianCalendar;

import valute.Valuta;

public interface MenjacnicaInterfejs {
	void dodajKurs(GregorianCalendar datum, Valuta valuta, double prodajniKurs, double kupovniKurs, double srednjiKurs);

	void izbrisiKurs(GregorianCalendar datum, Valuta valuta);

	void nadjiKurs(GregorianCalendar datum, Valuta valuta);
}
