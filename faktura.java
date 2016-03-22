package faktura; 
import java.util.*;

import faktura.pozycja;

public class faktura {  
	ArrayList<pozycja> t = new ArrayList<pozycja>(); 
	@Override
	public String toString() {
		return "faktura [t=" + t + ", k=" + k + "]";
	}
	public ArrayList<pozycja> getT() {
		return t;
	}
	public void setT(ArrayList<pozycja> t) {
		this.t = t;
	}
	public klient getK() {
		return k;
	}
	public void setK(klient k) {
		this.k = k;
	}
	public faktura(ArrayList<pozycja> t, klient k,double nal) {
		super();
		this.t = t;
		this.k = k; 
		this.nal=0; 
		for(int i =0;i<t.size();i++){ 
			nal=t.get(i).p.cenab+nal;
			
			
		}
	}
	klient k;  
	double nal;
	

}
