//PROVA 27/05 - PROGRAMAÇÃO ORIENTADA A OBJETOS
// VANESSA CEZAR DO NASCIMENTO

package prova;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Produto>listaProdutos = new ArrayList<Produto>();
		
		ProdutoEletronico pe = new ProdutoEletronico("Computador",2000,10,450);
		System.out.println("Produto: "+pe.getNome());
		pe.aplicarDesconto();
		pe.garantia();
		pe.calcularPrecoFinal();
		System.out.println("\n");
		
		ProdutoEletronico pe2 = new ProdutoEletronico("Televisão",2000,10,200);
		System.out.println("Produto: "+pe2.getNome());
		pe2.aplicarDesconto(50);
		pe2.garantia();
		pe2.calcularPrecoFinal();
		System.out.println("\n");
		
		
		ProdutoAlimenticio pa = new ProdutoAlimenticio("Coca-Cola",10,5,45);
		System.out.println("Produto: "+pa.getNome());
		pa.aplicarDesconto();
		pa.calcularPrecoFinal();
		System.out.println("\n");
		
		ProdutoAlimenticio pa2 = new ProdutoAlimenticio("Bolacha",8,0,5);
		System.out.println("Produto: "+pa2.getNome());
		pa2.aplicarDesconto();
		pa2.validade();
		pa2.calcularPrecoFinal();
		System.out.println("\n");
		
		
		
		// ADICIONANDO A LISTA
		listaProdutos.add(pe);
		listaProdutos.add(pe2);
		listaProdutos.add(pa);
		listaProdutos.add(pa2);
		
		//EXIBIR A LISTA
		System.out.println("\nLISTA DE PRODUTOS");
		for(Produto p : listaProdutos) {
			System.out.print("Nome: "+ p.getNome()+" ; ");
			p.calcularPrecoFinal();
		}
		
		
	
		
		
	}

}
