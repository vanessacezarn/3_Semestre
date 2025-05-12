package exercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("digite qual é o produto: ");
		String produto = teclado.nextLine();
		System.out.print("digite qual o preço do produto: ");
		double preco = teclado.nextDouble();
		
		Produto p = new Produto (produto,preco);
		p.desconto();
		ProdutoComDesconto pc = new ProdutoComDesconto(produto,preco);
		pc.desconto();
		
		teclado.close();
	}

}
