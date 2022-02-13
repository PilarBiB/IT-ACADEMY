package s103N1ex4pbb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class S103N1ex4pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ARRAYLIST");
		ArrayList<String> AL = new ArrayList<String>();
	
		for (int i=1; i<=10; i++){
			AL.add("Element "+i); 
		}	
		iterador (AL);	
		
		System.out.println();
		System.out.println("LINKEDLIST");
		LinkedList<String> LL = new LinkedList<String>();
		for (int i=1; i<=10; i++){
			LL.add("Element "+i);
		}	
		iterador (LL);	
		
		System.out.println();
		System.out.println("HASHSET");
		HashSet<String> HS = new HashSet<String>();
		for (int i=1; i<=10; i++){
			HS.add("Element "+i); 
		}	
		iterador (HS);	
		
		System.out.println();
		System.out.println("LINKEDHASHSET");
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		for (int i=1; i<=10; i++){
			LHS.add("Element "+i); 
		}
		iterador (LHS);	
		
		System.out.println();
		System.out.println("TREESET");
		TreeSet<String> TS = new TreeSet<String>();
		for (int i=1; i<=10; i++){
			TS.add("Element "+i);
		}	
		iterador (TS);					
	}
	public static void iterador(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()){
			System.out.print("/"+it.next().toString());
		}	
	}
}

