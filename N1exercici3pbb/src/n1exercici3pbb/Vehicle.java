package n1exercici3pbb;

public class Vehicle {
	
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.metodeInstancia();
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.metodeInstancia();		
	
	}
	static {
		System.out.println("Bloc inicialitzador static");
	}
	{
	System.out.println("Bloc inicialitzador d'instancia");
	}
	public Vehicle () {
		System.out.println("Soc el mètode constructor");
	}
	public void metodeInstancia() {
		System.out.println("Soc el mètode instancia");
	}
	public static void metodeStatic() {
		System.out.println("Soc un mètode static");
	}
}
	 
	
	
	

