package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E69_progressaoAritmetica {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro termo");
		int a1 = leitor.nextInt();
		
		System.out.println("Digite a razão da P.A.");
		int razao = leitor.nextInt();
		
		int contador = 1;
		//transformar o while abaixo em uma função recursiva.
		while(contador<=10) {
			int an = a1 + (contador-1) * razao;
			
			System.out.print(an+" ");
			
			contador++;
		}
		
		double soma = (a1 + a1 + 9 * razao) * 10/ 2.0;
		
		System.out.println();
		
		System.out.println("soma: "+soma);
	}

}
