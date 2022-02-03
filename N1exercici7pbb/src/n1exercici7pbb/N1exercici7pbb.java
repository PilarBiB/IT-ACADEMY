package n1exercici7pbb;

public class N1exercici7pbb {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		frog1.moure();
		frog1.respirar();
		frog1.menjar();
	
		Amphibian frog2 = new Frog();
		frog1.moure();
		frog1.respirar();
		frog1.menjar();		
		//frog2.saltar(); 	 Amb la generalització/upcasting de l'obgecte Frog a classe Mare desapareix el metode propi de la classe filla
		}
}