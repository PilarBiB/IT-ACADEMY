package s103N1ex1pbb;

import java.util.ArrayList;

public class S103N1ex1pbb {

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
		listMonths.add (new Month("Setembre"));
		listMonths.add (new Month("Octubre"));
		listMonths.add (new Month("Novembre"));		
		listMonths.add (new Month("Desembre"));
		
		
		for (Month m : listMonths) {
			System.out.println(m.toString());
		}
		listMonths.add(7, new Month("Agost"));
		
		System.out.println();
		
		for (Month m : listMonths) {
			System.out.println(m.toString());
		}
	}
}
class Month {
	
	private String name;
	
	public Month (String name) {
		this.name = name;
	}		
	public String toString() {
		return ""+ name + "";
	}	
}

	
