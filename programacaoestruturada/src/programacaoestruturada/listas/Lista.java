package programacaoestruturada.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		//ArrayList<Double> notas = new ArrayList<>();
		
		//LinkedList<Double> notasLinked = new LinkedList<>();
		
		List<Double> notas = new LinkedList<>();
		
		notas.add(8.0);
		
		notas.add(9.6);
		
		//notas.removeAll(Arrays.asList(8.0,9.6));
		
		//notas.clear();
		
		//notas.remove(0);
		
		//notas.remove(9.6);
		
		notas.add(1, 7.8);
		
	    //System.out.println(notas.contains(9.8));
		
		//System.out.println(notas.indexOf(8.5));
		
		//System.out.println(notas.get(2));
		
		notas.sort((a,b)-> b.intValue() - a.intValue());
		
		//Collections.reverse(notas);
		
		System.out.println(notas);
		
		System.out.println(notas.size());
		
		System.out.println(notas.isEmpty());
	}
}