package exercicio01_formaGeometrica;

public class Principal {

	public static void main(String[] args) {

		FormaGeometrica fg = new FormaGeometrica(5.4,2);
		fg.calcularArea();
		
		Triangulo t = new Triangulo (5.5,2);
		t.calculaArea();
	}

}
