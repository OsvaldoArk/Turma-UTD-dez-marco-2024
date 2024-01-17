package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E31_jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escolha:\n1-pedra\n2-papel\n3-tesoura");
		int player = leitor.nextInt();
		
		int cpu = resultadoCPU();
		
		String resultado = condicoesVitoria(player, cpu);
		
		System.out.println("jogador: "+tradutor(player)+" x cpu: "+tradutor(cpu));
		
		System.out.println("vencedor: "+resultado);

	}

	public static int resultadoCPU() {
		return (int) Math.round(Math.random()*2+1);
	}
	
	public static String condicoesVitoria(int player, int cpu) {
		
		boolean condicaoVitoriaDoJogador = player == 1 && cpu == 3 || 
										   player == 2 && cpu == 1 || 
										   player == 3 && cpu == 2;
		
		if(player == cpu) return "empate";
		
		if(condicaoVitoriaDoJogador) return "jogador";
		
		return "máquina";
	}
	
	public static String tradutor(int escolha) {
		
		switch(escolha) {
			case 1 : return "pedra";
			
			case 2 : return "papel";
			
			case 3 : return "tesoura";
			
			default: return "erro";
		}
		
	}
}
