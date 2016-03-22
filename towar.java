package javamakt; 
import java.util.*;

public class towar extends ArrayList{ 
	@Override
	public String toString() {
		return "towar [a1=" + t + ", suma=" + suma + "]";
	}
	public towar(ArrayList<produkt> t, double suma) {
		super();
		this.t = t;
		this.suma = suma; 
		
	}
	public ArrayList<produkt> getA1() {
		return t;
	}
	public void setA1(ArrayList<produkt> t) {
		this.t = t;
	}
	public double getSuma() {
		return suma;
	}
	public void setSuma(double suma) {
		this.suma = suma;
	}
	void sumuj(){
		suma= 0; 
		for(int i=0;i<t.size();i++){
			suma=suma+t.get(i).cena;
		}
		if(this.suma>300){
			suma=suma*0.95;
		}
	}
	ArrayList<produkt> t = new ArrayList<produkt>(); 
	double suma; 
}
