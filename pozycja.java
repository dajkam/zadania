package faktura;

public class pozycja  { 
	@Override
	public String toString() {
		return "pozycja [p=" + p + ", ilosc=" + ilosc + "]";
	}
	public produkt getP() {
		return p;
	}
	public void setP(produkt p) {
		this.p = p;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public pozycja(produkt p, int ilosc) {
		super();
		this.p = p;
		this.ilosc = ilosc;
	}
	produkt p; 
	int ilosc;

}
