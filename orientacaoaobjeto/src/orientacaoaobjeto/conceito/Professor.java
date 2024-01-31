package orientacaoaobjeto.conceito;

import java.util.List;

public class Professor extends Pessoa{

	private List<String> disciplinas;
	
	public Professor(String cpf, String nome, Integer idade, String telefone,
										String endereco,List<String> disciplinas) {
		super(cpf,nome,idade,telefone,endereco);
		
		this.disciplinas = disciplinas;
	}
	
	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void mostraDisciplinas() {
		for(String disciplina : disciplinas) {
			System.out.print(disciplina+" ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		
		return "Professor [nome="+getNome()+", cpf="+getCpf()+", idade="+getIdade()+
						  ", contato="+getTelefone()+", endereco="+getEndereco()+"]";
	}
}
