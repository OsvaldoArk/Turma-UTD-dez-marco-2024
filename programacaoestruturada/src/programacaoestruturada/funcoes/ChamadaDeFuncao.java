package programacaoestruturada.funcoes;

public class ChamadaDeFuncao {
	
	public static void main(String[] args) {
		
		Math.abs(-10);
		
		double num = Math.random();
		
		System.out.println(CriacaoFuncao.elevaONumeroAoQuadrado(12));
		
		CriacaoFuncao.elevaONumeroAoQuadradoVazio(15);
		
		CriacaoFuncao.elevaDoisADecimaPotencia();
		
	}
	
	public static int absoluto(int numero) {
		return numero >= 0? numero : numero * -1;
	}
}
