package s106N1ex4pbb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMethods{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	List llista1 = f("prova ", 1.1, 1);
	List llista2 = f (2.2,  "prova2 ");
	List llista3 = f ("prova3");
	
	System.out.println(llista1);
	System.out.println(llista2);
	System.out.println(llista3);
		
	}	
	public static <T> List<T> f(T ...t){

		int tSize = 0;

        if (t != null)
           tSize = t.length;

        List<T> listOfElements = new ArrayList<>(tSize);

        if (t != null)
            Collections.addAll(listOfElements, t);

        return listOfElements;
	}
}
