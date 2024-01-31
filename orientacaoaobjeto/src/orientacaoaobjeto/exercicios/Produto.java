package orientacaoaobjeto.exercicios;

import java.util.Objects;

public abstract class Produto {

	private String codigoDeBarras;
	private String nome;
	private Double preco;
	
	public Produto(String codigoDeBarras,String nome, Double preco) {
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.preco = preco;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoDeBarras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoDeBarras, other.codigoDeBarras);
	}
	
	public abstract String toString();
}
