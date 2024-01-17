package programacaoestruturada.estruturasderepeticao;

public class E04_fibonnacci {

	public static void main(String[] args) {
		
		int enesimo = 15,a=1,b=0,c=0;
		
		for(int contador=1;contador<=enesimo;contador++) {
			
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
		}
	}
}
