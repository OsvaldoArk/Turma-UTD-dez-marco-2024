package orientacaoaobjeto.exerciciosinterface;

public class TesteCalculo {
	
	public static void main(String[] args) {
		
		AreaCalculavel[] vetor = {new Quadrado(5),new Retangulo(3,4),new Circulo(3)};
		
		for(AreaCalculavel item : vetor) {
			System.out.println(item.calculaArea());
		}
	}
}
