package s102N1ex3pbb;


public class Array {

	public static void main(String[] args) {
		
		int [] array = new int[20];
		
		try {
		
		array[-3] = 24;	
		
		}catch (ArrayIndexOutOfBoundsException excepcion)
        {
	         System.out.println(" Error de índice en un array");
        }	
	}
}
