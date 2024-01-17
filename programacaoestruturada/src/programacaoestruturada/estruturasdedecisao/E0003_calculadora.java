package programacaoestruturada.estruturasdedecisao;

import java.util.Scanner;

public class E0003_calculadora {

	public static void main(String[] args) {
		
		Double resposta = 0.0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o primeiro número");
		Integer numero01 = leitor.nextInt();

		System.out.println("digite o segundo número");
		Integer numero02 = leitor.nextInt();

		System.out.println("Digite a operação que será efetuada.");
		System.out.println("+ :soma\n- :subtração\n* :multiplicação\n/ :divisão");
		char sinal = leitor.next().charAt(0);
		
		
		switch(sinal) {
			case '+' : resposta = (double) (numero01 + numero02);
					   break;
			case '-' : resposta = (double) (numero01 - numero02);
			   		   break;
			case '*' : resposta = (double) (numero01 * numero02);
	   		   		   break;
			case '/' : resposta =  numero01 / (double)numero02;
	   		   break;   
	   		default: System.out.println("operação inválida!");
		}
		
		System.out.println(resposta);
	}
}
