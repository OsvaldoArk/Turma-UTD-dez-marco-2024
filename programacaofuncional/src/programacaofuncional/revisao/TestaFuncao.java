package programacaofuncional.revisao;

public class TestaFuncao {
	
	
	public static void main(String[] args) {
		
		Base elevaAoQuadrado = x -> Math.pow(x, 2);
		
		Base raizQuadrada = x -> Math.sqrt(x);
		
		Base raizCubica = x -> Math.cbrt(x);
		
		System.out.println(elevaAoQuadrado.operacao(14));
		
		System.out.println(raizQuadrada.operacao(225));
		
		System.out.println(raizCubica.operacao(27));
		
		System.out.println(executa(raizCubica,64));
		
		System.out.println(executa(x-> Math.random()*x,30));
	}

	public static Double executa(Base b, int numero) {
		return b.operacao(numero);
	}
}
