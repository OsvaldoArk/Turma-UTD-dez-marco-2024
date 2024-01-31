package orientacaoaobjeto.exerciciosinterface;

public class Quadrado implements AreaCalculavel{

	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public Double calculaArea() {
		
		return (double) lado * lado;
	}

}
