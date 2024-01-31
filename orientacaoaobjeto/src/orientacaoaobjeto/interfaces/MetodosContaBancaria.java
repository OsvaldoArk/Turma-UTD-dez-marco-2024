package orientacaoaobjeto.interfaces;

public interface MetodosContaBancaria {

	
	public void imprimirSaldo();
	public void sarcar(Double valor);
	public void depositar(Double valor);
	public void transferir(ContaCorrente conta, Double valor);
	public void transferir(ContaPoupanca conta, Double valor);
}
