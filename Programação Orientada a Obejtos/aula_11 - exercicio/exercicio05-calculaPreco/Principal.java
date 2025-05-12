package exercicio05;

public class Principal {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setDesconto(0.1); // DESCONTO DE 10%
		Produto p = new Produto();
		p.calcularPrecoFinal(200);
		p.calcularPrecoFinal(200, c);

		
	}

}
