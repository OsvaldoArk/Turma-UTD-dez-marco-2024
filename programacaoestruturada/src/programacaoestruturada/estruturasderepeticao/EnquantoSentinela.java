package programacaoestruturada.estruturasderepeticao;

import java.util.Scanner;

public class EnquantoSentinela {

	public static void main(String[] args) {
		
		String opcao = "";
		Boolean continua = true;
		
		Scanner leitor = new Scanner(System.in);
		
		while(continua) {
			System.out.println("Deseja continuar?");
			opcao = leitor.next();
			
			if(opcao.toLowerCase().equals("n")) {
				continua = false;
			}
		}
		
		System.out.println("parou de funcionar!");

	}
}
