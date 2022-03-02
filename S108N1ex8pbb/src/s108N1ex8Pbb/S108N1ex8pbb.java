package s108N1ex8Pbb;

public class S108N1ex8pbb {

	@FunctionalInterface
	interface Reverse {
		
	    String reverse(String n);
	}

	public class Main {

	    public static void main( String[] args ) {

	       Reverse ref = (str) -> 	{ 	String resultat = "";
	            						for (int i = str.length()-1; i >= 0 ; i--)
	            						resultat += str.charAt(i);
	            						return resultat;
	            					};
	       
	        System.out.println("Cadena a l'inrevés = " + ref.reverse("Bona tarda"));
	    }
	}
}
