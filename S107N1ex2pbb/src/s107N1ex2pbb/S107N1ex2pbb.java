package s107N1ex2pbb;

import java.util.ArrayList;

public class S107N1ex2pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Edifici> edificis = new ArrayList<Edifici>();
		
		Hotel Hilton = new Hotel("Hilton", 10000, 120);
		Oficina Mafre = new Oficina("Mafre",10000);
		
		edificis.add(Hilton);
		edificis.add(Mafre);
		
		llistar(edificis);
		
	}
	public static void llistar(ArrayList<Edifici>edificis) {
		for (Edifici list : edificis){
			System.out.println(list);
		}
	}
}
