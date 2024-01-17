package programacaoestruturada.exercicios;

public class E78_multiplosDeDez {

	public static void main(String[] args) {
		
		int numeros[] = new int[15];
		
		for(int contador=0;contador<15;contador++) {
			numeros[contador] = (int) Math.round(Math.random()*99+1);
		}
		
		for(int contador=0;contador<15;contador++) {
			if(numeros[contador] % 10 == 0)
				System.out.print("["+ numeros[contador]+"] ");
			else
				System.out.print( numeros[contador]+" ");
		}

	}

}
