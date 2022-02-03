package s102N1ex5pbb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S102N1ex5pbb {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
	 
		do {
			try {
		        System.out.print("Introdueix el número a:  ");
		        a = sc.nextInt();
		        System.out.print("Introdueix el número b: ");
		        b = sc.nextInt();
		        break;
			} catch (InputMismatchException ime) {
	        System.out.println("Error, entrada incorrecta: " );
	        sc.nextLine();
			}
		} while (true);
	}
}