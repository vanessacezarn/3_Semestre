package exercicio02;

public class Principal {

	public static void main(String[] args) {

		Produto p = new Produto("coca",15,new Desconto());
		Produto produto2 = p.clone();
	
		System.out.println("produto: "+p.getNome());
		System.out.println("preço: "+p.getPreco());
		
		produto2.getDesconto().criarProdutoDesconto(produto2.getNome(), produto2.getPreco());
	}

}
