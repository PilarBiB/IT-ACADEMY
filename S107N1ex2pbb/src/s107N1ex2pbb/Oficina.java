package s107N1ex2pbb;

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
	
	@SuppressWarnings ("@Deprecated")
	public String calcularCostVigilancia() {
		int costVigilant = super. getSuperficie()/5000*3000; 
		return  ("Cost vigilància = " +costVigilant+ " €");
	}
	@Override
	public String toString() {
		
		return "Oficines " +super.toString()+ " / " +calcularCostNeteja()+ " / " +calcularCostVigilancia() ;
	}	
}

