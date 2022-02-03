package n1exercici2pbb;

public class Vehicle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	parar()	;
	
	Vehicle cotxe1 = new Vehicle();
	
	cotxe1.accelerar();
	                          
	}
	public Vehicle () {
		System.out.println("Soc el constructor");
	}
	public static void parar() {
		System.out.println("Soc el mètode static parar");
	}
	public void accelerar() {
		System.out.println("Soc el mètode accelerar");
	}
}	