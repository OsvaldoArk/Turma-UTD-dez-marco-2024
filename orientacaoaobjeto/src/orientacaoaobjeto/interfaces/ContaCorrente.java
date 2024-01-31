package orientacaoaobjeto.interfaces;

public class ContaCorrente implements MetodosContaBancaria{
	
	private String numero;
	private String agencia;
	private Double saldo;
	
	public ContaCorrente() {}
	
	public ContaCorrente(String numero, String agencia, Double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("O seu saldo é: "+saldo);
		
	}

	@Override
	public void sarcar(Double valor) {
		if(valor<= saldo) {
			saldo-=valor;
		}else {
			System.out.println("Não existe saldo suficiente");
		}
		
	}

	@Override
	public void depositar(Double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(ContaCorrente conta, Double valor) {
		if(valor<=saldo) {
			saldo-=valor;
			conta.depositar(valor);
		}
		
	}

	public void transferir(ContaPoupanca conta, Double valor) {
		if(valor<=saldo) {
			saldo-=valor;
			conta.depositar(valor);
		}
	}
}
