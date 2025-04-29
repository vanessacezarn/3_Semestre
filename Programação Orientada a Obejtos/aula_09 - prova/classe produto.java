package questao10;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public Produto(String nome) {
		this.nome = nome;
		quantidadeEstoque = 0;
		System.out.println("Produto criado com sucesso !!!");
	}
	
	public Produto(String nome,double preco ) {
		this.nome = nome;
		this.preco = preco;
		quantidadeEstoque = 0;
		System.out.println("Produto criado com sucesso !!!");
	}
	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void exibirInformacoes() {
		System.out.println("Exibindo informações do produto");
		System.out.println("Nome: "+nome);
		System.out.println("Preço: "+preco);
		System.out.println("Quantidade em estoque: "+quantidadeEstoque);

		
	}
	
	
	
}
