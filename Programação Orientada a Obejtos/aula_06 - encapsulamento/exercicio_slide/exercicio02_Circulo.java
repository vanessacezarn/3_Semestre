//2 - Crie uma classe Circulo que possua o atributo raio. Proteja o atributo utilizando encapsulamento. 
//Crie os métodos get e set para o atributo. Crie um método calculaArea que calcule a área do círculo e
//retorne o resultado. Faça leitura pelo teclado dos valores.

package exercicio02;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		double area = 2*3.14*raio ;
		return area;
	}
}
