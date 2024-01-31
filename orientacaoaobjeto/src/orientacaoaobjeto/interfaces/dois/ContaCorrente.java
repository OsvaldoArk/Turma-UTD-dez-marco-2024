package orientacaoaobjeto.interfaces.dois;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(Double saldo) {
		super(saldo);
	}

	@Override
	public Double calculaTributos() {
		
		return saldo * 0.01;
	}

}
