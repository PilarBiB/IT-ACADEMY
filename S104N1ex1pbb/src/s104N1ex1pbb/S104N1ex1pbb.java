package s104N1ex1pbb;

import java.text.DateFormatSymbols;
import java.util.ArrayList;

public class S104N1ex1pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList  <Month> listMonths = new ArrayList <Month>();
		listMonths.add (new Month("Gener"));
		listMonths.add (new Month("Febrer"));
		listMonths.add (new Month("Març"));
		listMonths.add (new Month("Abril"));
		listMonths.add (new Month("Maig"));
		listMonths.add (new Month("Juny"));
		listMonths.add (new Month("Juliol"));
		listMonths.add (new Month("Agost"));
		listMonths.add (new Month("Setembre"));
		listMonths.add (new Month("Octubre"));
		listMonths.add (new Month("Novembre"));		
		listMonths.add (new Month("Desembre"));
		
		for (Month m : listMonths) {
			System.out.println(m.toString());
		}
		
		System.out.println(calcPosicions(listMonths));
		
		
		System.out.println(posicioSet(listMonths));
	}	
		/*if(  listMonths == null) {
			System.out.println("The array is null");
		}else {
			System.out.println("The array is not null");
		}*/
	public static int calcPosicions(ArrayList  <Month> listMonths){
		int posicions = (listMonths.size());
		return posicions;
	}
	public static String posicioSet(ArrayList  <Month> listMonths){
		String mesVuit = listMonths.get(7).getName();
		return mesVuit;
	}
	
	}
class Month {
	
	private String name;
	
	public Month (String name) {
		this.name = name;
	}		
	public String getName() {
		
		return name;
	}
	public String toString() {
		return ""+ name + "";
	}	
}

	

		
		 
     