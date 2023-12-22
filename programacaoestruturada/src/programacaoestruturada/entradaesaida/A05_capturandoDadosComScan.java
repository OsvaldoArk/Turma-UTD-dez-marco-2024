package programacaoestruturada.entradaesaida;

import java.util.Scanner;

public class A05_capturandoDadosComScan {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		
		String nome = leitor.next();
		
		System.out.println("Seja bem vindo(a) ao curso de Lógica de Programação Java, "+nome);
		
		leitor.close();
		
	}

}
