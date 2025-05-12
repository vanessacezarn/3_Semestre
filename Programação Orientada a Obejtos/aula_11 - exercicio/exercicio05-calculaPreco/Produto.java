package exercicio05;

public class Produto {
	protected double preco;
	
	public void calcularPrecoFinal(double preco) {
		System.out.println("o preço do produto é de "+preco);
	}
	
	public void calcularPrecoFinal(double preco, Cliente c) {
		double total = preco - (c.getDesconto()*preco);
		System.out.println("preço final com desconto para cliente "+total);
	}
}
