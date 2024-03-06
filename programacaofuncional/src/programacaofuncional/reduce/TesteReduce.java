package programacaofuncional.reduce;

import java.util.Arrays;
import java.util.List;

public class TesteReduce {

	public static void main(String[] args) {
		

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*
		
		System.out.println(numeros.stream()
							.reduce(0,(total, numero)-> total+=numero));
		
		System.out.println(numeros.stream()
							.reduce((maior, numero)-> {
								if(numero > maior)
									return numero;
								else
									return maior;
							})
							.get());
		
		System.out.println(numeros.stream()
				.reduce((maior, numero)-> numero > maior ? numero:maior)
				.get());

		System.out.println(numeros.stream().map(x-> x * 2).reduce(0,(t,n)-> t+=n));
		*/
		
		System.out.println(numeros.stream().filter(x-> x%2==0).reduce(0, (t,n)->t+=n));
	}
}