package programacaoestruturada.estruturasdedecisao;

import java.util.Scanner;

public class E29 {

	/*
	 * 
	 * 29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
		quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
		acordo com a tabela a seguir:
		- Até 3 anos de empresa: aumento de 3%
		- entre 3 e 10 anos: aumento de 12.5%
		- 10 anos ou mais: aumento de 20%
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double aumento = 0.0;
		
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		
		System.out.println("Digite seu salário");
		Double salario = scan.nextDouble();
		
		System.out.println("A quantos anos você trabalha na empresa?");
		Integer anos = scan.nextInt();
		
		if(anos > 0 && anos < 3) {
			aumento = 3.0;
		}else if(anos >= 3 && anos <= 10) {
			aumento = 12.5;
		}else if(anos > 10) {
			aumento = 20.0;
		}else {
			System.out.println("quantidade de anos inválida!");
		}
		
		Double novoSalario = salario + (salario * aumento/100);

		System.out.println("novo salário: R$ "+novoSalario);
	}

}
