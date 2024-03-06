package programacaofuncional.foreach.copy;

import java.util.Arrays;
import java.util.List;

public class TestaFilter {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> pares = numeros.stream().filter(numero -> numero % 2 == 0).toList();
		
		pares.forEach(x -> System.out.print(x+" "));
		
		System.out.println();
		
		numeros.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.print(x+" "));
		
		System.out.println();
		
		numeros.stream().filter(x-> x > 5).forEach(x -> System.out.print(x+" "));
	}
}
