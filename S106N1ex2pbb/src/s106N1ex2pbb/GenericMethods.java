package s106N1ex2pbb;

public class GenericMethods{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	f ("prova ", 1, 1.1);
	f (2, 2.2, "prova2");
		
		
	}	
	public static <T>void f(T t1, T t2, T t3){
		
		System.out.println("Aixo es " + t1 + t2 + t3);
	}
}
