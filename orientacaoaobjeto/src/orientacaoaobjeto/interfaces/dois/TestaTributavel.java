package orientacaoaobjeto.interfaces.dois;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1500.0);
		
		System.out.println(cc.calculaTributos());
		
		cc.sacar(1000.0);
		
		cc.obterSaldo();
		
		System.out.println(cc.calculaTributos());
		
		SeguroDeVida sv = new SeguroDeVida();
		
		System.out.println(sv.calculaTributos());
		
	}
}
