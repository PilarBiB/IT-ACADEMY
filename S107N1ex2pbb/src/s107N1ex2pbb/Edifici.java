package s107N1ex2pbb;

public abstract class Edifici {

	private String nom;
	private int superficie;	
	
	public Edifici (String nom, int superficie) {
		this.nom = nom;
		this.superficie = superficie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public abstract String calcularCostNeteja();
	
	public String toString() {
		return nom+ " / "+ superficie+ " m2 de superficie";
	}	
}
