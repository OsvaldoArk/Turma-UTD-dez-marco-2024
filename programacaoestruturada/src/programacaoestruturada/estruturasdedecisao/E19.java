package programacaoestruturada.estruturasdedecisao;

import java.util.Scanner;

public class E19 {
	
	/*
	 * 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
	   média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
	   não um bom aproveitamento (se ficou acima da média 7.0)
	 * 
	 * */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota01 = leitor.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota02 = leitor.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		System.out.println("A média final é: "+media);
		
		if(media > 7) {
			
			System.out.println("Parabéns, você obteve um bom aproveitamento.");
		}
		else {
			
			System.out.println("O aluno não obteve êxito.");
		}
		
	}

}
