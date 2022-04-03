package s303N1;

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
}
