package s103N1ex3pbb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class S103N1ex3pbb {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seguentPersonatge();
		
	}
	public static void seguentPersonatge() {
		Generadora[] personatjes = new Generadora [10];
		
		/*String a = "JEAN-LUC PICARD";
		String b ="SPOCK";
		String c ="JAMES T. KIRK";
		String d ="LEONARD MCCOY";
		String e ="SCOTTY";
		String f ="KHAN";
		String g ="Q";
		String h ="BENJAMIN SISKO";
		String i ="WORF";
		String j ="DATA";*/

		
		personatjes [0] = new Generadora ("JEAN-LUC PICARD"); 
		personatjes [1] = new Generadora ("SPOCK");
		personatjes [2] = new Generadora ("JAMES T. KIRK");
		personatjes [3] = new Generadora ("LEONARD MCCOY");
		personatjes [4] = new Generadora ("SCOTTY");
		personatjes [5] = new Generadora ("KHAN");
		personatjes [6] = new Generadora ("Q");
		personatjes [7] = new Generadora ("BENJAMIN SISKO");
		personatjes [8] = new Generadora ("WORF");
		personatjes [9] = new Generadora ("DATA");

		Scanner sc = new Scanner (System.in);
		
		int opcio;
		int posicio = 0;
		ArrayList personatjesArrayList = new ArrayList();	
		LinkedList personatjesLinkedList = new LinkedList();
		HashSet personatjesHashSet = new HashSet();
		LinkedHashSet personatjesLinkedHashSet = new LinkedHashSet();
		TreeSet personatjesTreeSet = new TreeSet();
		
			do {
				System.out.println("Premer 1 per generar el nom d'un personatge de la serie d'Star Trek i 2 per aturar");	
				opcio = sc.nextInt();
			
				if (opcio==1) {
			
					System.out.println(personatjes [posicio]);
					
					omplirArrayList(personatjes, posicio, personatjesArrayList);
					omplirLinkedList(personatjes, posicio, personatjesLinkedList);
					omplirHashSet(personatjes, posicio, personatjesHashSet);
					omplirLinkedHashSet(personatjes, posicio, personatjesLinkedHashSet);
					omplirTreeSet(personatjes, posicio, personatjesTreeSet);
					
					posicio = posicio+1;
					
					if (posicio == 10) {
						posicio = 0;
					}else {
						continue;
					}
				}else if (opcio==2) {
					System.out.println("LLISTAT DE TOTS ELS PERSONATJES DE L'ARRAY");
			
					for  (int x=0; x<personatjes.length; x++) {
						System.out.print(personatjes[x]+ ", ");
					}
						System.out.println();
						System.out.println();
					System.out.println("LLISTAT DE L'ARRAYLIST GENERAT");
					llistarArrayList(personatjesArrayList);
						System.out.println();
					System.out.println("LLISTAT DEL LINKEDLIST GENERAT");
					llistarLinkedList(personatjesLinkedList);
						System.out.println();
					System.out.println("LLISTAT DEL HASHSET GENERAT");
					llistarHashSet(personatjesHashSet);					
						System.out.println();
					System.out.println("LLISTAT DEL LINKEDSET GENERAT");
					llistarLinkedHashSet(personatjesLinkedHashSet);					
						System.out.println();
					System.out.println("LLISTAT DEL TREESET GENERAT");
					llistarTreeSet(personatjesTreeSet);						
					

					break;
				}else {
					System.out.println("No has escollit una opció valida. Torna a començar");
					seguentPersonatge();
				}
			}while (opcio ==1);
		}
	private static void omplirArrayList(Generadora[] personatjes, int posicio, ArrayList personatjesArrayList) {
	
		personatjesArrayList.add(personatjes[posicio].getNom());
	}
	public  static void llistarArrayList(ArrayList personatjesArrayList) {
			 
		System.out.println(personatjesArrayList);	
	}
	private static void omplirLinkedList(Generadora[] personatjes, int posicio, LinkedList personatjesLinkedList) {
		
		personatjesLinkedList.add(personatjes[posicio].getNom());
	}
	public  static void llistarLinkedList(LinkedList personatjesLinkedList) {
			 
		System.out.println(personatjesLinkedList);	
	}
	private static void omplirHashSet(Generadora[] personatjes, int posicio, HashSet personatjesHashSet) {
		
		personatjesHashSet.add(personatjes[posicio].getNom());
	}
	public  static void llistarHashSet(HashSet personatjesHashSet) {
			 
		System.out.println(personatjesHashSet);	
	}
	private static void omplirLinkedHashSet(Generadora[] personatjes, int posicio, LinkedHashSet personatjesLinkedHashSet) {
		
		personatjesLinkedHashSet.add(personatjes[posicio].getNom());
	}
	public  static void llistarLinkedHashSet(LinkedHashSet personatjesLinkedHashSet) {
			 
		System.out.println(personatjesLinkedHashSet);	
	}
	private static void omplirTreeSet(Generadora[] personatjes, int posicio, TreeSet personatjesTreeSet) {
		
		personatjesTreeSet.add(personatjes[posicio].getNom());
	}
	public  static void llistarTreeSet(TreeSet personatjesTreeSet) {
			 
		System.out.println(personatjesTreeSet);	
	}
}
class Generadora{
	private String nom;
	public Generadora (String nom) {
		this.nom = nom;
	}		
	public String toString() {
		return ""+ nom + "";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;	
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Generadora other = (Generadora) obj;
		return Objects.equals(nom, other.nom);
	}	
	
}
		

