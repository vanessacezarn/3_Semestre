package exercicio02;

public class Produto {
	protected String produto;
	protected double preco;
	
	
	
	public Produto(String produto, double preco) {
		super();
		this.produto = produto;
		this.preco = preco;
	}
	

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void desconto() {
		System.out.println("o produto "+produto+" sem desconto custa "+preco);
	}
}
