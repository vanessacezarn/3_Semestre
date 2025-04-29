package exercicio1;

public class Retangulo extends Figura {
	protected double largura;
	protected double altura;
	
	
	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double calcularArea() {
		return altura*largura;
	}

}
