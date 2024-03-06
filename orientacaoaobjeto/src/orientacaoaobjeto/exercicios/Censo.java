package orientacaoaobjeto.exercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Censo {
	
	private List<Pessoa> grupo = new ArrayList<>();
	
	public Censo() {}
	
	public Censo(List<Pessoa> grupo) {
		this.grupo = grupo;
	}
	
	public void cadastrarPessoa(Pessoa p) {
		grupo.add(p);
	}
	
	public void excluirPessoa(int indice) {
		
		grupo.remove(indice);
	}
	
	public void getGrupo() {
		for(Pessoa p : grupo) {
			System.out.println(p);
		}
	}
	
	public int numeroPessoasCadastradas() {
		return grupo.size();
	}
	
	public Pessoa pessoaMaisVelha() {
		
		Pessoa maisVelha = new Pessoa();
		
		maisVelha.setdataDeNascimento(LocalDate.now());
		
		for(Pessoa p : grupo) {
			if(p.getIdade() > maisVelha.getIdade()) {
				maisVelha = p;
			}
		}
		
		return maisVelha;
	}

	public Pessoa homemMaisJovem() {
		
		Pessoa jovem = new Pessoa();
		
		for(Pessoa p : grupo) {
			if(p.getSexo().toLowerCase().equals("m"))
				jovem = p;
		}
		
		for(Pessoa p : grupo) {
			if(p.getIdade() < jovem.getIdade() && p.getSexo().toLowerCase().equals("m"))
				jovem = p;
		}
		
		return jovem;
	}
	
	public Double mediaDaIdadeDoGrupo() {
		
		double media = 0;
		
		for(Pessoa p : grupo) {
			media+=p.getIdade();
		}
		
		return media / grupo.size();
	}
}
