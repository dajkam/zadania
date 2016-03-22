package faktura;

public class produkt { 
	public produkt(String nazwa, double cenan, double vat, double cenab) {
		super();
		this.nazwa = nazwa;
		this.cenan = cenan;
		this.vat = vat;
		this.cenab = cenab;
	}
	@Override
	public String toString() {
		return "produkt [nazwa=" + nazwa + ", cenan=" + cenan + ", vat=" + vat
				+ ", cenab=" + cenab + "]";
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public double getCenan() {
		return cenan;
	}
	public void setCenan(double cenan) {
		this.cenan = cenan;
	}
	public double getCenab() {
		return cenab;
	}
	public void setCenab(double cenab) {
		this.cenab = cenab;
	}
	String nazwa; 
	double cenan; 
	double vat; 
	double cenab=cenan*vat; 
	

}
