package programacaoestruturada.estruturasdedecisao;

import java.util.Scanner;

public class E0004_desconto {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		String tipoDeClienteString = "";
		double desconto = 0.0;
		
		System.out.println("Digite o valor das compras.");
		double valor = leitor.nextDouble();
		
		System.out.println("Digite o tipo de cliente\n1-comum\n2-vip\n3-funcionário");
		int tipoDeCliente = leitor.nextInt();
		
		switch(tipoDeCliente) {
			case 1 : tipoDeClienteString = "comum"; break;
			
			case 2 : tipoDeClienteString = "vip";
					 desconto = 5.0; break;
					 
			case 3 : tipoDeClienteString = "funcionário";
					 desconto = 10.0; break;
		}
		
		double valorFinal = valor - (valor*desconto/100);
		
		System.out.println("Tipo de cliente: "+tipoDeClienteString);
		System.out.println("desconto: "+desconto+"%");
		System.out.println("valor final "+valorFinal);
	}
}
