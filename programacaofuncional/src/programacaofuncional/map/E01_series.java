package programacaofuncional.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E01_series {

	public static void main(String[] args) {

		record Serie(String nome, String ano) {};
		
		List<String> nomesSeries = new ArrayList<>();
		
		List<Serie> series = Arrays.asList(new Serie("Breaking Bad","2008"),
										   new Serie("Mr. Robot","2015"),
										   new Serie("True Dectetive","2014"),
										   new Serie("Hannibal","2013"),
										   new Serie("The handmaid\'s Tale","2017"),
										   new Serie("House M.D.","2004"));
		
		//System.out.println(series.get(1).ano());
		
		nomesSeries = series.stream().map(serie -> serie.nome()).toList();
		
		nomesSeries.forEach(System.out::println);

	}

}


