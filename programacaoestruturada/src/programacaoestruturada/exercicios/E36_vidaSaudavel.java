package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E36_vidaSaudavel {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas horas você se exercitou nesse mês?");
		int horasDeExercicio = leitor.nextInt();
		
		int pontos = 0;
		
		if(horasDeExercicio >= 0 && horasDeExercicio < 10) {
			pontos = 2;
		}else if(horasDeExercicio >= 10 && horasDeExercicio < 20) {
			pontos = 5;
		}else if(horasDeExercicio > 20) {
			pontos = 10;
		}
		
		double resultado = pontos * horasDeExercicio * 0.05;
		
		System.out.println("R$ "+resultado);
	}
}
