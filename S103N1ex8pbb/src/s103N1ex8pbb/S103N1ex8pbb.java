package s103N1ex8pbb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class S103N1ex8pbb {
	
	static LinkedHashMap<String, Integer>lHM = new LinkedHashMap<>();
	
	public static <T> void main(String[] args) {
	// TODO Auto-generated method stub
	
		lHM.put("Luis",1);
		lHM.put("Julio",2);
		lHM.put("Lola",3);
		lHM.put("Carlos",4);
		lHM.put("Amaya",5);
	
		lHM.entrySet().forEach(System.out::println);
		System.out.println();
		
		ordenarClau();

	}
	public static void ordenarClau(){
		ArrayList<String> clausOrden
	    = new ArrayList<String>(lHM.keySet());
		
	    Collections.sort(clausOrden);
    
	    LinkedHashMap <String,Integer> nouLHM = new LinkedHashMap();
    
	    for (String x : clausOrden)
	    	nouLHM.put(x,lHM.get(x));
    	
	    nouLHM.entrySet().forEach(System.out::println);
	    System.out.println();    
	}	
}
