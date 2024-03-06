package programacaofuncional.filter;

import java.util.Arrays;
import java.util.List;

public class E01_filtroDeFilmes {
	
	public static void main(String[] args) {
		
		record Filme(String id,String titulo,String poster,Double nota) {};
		
		List<Filme> filmes = Arrays.asList(
		           new Filme("70111470","Die Hard","http://cdn-0.nflximg.com/images/2891/DieHard.jpg",4.0),
		           new Filme("654356453","Bad Boys","http://cdn-0.nflximg.com/images/2891/BadBoys.jpg",5.0),
		           new Filme("675465","Fracture","http://cdn-0.nflximg.com/images/2891/Fracture.jpg",5.0));
		
		filmes.stream().filter(filme -> filme.nota() > 4.0).forEach(System.out::println);
		
		filmes.stream().filter(f -> f.titulo().toLowerCase().startsWith("d")).forEach(System.out::println);
	}

}
