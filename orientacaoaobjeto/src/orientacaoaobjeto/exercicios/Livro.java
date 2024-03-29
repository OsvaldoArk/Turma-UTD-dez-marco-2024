package orientacaoaobjeto.exercicios;

public class Livro extends Produto{

	private String autor;
	
	public Livro(String codigoDeBarras,String nome,Double preco,String autor) {
		super(codigoDeBarras,nome,preco);
		
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return "Livro [código="+getCodigoDeBarras()+", nome="+getNome()+", preço="+getPreco()+
												", autor="+getAutor();
	}
}
