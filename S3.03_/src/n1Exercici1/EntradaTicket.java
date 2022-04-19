package n1Exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class EntradaTicket implements Serializable{
	
	private String id_producte;
	private String nom;
	private double preu;
	private int quantitat;
	
	
	
	public String getId_producte() {
		return id_producte;
	}

	public void setId_producte(String id_producte) {
		this.id_producte = id_producte;
	}

	
	
	public String getId() {
		return id_producte;
	}

	public void setId(String id) {
		this.id_producte = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

	public EntradaTicket(String id, String nom, double preu, int quantitat) {
		
		this.id_producte = id;
		this.nom = nom;
		this.preu = preu;
		this.quantitat = quantitat;
		
	}

	public EntradaTicket() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return " idProducte: " + this.id_producte  + " Producte: " + this.nom + " Preu: " + this.preu + " € Quantitat: " + this.quantitat;
	}
	
	public void EscribirFicheroTicket(ArrayList<ArrayList<EntradaTicket>> array) {
		
		 FileOutputStream fos = null;
	     ObjectOutputStream salida = null;
		
		try {
			//Se crea el fichero
           fos = new FileOutputStream("Ticket.txt");                                                 
           salida = new ObjectOutputStream(fos);
           for(int i=0; i<array.size();i++) {
        	   salida.writeObject(array.get(i));
           }
		      salida.close();
		  }catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		  }
	}
	
	public ArrayList<ArrayList<EntradaTicket>> LecturaFicheroTicket() throws IOException, ClassNotFoundException{
		ArrayList<ArrayList<EntradaTicket>> array = new ArrayList<ArrayList<EntradaTicket>>();
		FileInputStream fis = null;
       
       // Arbre a = new Arbre();
		ArrayList<EntradaTicket> t = new ArrayList<EntradaTicket>();
		
        fis = new FileInputStream("Ticket.txt");
		ObjectInputStream entrada = new ObjectInputStream(fis);
		
		boolean cont;
		cont =true;
		
		while(cont) {
			try{			
				t = (ArrayList<EntradaTicket>) entrada.readObject();
				array.add(t);
				
			}catch(Exception e){
				cont=false;
			}			
		}
		entrada.close();
		
		//System.out.println(array.get(0).get(0).getNom());
		return array;
		
	}
	
}
