package s108N1ex3pbb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S108N1ex3pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> noms = Arrays.asList("Ana","Eva","Càrol","Lua","Lila","Ari","Montse","Berta","Lara","Laia","Arlet","Queralt");
		
		System.out.println(getNomsLletraO(noms, "o"));	
	}
	public static List<String> getNomsLletraO(List<String> noms, String o) {
		return noms.stream().filter(a -> a.contains("o")).collect(Collectors.toList());			
	}
}
