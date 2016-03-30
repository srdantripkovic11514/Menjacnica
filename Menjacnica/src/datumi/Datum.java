package datumi;

import java.util.GregorianCalendar;

import valute.Valuta;

public class Datum extends Valuta {

	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	private GregorianCalendar datum;

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datum other = (Datum) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Datum [prodajniKurs=" + prodajniKurs + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs
				+ ", datum=" + datum + "]";
	}

}
