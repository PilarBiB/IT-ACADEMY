package s105N1ex1pbb;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class S105N1ex1pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica l'adreça del directori que vols llistar alfabeticament (Ex: C:\\Users\\pilar\\eclipse-workspace2 )");
		String adreça = sc.nextLine();
		File dir = new File(adreça);
		String[] fichers = dir.list();
		
		if(dir.exists()) {
			if(dir.isDirectory()){
		
				if (fichers.length == 0) {
					System.out.println("No hi ha fitxers en el directorio especificat");
				}else { 
					Arrays.sort(fichers);
					for (int x=0;x<fichers.length;x++)
				    System.out.println(fichers[x]);	
				}
			}else {
				System.out.println("L'adreça no corespont a un directori");
			}
		}else { 
			System.out.println("El directori no existeix");
		}	
	}
}
