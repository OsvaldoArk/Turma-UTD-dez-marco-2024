package programacaoestruturada.estruturasdedecisao;

import java.util.Scanner;

public class E23 {

	/*
	 * 
	 * 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
	   para todos, mas especialmente para mulheres. Faça um programa que leia nome,
	   sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
	   que:
		- Homens ganham 5% de desconto
		- Mulheres ganham 13% de desconto
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double desconto = 0;
		
		System.out.println("Digite seu nome");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo. F para feminino M para masculino");
		Character sexo = leitor.next().charAt(0);
		
		System.out.println("Digite o preço das compras.");
		double compras = leitor.nextDouble();
		
		if(sexo == 'f' || sexo == 'F') {
			desconto = 13;
		}else if(sexo == 'm' || sexo == 'M') {
			desconto = 5;
		}else {
			desconto = 0;
		}
		
		double valorFinal = compras - compras * (desconto/100);
		
		System.out.println("Parabéns "+nome+" você teve "+desconto+"% de desconto");
		System.out.println("Valor total: R$ "+compras);
		System.out.println("Valor com desconto: R$ "+valorFinal);
	}

}
