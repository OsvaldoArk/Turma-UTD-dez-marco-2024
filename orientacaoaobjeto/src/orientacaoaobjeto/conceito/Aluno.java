package orientacaoaobjeto.conceito;

public class Aluno extends Pessoa{

	private String turma;
	
	public Aluno() {}
	
	public Aluno(String cpf, String nome, Integer idade, String telefone,String endereco,String turma) {
		super(cpf,nome,idade,telefone,endereco);
		
		this.turma = turma;
	}
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		
		return "Aluno [nome="+getNome()+", idade="+getIdade()+", turma="+getTurma()+"]";
	}
}
