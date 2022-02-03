package s102N1ex4pbb;

public class Excepcions{
 
	public static void main(String[] args) {
        
		try
	    {
		ExcepcionsMeves e = new ExcepcionsMeves("El meu error");
	    throw e;
	    }catch(Exception excepcion){
	    	excepcion.printStackTrace();
	    }
	}
}
class ExcepcionsMeves extends Exception{
       public ExcepcionsMeves(String mensaje){
	        super(mensaje);
       }
}

