package projetografico.model;

public class Contato {
	
	private String nome;
	private Integer idade;
	private String telefone;
	
	public Contato() {}
	
	public Contato(String nome, Integer idade, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
}
