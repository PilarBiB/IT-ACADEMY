package s108N1ex4pbb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S108N1ex4pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> noms = Arrays.asList("Ana","Eva","Càrol","Lua","Lila","Ari","Montse","Berta","Lara","Laia","Arlet","Queralt");
		
		System.out.println(getNomsMes5Lletres(noms,5));	
	}
	public static  List<String> getNomsMes5Lletres(List<String> noms, int min ) {
		return  noms.stream().filter(l -> l.length() > min).collect(Collectors.toList());	
	}
}
