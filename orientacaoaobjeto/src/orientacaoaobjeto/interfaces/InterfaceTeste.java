package orientacaoaobjeto.interfaces;

public class InterfaceTeste {

	public static void main(String[] args) {
	
		ContaCorrente c = new ContaCorrente("1234","56789",2000.0);

		ContaCorrente c2 = new ContaCorrente("9876","54321",1000.0);

		ContaPoupanca cp = new ContaPoupanca();
		
		c.sarcar(200.0);
		
		c.imprimirSaldo();
		
		c2.transferir(cp, 300.0);
		
		c.imprimirSaldo();
	}
}