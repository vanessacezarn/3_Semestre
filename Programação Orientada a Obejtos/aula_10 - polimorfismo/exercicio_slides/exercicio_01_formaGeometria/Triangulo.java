package exercicio01_formaGeometrica;

public class Triangulo extends FormaGeometrica {
	
	public Triangulo(double altura, double base) {
		super(altura, base);
	}

	public void calculaArea() {
		double area = (base*altura)/2;
		System.out.println("área do triângulo = "+area);
	}
}
