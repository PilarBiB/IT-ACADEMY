package s302N1;

import java.util.Map;

public class Agència_2 implements Observador {

	    public void actualitzarValors(Map<String, Double> valors) {
	        System.out.println("Agència_2: avís canvis en Borsa:");
	        valors.forEach((simbol, valor) -> System.out.println(simbol + " - $" + valor));
	    }			
}
