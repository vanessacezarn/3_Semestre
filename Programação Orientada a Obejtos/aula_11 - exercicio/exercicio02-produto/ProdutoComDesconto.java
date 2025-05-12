package exercicio02;

public class ProdutoComDesconto extends Produto {

	public ProdutoComDesconto(String produto, double preco) {
		super(produto, preco);
		// TODO Auto-generated constructor stub
	}
	
	public void desconto() {
		double desconto = preco * 0.1; //DESCONTO PREDEFINIDO EM 10%
		double valor = preco - desconto;
		System.out.println("o produto "+produto+" com desconto ficou no total de "+valor);
	}
}
