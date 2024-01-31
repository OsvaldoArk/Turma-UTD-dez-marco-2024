package orientacaoaobjeto.interfaces.funcional;

import java.util.LinkedList;
import java.util.List;

public class TestaOperacao {

	
	public static void main(String[] args) {

		Operacao soma = (x,y) -> (double) x + y;
		Operacao subtracao = (x,y) -> (double) x - y;
		Operacao multiplicacao = (x,y) -> (double) x * y;
		Operacao divisao = (x,y) -> (double) x / y;
		/*
		System.out.println(soma.calcula(10, 5));
		System.out.println(subtracao.calcula(10, 5));
		System.out.println(multiplicacao.calcula(10, 5));
		System.out.println(divisao.calcula(10, 5));
		*/
		
		System.out.println(executa(soma,10,5));
			System.out.println(executa(subtracao,10,5));
		System.out.println(executa(multiplicacao,10,5));
		System.out.println(executa(divisao,10,5));
		System.out.println(executa((x,y)-> Math.pow(x, y),2,10));
		
		List<Integer> numeros = new LinkedList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		numeros.stream().map(x -> Math.pow(x, 2)).forEach(System.out::println);
		
		
	}
	
	public static Double executa(Operacao op, int a, int b) {
		return op.calcula(a, b);
	}
}
