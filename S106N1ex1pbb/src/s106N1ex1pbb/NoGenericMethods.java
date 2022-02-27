package s106N1ex1pbb;

public class NoGenericMethods {

	public static void main(String[]args) {
		
		Persona persona1 = new Persona ("Maria", "Barcelona", "Arquitecte");
		Persona persona2 = new Persona ("Bombera","Ana", "Reus");
		Persona persona3 = new Persona ("Girona", "Doctora", "Eva");
	}
}
class Persona {
			
	public Persona(String atribut1, String atribut2, String atribut3) {	
		this.atribut1 = atribut1;
		this.atribut2 = atribut2;
		this.atribut3 = atribut3;
	}
	private String atribut1;
	private String atribut2;
	private String atribut3;
	
	public String getAtribut1() {
		return atribut1;
	}
	public void setAtribut1(String atribut1) {
		this.atribut1 = atribut1;
	}
	public String getAtribut2() {
		return atribut2;
	}
	public void setAtribut2(String atribut2) {
		this.atribut2 = atribut2;
	}
	public String getAtribut3() {
		return atribut3;
	}
	public void setAtribut3(String atribut3) {
		this.atribut3 = atribut3;
	}
}

	