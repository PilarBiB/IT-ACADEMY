package s107N1ex1pbb;

public class Oficina extends Edifici{
	
	public Oficina(String nom, int superficie) {
		super(nom, superficie);
	}
	@Override
	public String calcularCostNeteja() {
		double neteja = (double) super.getSuperficie()/1000;
		neteja = Math.ceil(neteja);
		int costNeteja = (int) (neteja*1800);
		
		return ("Cost neteja = " +costNeteja+ " €");
	}
	@Override
	public String toString() {
		
		return "Oficines " +super.toString()+ " / " +calcularCostNeteja() ;
	}	
}
