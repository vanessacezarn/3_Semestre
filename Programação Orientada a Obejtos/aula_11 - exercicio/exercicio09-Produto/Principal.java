package exercicio09;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {


		List<Produto> lista = new ArrayList<>();
		//PRODUTO 1
		Produto p = new Produto("coca",9,15);
		lista.add(p);
		//PRODUTO 2
		Produto p2 = new Produto("biscoito",6,35);
		lista.add(p2);
		//PRODUTO 3
		Produto p3 = new Produto("chocolate",4.5,55);
		lista.add(p3);
		
		//LISTAR TODOS PRODUTOS
		System.out.println("Lista dos produtos");

		for(Produto prod : lista ) {
			System.out.println(prod);
		}
		
		
		
	}

}
