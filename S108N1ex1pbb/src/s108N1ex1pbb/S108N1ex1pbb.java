package s108N1ex1pbb;

import java.util.Arrays;
import java.util.List;

public class S108N1ex1pbb {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("LLISTA NOMS");
		List<String> noms = Arrays.asList("Ana","Eva","Ona","Lua","Lila","Ari","Montse","Berta","Lara","Laia","Arlet","Queralt");
		
		noms.stream().forEach(n->System.out.println(n));
		
		System.out.println("LLISTA NOMS QUE COMENCEN AMB A MAJUSCULA I TENEN 3 LLETRES");
		
		noms.stream().filter(a -> a.charAt(0) == 'A' &&  a.length() == 3).forEach (a->System.out.println(a)); 	
	}	
}
