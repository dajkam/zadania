package javamakt;

public class produkt { 
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	public produkt(double cena, String opis, String kod) {
		super();
		this.cena = cena;
		this.opis = opis;
		this.kod = kod;
	}
	
	@Override
	public String toString() {
		return "produkt [cena=" + cena + ", opis=" + opis + ", kod=" + kod
				+ "]";
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	double cena; 
	String opis; 
	String kod;

}
