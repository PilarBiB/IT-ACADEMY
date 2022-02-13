package s103N1ex7pbb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class S103N1ex7pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("Luis",1);
		hm.put("Julio",2);
		hm.put("Lola",3);
		hm.put("Carlos",4);
		hm.put("Amaya",5);
	
		System.out.println("LLISTAT PER CODI HASH (El que fa hashMap segons el valor hash de les claus)");
		hm.entrySet().forEach(System.out::println);
		System.out.println();
		
		System.out.println("LLISTAT ORDENAT PER CLAU AMB ABECEDARI");
		Map<String, Integer> tM = new TreeMap<>(hm);
		tM.entrySet().forEach(System.out::println);
		System.out.println();
		
		Map<String, Integer> lHM = new LinkedHashMap<>(tM);
		System.out.println("LLISTAT PER CODI LINKEDHASHMAP (Es manté l'ordre)");
		lHM.entrySet().forEach(System.out::println);
		System.out.println();
		
		System.out.println("LLISTAT NOMÉS DE CLAUS ORDENADES PER ABECEDARI");
		Set<String> keys = tM.keySet();
        for ( String key : keys ) {
           System.out.println( key ); 
        }
        System.out.println();
		     
        System.out.println("LLISTAT HASHSET (No mantè l'ordre)");
        Set<String> keysHS = new HashSet<String>(keys);
        System.out.println(keysHS);
        System.out.println();
	     
        System.out.println("LLISTAT LINKEDHASHSET (SI mantè l'ordre)");
        Set<String> keysLHS = new LinkedHashSet<String>(keys);
        System.out.println(keysLHS);
	}
}
