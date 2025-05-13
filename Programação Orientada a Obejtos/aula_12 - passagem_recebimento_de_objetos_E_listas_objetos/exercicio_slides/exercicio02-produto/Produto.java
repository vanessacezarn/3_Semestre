/*2 - Crie uma classe Produto com os atributos nome e preco. Em outra classe, crie um método criarProdutoDesconto(String nome, double preco)
 *  que retorna um objeto Produto com 10% de desconto aplicado ao preço.
*/
package exercicio02;

public class Produto {
	private String nome;
	private double preco;
	private Desconto desconto;
	
	public Produto(String nome, double preco, Desconto desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
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
	public Desconto getDesconto() {
		return desconto;
	}
	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	public Produto clone() {
		return new Produto(this.nome,this.preco,this.desconto);
	}
	
}
