package orientacaoaobjeto.exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private String sexo;
	
	public Pessoa() {};
	
	public Pessoa(String nome, LocalDate dataDeNascimento,String sexo) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setdataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Integer getIdade() {
		
		LocalDate hoje = LocalDate.now();
		
		return (int) dataDeNascimento.until(hoje, ChronoUnit.YEARS);
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDeNascimento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataDeNascimento, other.dataDeNascimento) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", data de nascimento=" + dataDeNascimento + ", sexo=" + sexo + "]";
	}
}
