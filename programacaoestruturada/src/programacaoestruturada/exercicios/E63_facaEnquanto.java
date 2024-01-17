package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E63_facaEnquanto {

	public static void main(String[] args) {
		
		int contador = 0, menorValor = 0, quantidadePares = 0,soma = 0;
		boolean ativo = true;
		double media = 0;
		
		Scanner leitor = new Scanner(System.in);
					
		do {
			
			System.out.println("Digite o "+(contador+1)+"º número");
			
			int numero = leitor.nextInt();
			
			if(contador == 0)
					menorValor = numero;
			
			if(numero < menorValor) 
					menorValor = numero;
			
			if(numero % 2 == 0)
					quantidadePares++;
			
			soma+=numero;
			
			contador++;
			
			System.out.println("Deseja continuar?");
			
			String resposta = leitor.next();
			
			if(resposta.toLowerCase().equals("n"))
					ativo = false;
			
		}while(ativo);
		
		System.out.println("Menor número: "+menorValor);
		System.out.println("Quantidade pares: "+quantidadePares);
		System.out.println("Média: "+(soma/contador));

	}
}
