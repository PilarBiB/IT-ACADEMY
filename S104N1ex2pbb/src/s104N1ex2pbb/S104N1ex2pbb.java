package s104N1ex2pbb;

import java.util.Scanner;

public class S104N1ex2pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dni; 
		
		System.out.println("Introdueix el teu DNI sense lletra");
		Scanner sc = new Scanner(System.in); 
		dni = sc.nextInt();
		
		CalculLletraDni(dni);
		
	}	
		
	public static char CalculLletraDni( int dni) {
		String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
		char lletra; 
		final char DIV = 23;
		int cocient;
	
		cocient = dni % DIV;
		
		lletra = cadena.charAt(cocient);
		System.out.println(lletra);
		return lletra;
	}
}

