package programacaoestruturada.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E60_grupoDePessoas {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		List<Integer> idades = new ArrayList<Integer>();
		
		List<String> sexo = new ArrayList<String>();
		
		Scanner leitor = new Scanner(System.in);
		
		coletaDados(leitor, nomes, idades, sexo);
		
		for(int contador = 0;contador < nomes.size();contador++) {
			System.out.print(nomes.get(contador)+" ");
			
			System.out.print(idades.get(contador)+" ");
			
			System.out.println(sexo.get(contador).equals("f")? "feminino":"masculino");
		}
		
		String maisVelha = nomes.get(pessoaMaisVelha(idades));
		
		System.out.println("Pessoa mais velha: "+maisVelha);
		
		String homemMaisJovem = nomes.get(homemMaisJovem(idades,sexo));
		
		System.out.println("Homem mais jovem: "+homemMaisJovem);
		
		System.out.println("Média de idades: "+mediaIdadesDoGrupo(idades));
	}
	
	public static void coletaDados(Scanner leitor, List<String> nomes,List<Integer>idades, List<String>sexo) {
		
		Boolean continua = true;
		
		while(continua) {
			
			System.out.println("sim-cadastrar pessoa\nnao-parar");
			String opcao = leitor.nextLine();
			
			if(opcao.toLowerCase().equals("nao")) return;
			
			System.out.println("Digite o nome");
			String nome = leitor.nextLine();
			
			nomes.add(nome);
			
			System.out.println("Digite a idade");
			String idade = leitor.nextLine();
			
			idades.add(Integer.parseInt(idade));
			
			System.out.println("Digite o sexo: f ou m");
			String sexoInput = leitor.nextLine().toLowerCase();
			
			sexo.add(sexoInput);
		}
	}
	
	public static int pessoaMaisVelha(List<Integer>idades) {
		int maisVelha = 0;
		Integer indice = null;
		
		for(Integer idade : idades) {
			if(idade > maisVelha) {
				indice = idades.indexOf(idade);
			}
		}
		
		return indice;
	}
	
	public static int homemMaisJovem(List<Integer>idades,List<String> sexo) {
		
		int maisJovem = 0;
		boolean gatilho = false;
		
		for(Integer idade : idades) {
			
			int id = idades.indexOf(idade);
			
			boolean condicaoPrimeiraIdade = gatilho == false && sexo.get(id).equals("m");
			
			if(condicaoPrimeiraIdade) {
				maisJovem = idade;
				gatilho = true;
			}
			
			if(idade < maisJovem && sexo.get(id).equals("m")) {
				maisJovem = idade;
			}
		}
		
		return idades.indexOf(maisJovem);
	}
	
	public static double mediaIdadesDoGrupo(List<Integer>idades) {
		double media = 0;
		int somatorio = 0;
		
		for(Integer idade : idades) {
			somatorio+=idade;
		}
		
		media = somatorio / (double) idades.size();
		
		return media;
	}
}
