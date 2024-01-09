package programacaoestruturada.estruturasdedecisao;

public class E0002 {

	public static void main(String[] args) {
		
		int opcao = 2;
		
		switch(opcao) {
		
			case 1: System.out.println("novo jogo"); 
					break;
			
			case 2: System.out.println("carregar gravação");
					break;
			
			case 3: System.out.println("apagar gravação");
					break;
					
			case 4: System.out.println("opções");
					break;
					
			default: System.out.println("opção inválida");
		}

	}
}
