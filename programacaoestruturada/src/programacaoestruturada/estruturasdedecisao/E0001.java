package programacaoestruturada.estruturasdedecisao;

import java.util.Scanner;

public class E0001 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota01 = leitor.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota02 = leitor.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		
		if(media > 7 && media <= 10) {
			
			System.out.println("Parabéns, você foi aprovado.");
		}
		else if(media >= 3){
			System.out.println("Digite a nota da recuperação");
			Double recuperacao = leitor.nextDouble();
			
			media = (media + recuperacao) /2;
			
			if(media >= 5) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
			
		}else if(media >=0 && media < 3 ) {
			System.out.println("Resultado insatisfatório. Reprovação");
		}else {
			System.out.println("Média inválida");
		}

		System.out.println("A média final é: "+media);
	}

}
