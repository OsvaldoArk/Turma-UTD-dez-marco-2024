package orientacaoaobjeto.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	public static void main(String[] args) {
		List<Livro> produtos = new ArrayList<>();
		
		Livro l01 = new Livro("123","Dom Casmurro",100.0,"Machado de Assis");
		
		Livro lfake = new Livro("999","Dom Casmurro",100.0,"Machado de Assis");
		
		Livro l02 = new Livro("124","Ensaio sobre a cegueira",100.0,"Saramago");
	
		Livro l03 = new Livro("125","O Quinze",100.0,"Raquel de Queiroz");
		
		cadastrarProduto(produtos, l01);

		cadastrarProduto(produtos, l02);
		
		cadastrarProduto(produtos,l03);
		
		Produto p = buscarProduto2(produtos,"888");
		
		String resposta = p != null? p.toString() : "livro não encontrado";
		
		System.out.println(resposta);
		
		//System.out.println(produtos);
		
		//System.out.println(buscarProduto(produtos,l03));
	}
	
	
	
	public static void cadastrarProduto(List<Livro> lista,Livro produto) {
		lista.add(produto);
	}
	
	public static void excluirProduto(List<Livro> lista,Livro produto) {
		lista.remove(produto);
	}
	
	public static Integer buscarProduto(List<Livro> lista,Livro produto) {
		
		return lista.indexOf(produto);
	}
	
	public static Produto buscarProduto2(List<Livro> lista,Livro produto) {
		
		for(Produto p : lista) {
			if(p.equals(produto))
				return p;
		}
		
		return null;
	}
	
	public static Produto buscarProduto2(List<Livro> lista,String codigo) {
		
		for(Produto p : lista) {
			if(p.getCodigoDeBarras().equals(codigo))
				return p;
		}
		
		return null;
	}
}
