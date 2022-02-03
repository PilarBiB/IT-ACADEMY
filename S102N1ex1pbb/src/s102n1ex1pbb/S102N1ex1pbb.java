package s102n1ex1pbb;

public class S102N1ex1pbb {

	public static void main(String[] args) {
		
		try {

			System.out.println("Instrucció 1.");

			int n = Integer.parseInt("M"); //error 

			System.out.println("Instrucció 2.");
		}
		catch (Exception e) {

			System.out.println("Instruccions a executar si es produeix un error");

		}
		finally {

			System.out.println("Instruccions a executar amb error o sense");

		}
	}
}