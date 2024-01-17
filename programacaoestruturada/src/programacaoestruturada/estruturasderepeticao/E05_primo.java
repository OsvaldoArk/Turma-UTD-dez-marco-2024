package programacaoestruturada.estruturasderepeticao;

public class E05_primo {

	public static void main(String[] args) {
		
		for(int numero = 2; numero <=1000;numero++) {
			if(verificaSePrimo(numero)) {
				
				System.out.print(numero+" ");
			}
		}	
	}
	
public static boolean verificaSePrimo(int numero) {
	
	int divisores = 0, contador = 1;
	
	while(contador<=numero) {
		
		if(numero % contador == 0)
			divisores++;
		
		contador++;
	}
	
	if(divisores == 2)
		return true;
	else
		return false;
}

}
