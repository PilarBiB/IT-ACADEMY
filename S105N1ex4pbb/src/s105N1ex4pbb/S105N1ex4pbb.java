package s105N1ex4pbb;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class S105N1ex4pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica l'adreça del directori que vols llistar alfabeticament (Ex: C://Users/pilar/eclipse-workspace2 )");
		String adreça = sc.nextLine();
		//String adreça = "C:\\Users\\pilar\\Desktop\\IT-Academy\\Directori 1";
		System.out.println("LLISTAT DIRECTORIS");
		
		listFiles(adreça);
		System.out.println();
		System.out.println("LECTURA FITXER TXT");
		llegirArxiu();
	}
	public static void listFiles(String adreça) {	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		File dir = new File(adreça);
			
		if(dir.exists()) {
				
			File[] fitxers = dir.listFiles();
			
			if (fitxers != null && fitxers.length > 0) {
						
				for (int x=0; x<fitxers.length; x++) {
					File fitxer = fitxers[x];
			           	Arrays.sort(fitxers);
		           		
		           	if (fitxers[x].isFile()) {
		           		
		            	System.out.println((fitxers[x]) + " (F) " +(sdf.format(fitxer.lastModified())));
		            		
		           	} else if (fitxers[x].isDirectory()) {
		           		
		           		System.out.println(((fitxers[x].getAbsolutePath())+ " (D) " +(sdf.format(fitxer.lastModified()))));
		           		listFiles(fitxers[x].getAbsolutePath());
		            }
				}			 					 
			}else {
				
				System.out.println("" +adreça+ " (Directori buit)");
			}
		}else { 
			System.out.println("L'adreça " +adreça+ " no s'ha trobat");
		}	
	}
	public static void llegirArxiu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica l'adreça del directori que vols llistar alfabeticament (Ex: C:/Users/pilar/Desktop/IT-Academy/Directori 1/texte.txt )");
		String adreça = sc.nextLine();
		LlegirTxt b = new LlegirTxt ();
		b.llegir(adreça);
	}
}
