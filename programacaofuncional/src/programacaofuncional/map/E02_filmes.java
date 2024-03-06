package programacaofuncional.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class E02_filmes {
	
	public static void main(String[] args) {
		
		record Filme(String id,String titulo,String poster,Double nota) {};
		
		List<Filme> filmes = Arrays.asList(
		           new Filme("70111470","Die Hard","http://cdn-0.nflximg.com/images/2891/DieHard.jpg",4.0),
		           new Filme("654356453","Bad Boys","http://cdn-0.nflximg.com/images/2891/BadBoys.jpg",5.0),
		           new Filme("675465","Fracture","http://cdn-0.nflximg.com/images/2891/Fracture.jpg",5.0));
		          
		/*
		List<String> pares = new ArrayList<>();
		
		pares = filmes.stream().map(filme -> {
			StringBuilder resultado = new StringBuilder();
			
			return resultado.append(filme.id()).append(" - ").append(filme.titulo()).toString();
		}).toList();
		
		pares.forEach(System.out::println);
		*/
		
		Map<String,String> respostas = new TreeMap<>();
		
		filmes.forEach(filme -> respostas.put(filme.id(), filme.titulo()));

		//System.out.println(respostas.get("675465"));
		/*	
		for(Entry<String, String> item : respostas.entrySet()) {
			System.out.println(item.getKey()+" - "+item.getValue());
		}
		*/
		
		System.out.println(respostas.size());
		
		for(String chave : respostas.keySet()) {
			System.out.println(chave+" - "+respostas.get(chave));
		}
	}
}
