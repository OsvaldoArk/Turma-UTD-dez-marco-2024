package programacaofuncional.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaMap {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(3,6,9,12,15);
		
		List<Double> quadrados = new ArrayList<>();
		
		//numeros.stream().forEach(numero -> quadrados.add(Math.pow(numero,2)));
		
		//quadrados = numeros.stream().map(x -> Math.pow(x, 2)).toList();
		
		//quadrados.stream().forEach(System.out::println);
		
		numeros.stream().map(x -> Math.pow(x, 2)).forEach(System.out::println);

		
		
	}
}
