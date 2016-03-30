package valute;

import java.util.LinkedList;

import datumi.Datum;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Datum> datumi;

	public LinkedList<Datum> getDatumi() {
		return datumi;
	}

	public void setDatumi(LinkedList<Datum> datumi) {
		if (datumi == null) {
			throw new NullPointerException("Pogresno unet datum");
		} else {
			this.datumi = datumi;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty()) {
			throw new NullPointerException("Pogresno unet naziv");
		} else {
			this.naziv = naziv;
		}
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.isEmpty()) {
			throw new NullPointerException("Pogresno unet skraceni naziv");
		} else {
			this.skraceniNaziv = skraceniNaziv;
		}
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datumi + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumi == null) ? 0 : datumi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datumi == null) {
			if (other.datumi != null)
				return false;
		} else if (!datumi.equals(other.datumi))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

}
