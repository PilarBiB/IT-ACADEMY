package n1exercici5pbb;

public class Animal {
	
	private int atribut1;
	private int atribut2;
	private String atributTres;
	
	public Animal ( int atribut1, int atribut2, String atributTres) {
		this.atribut1 = atribut1;
		this.atribut2 = atribut2;
		this.atributTres = atributTres;
	}
	public int getAtribut1 () {
		return atribut1;
	}
	public int getAtribut2 () {
		return atribut2;
	}
	public String getAtributTres () {
		return atributTres;
	}
	public static void correr(int atribut1) {
		
		System.out.println("Soc el metode sobrecarregat 1/3 de la classe mare");
	}
	public static void correr(int atribut1, int atribut2) {
		
		System.out.println("Soc el metode sobrecarregat 2/3 de la classe mare");
	}
	public static void correr(int atribut1, String atributTres) {
	
	System.out.println("Soc el metode sobrecarregat 3/3 de la clase mare");
	}

	
}
	
	
	
	
	
	
	
	