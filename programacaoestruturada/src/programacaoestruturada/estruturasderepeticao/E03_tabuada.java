package programacaoestruturada.estruturasderepeticao;

public class E03_tabuada {

	public static void main(String[] args) {
		
		for(int numero = 1;numero<=10;numero++) {
			
			for(int contador = 0; contador<=10;contador++) {
				int resultado = numero * contador;
				
				System.out.println(numero+"X"+contador+"="+resultado);
			}
			System.out.println("=============");
		}
		
		
	}
}
