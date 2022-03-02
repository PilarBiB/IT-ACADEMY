package s108N1ex7pbb;

import java.lang.FunctionalInterface;

public class S108N1ex7pbb {
  
	@FunctionalInterface
	interface GetPiValue{
	 
	    double getPiValue();
	}
	public class Main {
	
	    public static void main( String[] args ) {
	
	    	GetPiValue ref;
	    
	    ref = () -> 3.1415;
	    
	    System.out.println("Valor de Pi = " + ref.getPiValue());
	    } 
	}
}
