package orientacaoaobjeto.exerciciosinterface;

public class Retangulo implements AreaCalculavel{

	private int comprimento;
	private int altura;
	
	public Retangulo(int comprimento, int altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	@Override
	public Double calculaArea() {
		
		return (double) comprimento * altura;
	}

}
