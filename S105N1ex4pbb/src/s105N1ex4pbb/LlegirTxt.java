package s105N1ex4pbb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LlegirTxt {

	public String llegir(String nom) {
				
		try{
	
			File f = new File(nom);
	
			FileReader	lectorArxiu = new FileReader(f);
	
			BufferedReader br = new BufferedReader(lectorArxiu);
	
			String l="";
	
			String aux="";
	
			while(true){
	
				aux=br.readLine();
	
				if(aux!=null) {
					System.out.println(aux);
	
					l=l+aux+"n";
	
				}else {
					break;
				}
			}
			br.close();
	
			lectorArxiu.close();
	
			return l;
			
		} catch(IOException e) {
	
			System.out.println("Error:"+e.getMessage());
		}
		return null;
	}	
}
