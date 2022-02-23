package s105N1ex3pbb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class S105N1ex3pbb {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica l'adreça i el nom del fitxer.txt que vols crear (Ex C:/Users/pilar/Desktop/IT-Academy/texte.txt)");
		String adreça1 = sc.nextLine ();
		crearFitxer(adreça1);
		
		System.out.println("Indica l'adreça del directori que vols llistar alfabeticament (Ex: C:/Users/pilar/Desktop/IT-Academy/Directori 1) ");
		String adreça = sc.nextLine();
		//String adreça = "C:/Users/pilar/Desktop/IT-Academy/Directori 1";
		listFiles(adreça, adreça1);
		
		System.out.println();
		System.out.println("Indica: 1 si vols esborrar el fitxer .txt que has creat // 2 si els vols matenir");
		int opcio = sc.nextInt();
			if (opcio == 1) {
				borrarFitxer(adreça1);
			}	
	}
	public static void listFiles(String adreça, String adreça1) {	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		File dir = new File(adreça);
		StringBuilder myStringBuilder = new StringBuilder();
		
		if(dir.exists()) {
				
			File[] fitxers = dir.listFiles();
			
			if (fitxers != null && fitxers.length > 0) {
						
				for (int x=0; x<fitxers.length; x++) {
					File fitxer = fitxers[x];
			           	Arrays.sort(fitxers);
		           		
		           	if (fitxers[x].isFile()) {
		           		
		            	//System.out.println((fitxers[x]) + " (F) " +(sdf.format(fitxer.lastModified())));
		            	myStringBuilder.append((fitxers[x]) + " (F) " +(sdf.format(fitxer.lastModified())));
		            	escriure(myStringBuilder, adreça1);
		            	
		           	} else if (fitxers[x].isDirectory()) {
		           		
		           		//System.out.println(((fitxers[x].getAbsolutePath())+ " (D) " +(sdf.format(fitxer.lastModified()))));
		           		listFiles(fitxers[x].getAbsolutePath(), adreça1);
		           		myStringBuilder.append(((fitxers[x].getAbsolutePath())+ " (D) " +(sdf.format(fitxer.lastModified()))));
		           		escriure(myStringBuilder, adreça1);
		            }
				}			 					 
			}else {
				
				//System.out.println("" +adreça+ " (Directori buit)");
				myStringBuilder.append("" +adreça+ " (Directori buit)");
				escriure(myStringBuilder, adreça1);
			}
		}else { 
			//System.out.println("L'adreça " +adreça+ " no s'ha trobat");
			myStringBuilder.append("L'adreça " +adreça+" no s'ha trobat");
			escriure(myStringBuilder, adreça1);
		}
		
	}
	public static String crearFitxer(String adreça1) {
		
		File fitxer = new File (adreça1);
		try {
			fitxer.createNewFile();	    
		} catch (IOException ioe) {
		 ioe.printStackTrace();
		}
		return adreça1;
	}
	public static void borrarFitxer(String adreça1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Has esborrar el fitxer txt que has creat amb la adreça i el nom " +adreça1);
		File fitxer = new File (adreça1);
		fitxer.delete();		
	}
	public static void escriure(StringBuilder myStringBuilder, String adreça1) {
		String str= myStringBuilder.toString();
		str= myStringBuilder.toString();
		System.out.println(str);
		try {
			
			String filePath = adreça1;
			FileWriter fw = new FileWriter ( filePath, true);
			fw.write(str);
			fw.close();
		}catch(Exception e)
			{System.out.println(e);
		}
	}
}
