package n1Exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Decoracio extends Producte {

	private String idDecoracio;
	private String material;
	
	public Decoracio() {
	}
	public Decoracio(String idDecoracio, String nom, String material, double preu_compra, int quantitat) {
		super(nom, preu_compra, quantitat);
		this.idDecoracio = idDecoracio;
		this.material = material;	
	}
	@Override
	public String toString() {
		return " idDecoracio: " + this.idDecoracio  + " Decoració nom: " + this.getNom() + " Material:" + this.material + " Preu de compra: " + this.getPreu_compra() + " € Quantitat: " + this.getQuantitat() ;
	}
	public String getIdDecoracio() {
		return idDecoracio;
	}
	public void setIdDecoracio(String idDecoracio) {
		this.idDecoracio = idDecoracio;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void EscribirFicheroDecoracio(ArrayList<Decoracio> array) {
		
		 FileOutputStream fos = null;
	     ObjectOutputStream salida = null;
		
		try {
			//Se crea el fichero
           fos = new FileOutputStream("Decoracio.txt");                                                 
           salida = new ObjectOutputStream(fos);
		    for(int i = 0; i<array.size(); i++) {
		    	  salida.writeObject(array.get(i));
		     }
		      salida.close();
		  }catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		  }
	}
	
	public ArrayList<Decoracio> LecturaFicheroDecoracio() throws IOException, ClassNotFoundException{
		ArrayList<Decoracio> array = new ArrayList<Decoracio>();
		FileInputStream fis = null;
      
       Decoracio d = new Decoracio();
       
       fis = new FileInputStream("Decoracio.txt");
		ObjectInputStream entrada = new ObjectInputStream(fis);
		
		boolean cont;
		cont =true;
		
		while(cont) {
			try{			
				d = (Decoracio) entrada.readObject();
				array.add(d);
				
			}catch(Exception e){
				cont=false;
			}			
		}
		entrada.close();
		return array;
		
	}
	//Funciones Pilar.
	public static void llistarDecoracio(ArrayList<Decoracio>listaDecoracio)	{
		System.out.println("LLISTAT STOCK DECORACIONS\n");
		for (Decoracio decoracio : listaDecoracio) {
			System.out.println(decoracio.toString());
		}
	}
	
public static int buscarDecoracio(ArrayList<Decoracio>listaDecoracio, String idDecoracio) {
		
		int posicio = -1, i = 0;
		boolean trobat = false;
		
		while (i<listaDecoracio.size() && !trobat) {
			if(listaDecoracio.get(i).getIdDecoracio().equalsIgnoreCase(idDecoracio)){
				posicio = listaDecoracio.indexOf(listaDecoracio.get(i));
				trobat = true;
			}
			i++;
		}
		return posicio;
		
	}
	
	public static void afegirDecoracio(ArrayList<Decoracio>listaDecoracio) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		
		System.out.println("idDecoracio: ");
		String idDecoracio = sc.nextLine();
		
		posicio = buscarDecoracio(listaDecoracio, idDecoracio);
		
		
		if (posicio == -1) {
			
			System.out.println("Nom: ");
			String nom = sc.nextLine();
			
			System.out.println("Material: ");
			String material = sc.nextLine();
			
			System.out.println("Preu de compra: ");
			double preu_compra = sc.nextDouble();
			
			System.out.println("Quantitat: ");
			int quantitat = sc.nextInt();
		
			Decoracio decoracio = new Decoracio(idDecoracio, nom, material, preu_compra, quantitat);
			
			listaDecoracio.add(decoracio);
			
			System.out.println(decoracio.toString());	
		}else{
			System.out.println("Aquest idDecoració ja existeix");
			
		}
	}
	
	public static void modificarDecoracio(ArrayList<Decoracio>listaDecoracio) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		
		System.out.println("Quin es l'idDecoracio que vols modificar? ");
		String idDecoracio = sc.nextLine();
		
		posicio = buscarDecoracio(listaDecoracio,idDecoracio);
		
		if(posicio != -1) {
			Decoracio decoracio = listaDecoracio.get(posicio);
			System.out.println(decoracio.toString());
			System.out.println();
			System.out.println("Nom: ");
			String nom = sc.nextLine();
			decoracio.setNom(nom);
			System.out.println("Material: ");
			String material = sc.nextLine();
			decoracio.setMaterial(material);
			System.out.println("Preu de compra: ");
			double preu_compra = sc.nextDouble();
			decoracio.setPreu_compra(preu_compra);
			System.out.println("Quantitat: ");
			int quantitat = sc.nextInt();
			decoracio.setQuantitat(quantitat);

			System.out.println(decoracio.toString());	
			
		}else {
			System.out.println("L'idDecoració que vols modificar no existeix");
		}
	}
	public static void eliminarDecoracio(ArrayList<Decoracio>listaDecoracio) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		String idDecoracio;
		
		System.out.println("Quin es l'idDecoracio de la decoració que vols eliminar");
		idDecoracio = sc.nextLine();
		
		posicio = buscarDecoracio(listaDecoracio,idDecoracio);
		
		if(posicio == -1) {
			System.out.println("No hi ha cap decoració amb aquest idDecoracio");
		}else {
			listaDecoracio.remove(posicio);
			System.out.println("La decoració amb idDecoracio = " +idDecoracio+ " ha estat eliminada");	
		}
	}
	
	//funcion alfonso
	public EntradaTicket vendreDecoracio(ArrayList<Decoracio> listaDecoracio) {
		Scanner input = new Scanner(System.in);
		Menu m = new Menu();
		System.out.println("¿Quin és l'id de la decoracio que vol vendre?");
		String idDecoracio = input.nextLine();
		
		boolean sortir=false;
		int cantidad=0;
		
		do {				
			try {
				System.out.println("¿Quants en vol?");
				String numero=input.nextLine();
				cantidad = Integer.parseInt(numero);
				sortir = true;
			} catch (Exception e) {
				System.out.println("No es un numero....");
			}	
		}while(!sortir);
		
		EntradaTicket nuevoTicket = new EntradaTicket();
		
		int posicion = -1;
		
		posicion = buscarDecoracio(listaDecoracio, idDecoracio);
		
		if (posicion >=0 && listaDecoracio.get(posicion).getQuantitat()-cantidad >=0) {
			//podemos hacer la venta...
			nuevoTicket.setId(idDecoracio);
			nuevoTicket.setNom(listaDecoracio.get(posicion).getNom());
			nuevoTicket.setPreu(listaDecoracio.get(posicion).getPreu_compra());
			nuevoTicket.setQuantitat(cantidad);
			//Actualizamos la cantidad del array listaArbres
			listaDecoracio.get(posicion).setQuantitat(listaDecoracio.get(posicion).getQuantitat()-cantidad);
		}
		else if (posicion < 0) {
			System.out.println("El Id: "+ idDecoracio + " No existe en Stock");
			input.nextLine();//Hacemos una pausa...	
		}
		else {
			System.out.print("No hay suficiente cantidad del Decoracio: " + listaDecoracio.get(posicion).getIdDecoracio());
			//input.nextLine();//Limpiamos Buffer
			input.nextLine();//Hacemos una pausa...	
		}			
		System.out.println("estamos a punto de devolver un nuevo ticket");
		return nuevoTicket;			
	}	
}

