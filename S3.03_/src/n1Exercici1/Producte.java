package n1Exercici1;

import java.io.Serializable;
import java.util.ArrayList;


public class Producte  implements Serializable{
	
	private String nom;
	private double preu_compra;
	private int quantitat;

	public Producte() {
	}
	public Producte(String nom, double preu_compra, int quantitat) {
		
		this.nom = nom;
		this.preu_compra = preu_compra;
		this.quantitat = quantitat;
	}
	
	public String toString() {
		return "Nom: " + this.getNom() + "\n"
				+ "Preu de compra: " + this.getPreu_compra() + " €\n" 
				+ "Quantitat: " + this.getQuantitat() + "\n";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPreu_compra() {
		return preu_compra;
	}
	public void setPreu_compra(double preu_compra) {
		this.preu_compra = preu_compra;
	}
	public int getQuantitat() {
		return quantitat;
	}
	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}
	
	public <T> boolean buscarProductor(ArrayList<T> t, String Id, float cantidad) {
		
		System.out.println(t.get(0).toString());
		
		for(T m : t) {
			//System.out.println( m);
		}
		return true;
		
	}
	
	public double valorFloristeria(ArrayList<Arbre> a,ArrayList<Flor> f, ArrayList<Decoracio> d) {
		double resultado=0;
		for(int i=0;i<a.size();i++) {
			resultado = resultado + a.get(i).getQuantitat()*a.get(i).getPreu_compra();
		}
		for(int i =0; i<f.size();i++) {
			resultado = resultado + f.get(i).getQuantitat()*f.get(i).getPreu_compra();
		}
		for(int i =0; i<d.size();i++) {
			resultado = resultado + d.get(i).getQuantitat()*d.get(i).getPreu_compra();
					
		}
		return resultado;
	}
	
	public double beneficios(ArrayList<ArrayList<EntradaTicket>> e) {
		double b=0;
		for(int i=0; i<e.size(); i++) {
			for(int j=0; j<e.get(i).size();j++) {
				b=b+e.get(i).get(j).getQuantitat()*e.get(i).get(j).getPreu();
			}							
		}
		//El bº obtenido es un 30% de lo que hemos vendido....
		return b*0.3;
		
	}
}
	

