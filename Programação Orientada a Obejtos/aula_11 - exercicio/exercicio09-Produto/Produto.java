/*Crie uma classe Produto com atributos nome, preco e quantidade. Crie uma lista de produtos e adicione 
 * alguns produtos nessa lista. Em seguida, percorra a lista e imprima os dados de cada produto.
*/
package exercicio09;

public class Produto {
	protected String nome;
	protected double preco;
	protected int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "nome = " + nome + ", preço = " + preco + " e quantidade = " + quantidade;
	}
	
	
}
