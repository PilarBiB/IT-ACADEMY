package s108N1ex2pbb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S108N1ex2pbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(getNumerosToString(numeros,2, ","));
	}	
	public static String getNumerosToString(List<Integer> numeros, int divisible, String separator) {
		
		return numeros.stream().map(n -> (n%divisible == 0) ? "e"  +n : "o" +n) .collect(Collectors.joining(separator));
	}

}
