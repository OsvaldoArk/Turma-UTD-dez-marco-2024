package programacaoestruturada.recursividade;

public class Recursividade {

	public static void main(String[] args) {
		
		System.out.println(Expoente(7,2));

	}
	//(4 + ( 3 + ( 2 + (1))))
	public static int Somatorio(int numero) {
		
		if(numero == 1) return 1;
		
		return numero + Somatorio(numero -1);
	}
	
	//3! = 3 * 2 * 1 = 6
	public static int Fatorial(int numero) {
		
		if(numero == 1) return 1;
		
		return numero * Fatorial(numero - 1);
	}
	
	public static int Fibonnacci(int numero) {
		
		if(numero <= 1) return 1;
		
		return Fibonnacci(numero - 2) + Fibonnacci(numero - 1);
	}
	
	public static int Expoente(int base, int expoente) {
		
		if(expoente == 0) return 1;
		
		return base * Expoente(base,expoente - 1);
	}
}