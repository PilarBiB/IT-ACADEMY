package n1exercici4pbb;

public class Vehicle {
	
	private static final int rodes = 4 ; // He de donar-li un valor aquí
	private static int portes = 4;       //Puc accedir a puertas sense crear una instancia de classe pq es atribut static de clase.
									 //No cal donar-li valor i es compartit
	
	public static void main(String[] args) {
		
	//rodes = 3; (NO funciona pq no puc assignar un valor pq final)
				
	
	Vehicle cotxe1 = new Vehicle ("cotxe1",5,1000); 
	System.out.println(cotxe1);
	
	Vehicle cotxe2 = new Vehicle("cotxe2", 8,2000); 
	System.out.println(cotxe2);

	}
	private final int potencia;
	private String nom;
	
	public Vehicle (String nom, int rodes, int potencia) {
		this.nom = nom;
		//this.rodes = rodes; (No el puc possar pq es atribut de classe)
		this.potencia = 1500;
		
	}
	public String toString()
	{
		return "El " +nom+ " te " +rodes+ " rodes, " +portes+ " portes i una potencia de " +potencia+ " CV";
	}	
}	
	