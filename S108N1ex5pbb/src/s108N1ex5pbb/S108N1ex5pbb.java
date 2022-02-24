package s108N1ex5pbb;

import java.util.Arrays;
import java.util.List;

public class S108N1ex5pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("LLISTA MESOS");
		List<String> noms = Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre");
		
		noms.stream().forEach(n->System.out.println(n));
	}

}
