package programacaoestruturada.estruturasderepeticao;

public class E02_somaInversa {
	
	public static void main(String[] args) {
		
		double soma = 0;
		//1+1/2+1/3+1/4+...+1/100;
		for(int contador = 1; contador<=100;contador++) {
			soma+=(1/(double)contador);
			//soma = soma + contador;
		}
		
		System.out.println(soma);
	}
}
