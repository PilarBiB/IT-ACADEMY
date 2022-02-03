package n1exercici5pbb;

public class N1exercici5pbb {

	public static void main(String[] args) {
		
	Animal animal1 = new Animal (1, 2, "Tres");
	
	Animal.correr(animal1.getAtribut1());						// 3 mètodes de la classe mare
	Animal.correr(animal1.getAtribut1(), animal1.getAtribut2());
	Animal.correr(animal1.getAtribut1(), animal1.getAtributTres());
	
	Gat gat1 = new Gat (1, 2, "tres", "Quatre");
	
	Animal.correr(gat1.getAtribut1());							// 3 mètodes de la classe mare
	Animal.correr(gat1.getAtribut1(), gat1.getAtribut2());
	Animal.correr(gat1.getAtribut1(), gat1.getAtributTres());	
	Gat.correr(gat1.getAtributQuatre());						// 1 mètode de la classe filla
	
	}	
}
