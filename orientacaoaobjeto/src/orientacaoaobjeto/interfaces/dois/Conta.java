package orientacaoaobjeto.interfaces.dois;

public class Conta {

	protected Double saldo;
	
	public Conta(Double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(Double valor) {
		if(valor<=saldo) {
			saldo-=valor;
		}else {
			System.err.println("saldo insuficiente");
		}
	}
	
	public void depositar(Double valor) {
		saldo+=valor;
	}
	
	public void obterSaldo() {
		System.out.println("O seu saldo é R$"+saldo+" reais.");
	}
}
