package orientacaoaobjeto.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaCenso {

	private static final Scanner leitor = new Scanner(System.in);
	
	private static Censo censo = new Censo();

	public static void main(String[] args) {
		
		
		/*
		Pessoa p = new Pessoa("Rebeca Holanda",LocalDate.of(2006, Month.FEBRUARY, 9),"F");

		Pessoa p2 = new Pessoa("Osvaldo Souza",LocalDate.of(1987, 9, 6),"M");
		
		System.out.println(p.getIdade());
		
		
		censo.cadastrarPessoa(p);
		
		censo.cadastrarPessoa(p2);
		
		System.out.println(censo.pessoaMaisVelha());
		
		System.out.println(censo.homemMaisJovem());
		
		System.out.println(censo.mediaDaIdadeDoGrupo());
		*/
		
		boolean continua = true;
		
		while(continua) {
			
			mostrarOpcoes();
			
			String escolha = leitor.nextLine();
			
			continua = executar(Integer.parseInt(escolha), continua);
		}
	}
	
	public static void mostrarOpcoes() {
		
		System.out.println("1-cadastrar pessoa");
		System.out.println("2-excluir pessoa");
		System.out.println("3-ver lista");
		System.out.println("4-pessoa mais velha");
		System.out.println("5-homem mais jovem");
		System.out.println("6-media do grupo");
		System.out.println("7-sair");
		
	}
	
	public static boolean executar(int escolha, boolean continua) {
		
		switch(escolha) {
			case 1 : cadastrarPessoa(); break;
			case 2 : excluirPessoa(); break;
			case 3 : censo.getGrupo(); break;
			case 4 : System.out.println(censo.pessoaMaisVelha()); break;
			case 5 : System.out.println(censo.homemMaisJovem()); break;
			case 6 : System.out.println(censo.mediaDaIdadeDoGrupo()); break;
			case 7 : continua = false; break;
			default: System.out.println("opção inválida");
		}
		
		return continua;
	}
	
	public static void cadastrarPessoa() {
		
		System.out.println("Digite o nome");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o dia, mês e ano de nascimento");
		Integer dia = leitor.nextInt();
		Integer mes = leitor.nextInt();
		Integer ano = leitor.nextInt();
		
		leitor.nextLine();
		
		System.out.println("Digite o sexo da pessoa");
		String sexo = leitor.nextLine();
		
		Pessoa p = new Pessoa(nome, LocalDate.of(ano, mes, dia),sexo);
		
		censo.cadastrarPessoa(p);
	}
	
	public static void excluirPessoa() {
		System.out.println("Digite o índice da pessoa que deseja excluir");
		String indice = leitor.nextLine();
		
		int i = Integer.parseInt(indice);
		
		System.out.println(indice);
		
		System.out.println("teste "+i);
		
		System.out.println(censo.numeroPessoasCadastradas());
		
		if(i < censo.numeroPessoasCadastradas())
			censo.excluirPessoa(i);
		else
			System.out.println("posição inválida");
	}
}
