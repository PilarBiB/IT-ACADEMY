package s303N1;

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
}
