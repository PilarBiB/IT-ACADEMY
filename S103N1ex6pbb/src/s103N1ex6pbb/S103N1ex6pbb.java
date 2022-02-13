package s103N1ex6pbb;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class S103N1ex6pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> linkedLists = new LinkedList<Integer>();	
	
		linkedLists.add(1);
		linkedLists.add(2); 
	 
		System.out.println(linkedLists);
		afegirNum(linkedLists);
	}
	public static void afegirNum(LinkedList linkedLists) {
		Scanner sc = new Scanner (System.in);
		int opcio;
		do {
			System.out.println("Premer 1 si vols inserir un valor al mig de la llista i 2 si no vols afegir mes valors");
			opcio = sc.nextInt();
			if (opcio==1) {
					System.out.println("Quin valor vols afegir al mitg de la llista?");
					int a = sc.nextInt();
					linkedLists.add((linkedLists.size())/2,a);
					System.out.println("Nova llista amb el valor inserit");
					System.out.println(linkedLists);
			}else if (opcio==2) {
				break;
			}else {
				System.out.println("No has escollit una opció valida.");
				afegirNum(linkedLists);
			}
		}while (opcio==1);
	}
}	 
	
		 
		 
		 
		
		 
	

