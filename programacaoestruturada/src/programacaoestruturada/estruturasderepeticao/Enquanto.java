package programacaoestruturada.estruturasderepeticao;

public class Enquanto {

	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 3000) {
			
			
			if(contador == 2996) { contador+=2; continue;}
			
			System.out.println(contador);
			
			contador+=2;
		}
		
		System.out.println("depois do fim do while (inimigos do fim)");
	}
}
