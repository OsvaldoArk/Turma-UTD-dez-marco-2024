package programacaofuncional.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaForEach {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(3,6,9,12,15);
		
		List<Double> quadrados = new ArrayList<>();
		
		numeros.stream().forEach(numero -> quadrados.add(Math.pow(numero,2)));
		
		//quadrados.stream().forEach(x -> System.out.println(x));

		quadrados.forEach(System.out::println);
	}

}
