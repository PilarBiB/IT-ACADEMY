package s103N1ex5pbb;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class S103N1ex5pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> llista1 = new ArrayList<Integer>();
			llista1.add(1);
			llista1.add(2);
			llista1.add(3);	
			llista1.add(4);
			llista1.add(5);	
		
		List<Integer> llista2 = new ArrayList<Integer>();
			llista2.add(6);
			llista2.add(7);
			llista2.add(8);	
			llista2.add(9);
			llista2.add(10);
			
		ListIterator it = llista2.listIterator();
			
			while(it.hasNext())
				 it.next();
			while(it.hasPrevious())
				llista1.add((Integer) it.previous());
				
			System.out.println(llista1);	
	}
}
