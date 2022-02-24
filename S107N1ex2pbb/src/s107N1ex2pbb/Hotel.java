package s107N1ex2pbb;

public class Hotel extends Edifici {
	private int habitacions;
	
	public Hotel(String nom, int superficie, int habitacions) {
		super(nom, superficie);
		this.habitacions = habitacions;	
	}
	
	public int getHabitacions() {
		return habitacions;
	}

	public void setHabitacions(int habitacions) {
		this.habitacions = habitacions;
	}
	@Override
	public String calcularCostNeteja() {
		double neteja = (double) super.getSuperficie()/1000;
		neteja = Math.ceil(neteja);
		int costNeteja = (int) (neteja*1800)+(100*habitacions);
		
		return ("Cost neteja = " +costNeteja+ " €");
	}
	@Override
	public String toString() {
		
		return "Hotel " +super.toString()+ " / " +calcularCostNeteja() ;
	}
}