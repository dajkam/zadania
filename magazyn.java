package javamakt;
import java.util.*;

public class magazyn extends ArrayList { 
	ArrayList<produkt> m = new ArrayList<produkt>();

	public magazyn(ArrayList<produkt> m) {
		super();
		this.m = m;
	}

	@Override
	public String toString() {
		return "magazyn [m=" + m + "]";
	}

	public ArrayList<produkt> getM() {
		return m;
	}

	public void setM(ArrayList<produkt> m) {
		this.m = m;
	} 

}
