package programacaoestruturada.recursividade;

public class Recursividade {

	public static void main(String[] args) {
		
		System.out.println(ProgressaoAritmetica(3,2,5));

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
	
	public static int ProgressaoAritmetica(int numero,int a1,int razao) {
		
		if(numero == 1) return a1;
		
		return a1 + ((ProgressaoAritmetica(numero-1, a1, razao)-1) + razao);
	}
}