/*1 - Crie uma classe FormaGeometrica com um método calcularArea(). 
 * Em seguida, crie uma classe Triangulo que herda da classe FormaGeometrica e sobrescreve
 *  o método calcularArea() para calcular a área do triângulo e imprimir o resultado.*/
package exercicio01_formaGeometrica;

public class FormaGeometrica {
	public double altura;
	public double base;

	public FormaGeometrica(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	public void calcularArea(){
		double area = base*altura;
		System.out.println("area da forma geometrica calculada");
	}
}
