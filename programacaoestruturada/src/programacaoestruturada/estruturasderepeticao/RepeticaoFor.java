package programacaoestruturada.estruturasderepeticao;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		double[] notas = {8,10,7,5,10,9,8,10,10,10,9,7,7,8,6,10,7,7,7,9,10};

		double total = 0, media = 0;
		/*
		for(int indice = 0;indice<notas.length;indice++) {
			total+=notas[indice];
			//System.out.println(notas[indice]);
		}
		*/
		
		for(double pedaco : notas){
			total+=pedaco;
		}
		
		media = total/notas.length;
		
		System.out.printf("%.2f",media);
	}

}
