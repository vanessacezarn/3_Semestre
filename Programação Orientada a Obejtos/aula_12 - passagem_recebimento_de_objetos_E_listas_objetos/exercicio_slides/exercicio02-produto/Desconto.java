 /*método criarProdutoDesconto(String nome, double preco)
 *  que retorna um objeto Produto com 10% de desconto aplicado ao preço.
*/
package exercicio02;

public class Desconto {
	public void criarProdutoDesconto(String nome, double preco) {
		double precoFinal = preco -(preco*0.1);
		System.out.println("o produto "+nome+" com desconto ficou no valor de "+precoFinal);
	}
	
}
