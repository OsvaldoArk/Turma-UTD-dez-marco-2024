package programacaoestruturada.funcoes;

public class CriacaoFuncao {
	
public static Double elevaONumeroAoQuadrado(Integer numero) {
	
	return Math.pow(numero, 2);
}

public static void elevaONumeroAoQuadradoVazio(Integer numero) {
	
	System.out.println(Math.pow(numero, 2)); 
}

public static void elevaDoisADecimaPotencia(){
	System.out.println(Math.pow(2, 10));
}

}
