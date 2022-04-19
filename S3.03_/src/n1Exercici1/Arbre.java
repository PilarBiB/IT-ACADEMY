package n1Exercici1;


import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Arbre extends Producte {
	
	private String idArbre;
	private double alçaria;

	public Arbre() {
	}
	public Arbre(String idArbre, String nom, double alçaria, double preu_compra, int quantitat) {
		super(nom, preu_compra, quantitat);
		this.idArbre = idArbre;
		this.alçaria = alçaria;
	}
	@Override
	public String toString() {
		return " idArbre: " + this.idArbre  + " Arbre nom: " + this.getNom() + " Alçaria:" + this.alçaria + " Preu de compra: " + this.getPreu_compra() + " € Quantitat: " + this.getQuantitat() ;
	}
	public String getIdArbre() {
		return idArbre;
	}
	public void setIdArbre(String idArbre) {
		this.idArbre = idArbre;
	}
	public double getAlçaria() {
		return alçaria;
	}
	public void setAlçaria(double alçaria) {
		this.alçaria = alçaria;
	}
	
	public void EscribirFicheroArbol(ArrayList<Arbre> array) {
		
		 FileOutputStream fos = null;
	     ObjectOutputStream salida = null;
		
		try {
			//Se crea el fichero
            fos = new FileOutputStream("Arbre.txt");                                                 
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
	
	public ArrayList<Arbre> LecturaFicheroArboles() throws IOException, ClassNotFoundException{
		ArrayList<Arbre> array = new ArrayList<Arbre>();
		FileInputStream fis = null;
       
        Arbre a = new Arbre();
        
        fis = new FileInputStream("Arbre.txt");
		ObjectInputStream entrada = new ObjectInputStream(fis);
		
		boolean cont;
		cont =true;
		
		while(cont) {
			try{			
				a = (Arbre) entrada.readObject();
				array.add(a);
				
			}catch(Exception e){
				cont=false;
			}			
		}
		entrada.close();
		return array;
		
	}
	
	public boolean DiponibilidadArbre(ArrayList<Arbre> a, String id_arbre, int cantidad){
		boolean respuesta=false;
        for (int i = 0; i < a.size(); i++) {
            //buscar disponibilidad
            if (a.get(i).getIdArbre() == id_arbre & a.get(i).getQuantitat() - cantidad >=0){
                respuesta= true;
                System.out.println("Stock.."+a.get(i).getQuantitat());
            }
           
         }
		return respuesta;

    }
	
	public ArrayList<Arbre> ModificarStockArbre(ArrayList<Arbre> a, String id_arbre, int cantidad){
        for (int i = 0; i < a.size(); i++) {
           if (a.get(i).getIdArbre() == id_arbre){
              a.get(i).setQuantitat(a.get(i).getQuantitat()-cantidad);
              System.out.println("chiiii");
           }
        }        
        return a;   
   }
	//Funciones de Pilar.
	public static void llistarArbres(ArrayList<Arbre>listaArboles)	{
		System.out.println("LLISTAT STOCK ARBRES\n");
		for (Arbre arbre : listaArboles) {
			System.out.println(arbre.toString());
		}
	}
	
	public static int buscarArbre(ArrayList<Arbre>listaArboles, String idArbre) {
		
		int posicio = -1, i = 0;
		boolean trobat = false;
		
		while (i<listaArboles.size() && !trobat) {
			if(listaArboles.get(i).getIdArbre().equalsIgnoreCase(idArbre)){
				posicio = listaArboles.indexOf(listaArboles.get(i));
				trobat = true;
			}
			i++;
		}
		return posicio;	
	}
	
	public static void afegirArbre(ArrayList<Arbre>listaArboles) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		
		System.out.println("idArbre: ");
		String idArbre = sc.nextLine();
	
		posicio = buscarArbre(listaArboles, idArbre);
		
		
		if (posicio == -1) {
			
			System.out.println("Nom: ");
			String nom = sc.nextLine();
			
			System.out.println("Alçària: ");
			double alçaria = sc.nextDouble();
			
			System.out.println("Preu de compra: ");
			double preu_compra = sc.nextDouble();
			
			System.out.println("Quantitat: ");
			int quantitat = sc.nextInt();
		
			Arbre arbre = new Arbre(idArbre, nom, alçaria, preu_compra, quantitat);
			
			listaArboles.add(arbre);
			
			System.out.println(arbre.toString());	
		}else{
			System.out.println("Aquest idArbre ja existeix");
			
		}
	}
	
	public static void modificarArbre(ArrayList<Arbre>listaArboles) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		
		System.out.println("Quin es l'idArbre que vols modificar? ");
		String idArbre = sc.nextLine();
		
		posicio = buscarArbre(listaArboles,idArbre);
		
		if(posicio != -1) {
			Arbre arbre = listaArboles.get(posicio);
			System.out.println(arbre.toString());
			System.out.println();
			System.out.println("Nom: ");
			String nom = sc.nextLine();
			arbre.setNom(nom);
			System.out.println("Alçària: ");
			double alçaria = sc.nextDouble();
			arbre.setAlçaria(alçaria);
			System.out.println("Preu de compra: ");
			double preu_compra = sc.nextDouble();
			arbre.setPreu_compra(preu_compra);
			System.out.println("Quantitat: ");
			int quantitat = sc.nextInt();
			arbre.setQuantitat(quantitat);

			System.out.println(arbre.toString());	
			
		}else {
			System.out.println("L'idArbre que vols modificar no existeix");
		}
	}
	
	public static void eliminarArbre(ArrayList<Arbre>listaArboles) {
		Scanner sc = new Scanner (System.in);
		int posicio;
		String idArbre;
		
		System.out.println("Quin es l'idArbre que vols eliminar");
		idArbre = sc.nextLine();
		
		posicio = buscarArbre(listaArboles,idArbre);
		
		if(posicio == -1) {
			System.out.println("No hi ha cap arbre amb aquest idArbre");
		}else {
			listaArboles.remove(posicio);
			System.out.println("L'Arbre amb idArbre = " +idArbre+ " ha estat eliminat");	
		}
	}
    
	//funcion alfonso
		public EntradaTicket vendreArbre(ArrayList<Arbre> listaArbre) {
			Scanner input = new Scanner(System.in);
			Menu m = new Menu();
			System.out.println("¿Quin és l'id de l'arbre que vol vendre?");
			String idArbre = input.nextLine();
			
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
			
			posicion = buscarArbre(listaArbre, idArbre);
			
			if (posicion >=0 && listaArbre.get(posicion).getQuantitat()-cantidad >=0) {
				//podemos hacer la venta...
				nuevoTicket.setId(idArbre);
				nuevoTicket.setNom(listaArbre.get(posicion).getNom());
				nuevoTicket.setPreu(listaArbre.get(posicion).getPreu_compra());
				nuevoTicket.setQuantitat(cantidad);
				//Actualizamos la cantidad del array listaArbres
				listaArbre.get(posicion).setQuantitat(listaArbre.get(posicion).getQuantitat()-cantidad);
			}
			else if (posicion < 0) {
				System.out.println("El Id: "+ idArbre + " No existe en Stock");
				input.nextLine();//Hacemos una pausa...	
			}
			else {
			
				System.out.println("No hay suficiente cantidad del Arbol: " + listaArbre.get(posicion).getIdArbre());
				System.out.println("El Stock es: "+ listaArbre.get(posicion).getQuantitat());
				input.nextLine();//Hacemos una pausa...	
			}			
			//System.out.println("Creamos un nuevo ticket");
			return nuevoTicket;			
		}	
}



