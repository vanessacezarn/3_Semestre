package exercicio06;

public class Principal {

	public static void main(String[] args) {
		Gerente g = new Gerente("Vanessa");
		g.calcularSalario(160);
		g.exibeDados();
		
		Vendedor v = new Vendedor("Amanda");
		v.calcularSalario(200);
		v.exibeDados();
		
	}

}
