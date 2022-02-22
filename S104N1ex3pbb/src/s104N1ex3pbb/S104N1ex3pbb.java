package s104N1ex3pbb;

import java.util.ArrayList;

public class S104N1ex3pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList noms = new ArrayList ();
		noms.add("Pepe");
		noms.add("Maria");
		noms.add("Luis");

		System.out.println(ultimElement(noms));
	}	
	public static String ultimElement(ArrayList noms) throws   IndexOutOfBoundsException  {
		int index = 3;	
		String nom = (String) noms.get(index);
		return nom;  
	}			
}
