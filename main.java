package javamakt; 
import java.util.*;


public class main { 
	public static void main (String [] args){
		produkt u= new produkt(67,"rut","ppp3wed");
		produkt j= new produkt(566,"kkkkk","3wl;ed");
		produkt y= new produkt(9.9,"wiedzmin","3wed");
		produkt f= new produkt(9.9,"wiedzmin","3wed");
		produkt r= new produkt(9.9,"wiedzmin","3wed");
		produkt w= new produkt(9.9,"wiedzmin","3wed");
		produkt h= new produkt(9.9,"wiedzmin","3wed");
		produkt e= new produkt(9.9,"wiedzmin","3wed");
		produkt a= new produkt(9.9,"wiedzmin","3wed");
		produkt g= new produkt(9.9,"wiedzmin","3wed");
		
		System.out.println(u.cena);  
		System.out.println(u.opis); 
		System.out.println(u.kod); 
		System.out.println(u); 
		towar p= new towar(new ArrayList<produkt>(), 0); 
		p.add(u); 
		p.add(a);
		p.add(w); 
		p.add(w);
		p.sumuj();
		System.out.println(p);
		

}
	}
