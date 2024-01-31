
package orientacaoaobjeto.exerciciosinterface;

public class Circulo implements AreaCalculavel{

	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public Double calculaArea() {
		
		return Math.PI * Math.pow(raio, 2);
	}

}
