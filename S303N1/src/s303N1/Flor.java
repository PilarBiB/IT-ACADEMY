package s303N1;

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
}
