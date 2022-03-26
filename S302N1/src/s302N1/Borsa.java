package s302N1;

import java.util.HashMap;
import java.util.Map;

public class Borsa extends Observable{
	
	private Map<String, Double> valorsList = new HashMap<>();

    public void afegirValors(String valorsSimbol, Double preu) {
        valorsList.put(valorsSimbol, preu);
    }
    public void actualitzarValors(String valorsSimbol, Double preu) {
        valorsList.put(valorsSimbol, preu);
        notificacioValors(valorsList);
    }
}
