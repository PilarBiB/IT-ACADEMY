package n1exercici5pbb;

public class Gat extends Animal  {
	
	private String atributQuatre;
	
	public Gat(int atribut1, int atribut2, String atributTres, String atributQuatre)	{
	super(atribut1, atribut2, atributTres);
	this.atributQuatre = atributQuatre;
	}
	public String getAtributQuatre () {
		return atributQuatre;
	}
	public static void correr ( String atributQuatre) {
		System.out.println("Soc el mètode sobrecarregat 4 de la classe filla Gat");
	}
}
