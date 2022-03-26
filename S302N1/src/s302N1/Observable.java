package s302N1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Observable {
	
	private List<Observador> observadors = new ArrayList<Observador>();

    public void afegirObservador(Observador observador) {
        observadors.add(observador);
    }

    public void notificacioValors(Map<String, Double> valorsList) {
        for (Observador agència : observadors) {
           agència.actualitzarValors(valorsList);
        }
    }	
    public abstract void afegirValors(String valorsSimbol, Double preu);

    public abstract void actualitzarValors(String valorsSimbol, Double preu);
}
