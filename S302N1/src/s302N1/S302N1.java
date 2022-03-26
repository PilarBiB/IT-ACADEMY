package s302N1;

public class S302N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable borsa = new Borsa();

	    Observador primer = new Agència_1();
	    Observador segon  = new Agència_2();

	    borsa.afegirObservador(primer);
	    borsa.afegirObservador(segon);

	    borsa.afegirValors("Petroli", 110.60);
	    borsa.afegirValors("Or", 1545.75);
	    System.out.println("===== Actualització Petroli =====");
	    borsa.actualitzarValors("Petroli", 112.34);
	    System.out.println("=======  Actualització Or =======");
	    borsa.actualitzarValors("Or", 1957.60);  
	}
}