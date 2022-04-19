package n1Exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Flor extends Producte {
	
	private String idFlor;
	private String color;
	
	public Flor() {
	}
	public Flor( String idFlor, String nom, String color, double preu_compra, int quantitat) {
		super(nom, preu_compra, quantitat);
		this.idFlor = idFlor;
		this.color = color;	
	}
	@Override
	public String toString() {
		return " idFlor: " + this.idFlor  + " Flor nom: " + this.getNom() + " Color:" + this.color + " Preu de compra: " + this.getPreu_compra() + " € Quantitat: " + this.getQuantitat() ;
	}
	public String getIdFlor() {
		return idFlor;
	}
	public void setIdFlor(String idFlor) {
		this.idFlor = idFlor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void EscribirFicheroFlor(ArrayList<Flor> array) {
		
		 FileOutputStream fos = null;
	     ObjectOutputStream salida = null;
		
		try {
			//Se crea el fichero
           fos = new FileOutputStream("Flor.txt");                                                 
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
	
	public ArrayList<Flor> LecturaFicheroFlor() throws IOException, ClassNotFoundException{
		ArrayList<Flor> array = new ArrayList<Flor>();
		FileInputStream fis = null;
      
       Flor f = new Flor();
       
       fis = new FileInputStream("Flor.txt");
		ObjectInputStream entrada = new ObjectInputStream(fis);
		
		boolean cont;
		cont =true;
		
		while(cont) {
			try{			
				f = (Flor) entrada.readObject();
				array.add(f);
				
			}catch(Exception e){
				cont=false;
			}			
		}
		entrada.close();
		return array;
		
	}
	//Funciones Pilar.
	public static void llistarFlors(ArrayList<Flor>listaFlor)	{
		System.out.println("LLISTAT STOCK FLORS\n");
		for (Flor flor : listaFlor) {
			System.out.println(flor.toString());
		}
	}
	
public static int buscarFlor(ArrayList<Flor>listaFlor, String idFlor) {
		
		int posicio = -1, i = 0;
		boolean trobat = false;
		
		while (i<listaFlor.size() && !trobat) {
			if(listaFlor.get(i).getIdFlor().equalsIgnoreCase(idFlor)){
				posicio = listaFlor.indexOf(listaFlor.get(i));
				trobat = true;
			}
			i++;
		}
		return posicio;
		
	}
	
	public static void afegirFlor(ArrayList<Flor>listaFlor) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		
		System.out.println("idFlor: ");
		String idFlor = sc.nextLine();
		
		posicio = buscarFlor(listaFlor, idFlor);
		
		
		if (posicio == -1) {
			
			System.out.println("Nom: ");
			String nom = sc.nextLine();
			
			System.out.println("Color: ");
			String color = sc.nextLine();
			
			System.out.println("Preu de compra: ");
			double preu_compra = sc.nextDouble();
			
			System.out.println("Quantitat: ");
			int quantitat = sc.nextInt();
		
			Flor flor = new Flor(idFlor, nom, color, preu_compra, quantitat);
			
			listaFlor.add(flor);
			
			System.out.println(flor.toString());	
		}else{
			System.out.println("Aquest idFlor ja existeix");
			
		}
	}
	
	public static void modificarFlor(ArrayList<Flor>listaFlor) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		
		System.out.println("Quin es l'idFlor que vols modificar? ");
		String idFlor = sc.nextLine();
		
		posicio = buscarFlor(listaFlor,idFlor);
		
		if(posicio != -1) {
			Flor flor = listaFlor.get(posicio);
			System.out.println(flor.toString());
			System.out.println();
			System.out.println("Nom: ");
			String nom = sc.nextLine();
			flor.setNom(nom);
			System.out.println("Color: ");
			String color = sc.nextLine();
			flor.setColor(color);
			System.out.println("Preu de compra: ");
			double preu_compra = sc.nextDouble();
			flor.setPreu_compra(preu_compra);
			System.out.println("Quantitat: ");
			int quantitat = sc.nextInt();
			flor.setQuantitat(quantitat);

			System.out.println(flor.toString());	
			
		}else {
			System.out.println("L'idFlor que vols modificar no existeix");
		}		
	}
	
	public static void eliminarFlor(ArrayList<Flor>listaFlor) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		String idFlor;
		
		System.out.println("Quin es l'idFlor que vols eliminar");
		idFlor = sc.nextLine();
		
		posicio = buscarFlor(listaFlor,idFlor);
		
		if(posicio == -1) {
			System.out.println("No hi ha cap flor amb aquest idFlor");
		}else {
			listaFlor.remove(posicio);
			System.out.println("La flor amb idFlor = " +idFlor+ " ha estat eliminada");	
		}
	}
	
	//funcion alfonso
	public EntradaTicket vendreFlor(ArrayList<Flor> listaFlor) {
		Scanner input = new Scanner(System.in);
		Menu m = new Menu();
		System.out.println("¿Quin és l'id de la Flor que vol vendre?");
		String idFlor = input.nextLine();
		
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
		
		posicion = buscarFlor(listaFlor, idFlor);
		
		if (posicion >=0 && listaFlor.get(posicion).getQuantitat()-cantidad >=0) {
			//podemos hacer la venta...
			nuevoTicket.setId(idFlor);
			nuevoTicket.setNom(listaFlor.get(posicion).getNom());
			nuevoTicket.setPreu(listaFlor.get(posicion).getPreu_compra());
			nuevoTicket.setQuantitat(cantidad);
			//Actualizamos la cantidad del array listaArbres
			listaFlor.get(posicion).setQuantitat(listaFlor.get(posicion).getQuantitat()-cantidad);
		}
		else if (posicion < 0) {
			System.out.println("El Id: "+ idFlor + " No existe en Stock");
			input.nextLine();//Hacemos una pausa...	
		}
		else {
			System.out.print("No hay suficiente cantidad del Flor: " + listaFlor.get(posicion).getIdFlor());
			//input.nextLine();//Limpiamos Buffer
			input.nextLine();//Hacemos una pausa...	
		}			
		System.out.println("estamos a punto de devolver un nuevo ticket");
		return nuevoTicket;			
	}	
}
