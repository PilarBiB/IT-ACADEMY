package s105N1ex5pbb;

import java.io.*;

public class S105N1ex5pbb {

	public static void main(String[] args) {
			
		Vehicle[] vehicles = new Vehicle[3];   // SERIALITZACIO I DESERIALITZACIO D'UN OBJECTE TIPUS ARRAY
	
		vehicles[0]= new Vehicle ("cotxe1", 4, 1200);
		vehicles[1]= new Vehicle ("cotxe2", 5, 1500);
		vehicles[2]= new Vehicle ("cotxe3", 4, 1800);	
	
		try {
			
			ObjectOutputStream escriureFitxer= new ObjectOutputStream (new FileOutputStream("C:/Users/pilar/eclipse-workspace2/S105N1ex5pbb/vehicle.ser"));
	
			escriureFitxer.writeObject(vehicles);
			
			escriureFitxer.close();
			
			ObjectInputStream recuperarFitxer = new ObjectInputStream( new FileInputStream("C:/Users/pilar/eclipse-workspace2/S105N1ex5pbb/vehicle.ser"));
			
			Vehicle[] recuperats= (Vehicle[]) recuperarFitxer.readObject();      //PER QUE ES UN ARRAY CAL RECUPERAR-LO EN UN ARRAY AMB UN BUCLE FOR
			
			recuperarFitxer.close();
			
			for(Vehicle v : recuperats) { 
				
				System.out.println(v);
			}
			
		}catch(Exception e) {
		}	
	}
}
class Vehicle implements Serializable{
	private String nom;
	private int portes;
	private int potencia;
			
	public Vehicle (String nom, int portes, int potencia) {
		this.nom = nom;
		this.portes = portes; 
		this.potencia = potencia;
	}
	public String toString(){
		return "El " +nom+ " te " +portes+ " portes i una potencia de " +potencia+ " CV";
	}	
}	
			
		
		
		
		
	