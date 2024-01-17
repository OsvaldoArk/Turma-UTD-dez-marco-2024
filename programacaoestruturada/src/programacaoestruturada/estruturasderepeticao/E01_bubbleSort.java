package programacaoestruturada.estruturasderepeticao;

public class E01_bubbleSort {

	public static void main(String[] args) {
		
		double[] notas = {8,10,7,5,10,9,8,10,10,10,9,7,7,8,6,10,7,7,7,9,10};
		
		for(int atual = 0; atual < notas.length; atual++) {
			
			for(int proximo = atual +1;proximo<notas.length;proximo++) {
				
				if(notas[atual]>notas[proximo]) {
					
					double temp = notas[atual];
					
					notas[atual] = notas[proximo];
					
					notas[proximo] = temp;
				}
				
			}
		}
		
		for(double nota : notas) {
			System.out.print(nota+" ");
		}

	}
}
