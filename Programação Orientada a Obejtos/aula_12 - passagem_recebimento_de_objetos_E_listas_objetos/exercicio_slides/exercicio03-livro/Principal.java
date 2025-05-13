package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Livro>listaLivro = new ArrayList<>();
		
		Livro l1 = new Livro("programação","julio A.");
		listaLivro.add(l1);
		Livro l2 = new Livro("programação basica","Maria J.");
		listaLivro.add(l2);
		Livro l3 = new Livro("programação avançada","Carlos L.");
		listaLivro.add(l3);
		
		System.out.println("lista de livro");
		
		for(Livro l : listaLivro) {
			System.out.println(l);
		}
		
		
	}

}
