package n1exercici8pbb;

public class N1exercici8pbb {

	public static void main(String[] args) {
			
		Frog frog1 = new Frog();
		frog1.moure();
		frog1.respirar();
		frog1.menjar();
		frog1.saltar();
		
		//Utilitza els mètodes propis de classe filla
		
	System.out.println("\n");
	
		Amphibian frog2 = new Frog();
		frog2.moure();
		frog2.respirar();
		frog2.menjar();
		//frog2.saltar();     	No existeix
		
		//Si es mantè la generalització
	}
}
