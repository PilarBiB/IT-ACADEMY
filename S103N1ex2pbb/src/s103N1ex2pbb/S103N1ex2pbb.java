package s103N1ex2pbb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class S103N1ex2pbb {

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
		
		listMonths.add(7, new Month("Agost"));
			
	    HashSet<Month> llistaMonths = new HashSet<>(listMonths);
	  
	    for (Month m : llistaMonths) {
	    	System.out.println(m.toString());
	    }
	    llistaMonths.add(new Month("Gener"));
	    
	    System.out.println();
	    for (Month m : llistaMonths) {
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
	public String getName() {
		return this.name;
		}
	/*public boolean equals(Object obj) {
		if(obj instanceof Month) {
			Month month2 = (Month)obj;
			if (this.name == month2.name) {
				return true;
			}else {
				return false;
			}												MANUAL					
		}else {
			return false;
		}
	}
		public int hashCode() {
		return this.getName().hashCode();
		}	*/
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)                              // AUTOMATIC ECLIPSE
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}
	
}
