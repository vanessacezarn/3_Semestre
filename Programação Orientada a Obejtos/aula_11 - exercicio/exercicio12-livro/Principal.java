/*Crie uma classe Livro com atributos titulo, autor e ano. Crie uma lista de livros e adicione alguns livros
 nessa lista. Em seguida, ordene a lista de livros pelo ano de lançamento e imprima os dados de cada livro.
*/
package exercicio12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List <Livro> listaLivro = new ArrayList<>();
		Livro l = new Livro("fundamento programação","julio cezar",2015);
		listaLivro.add(l);
		Livro l2 = new Livro("programação basica a intermediaria","bruna nogueira",2012);
		listaLivro.add(l2);
		Livro l3 = new Livro("programando ia","maria silva",2025);
		listaLivro.add(l3);
		Livro l4 = new Livro("programação avançada","carlos almeida",2008);
		listaLivro.add(l4);
		
        listaLivro.sort(Comparator.comparing(Livro::getAno));
        
		System.out.println("lista dos livros ordenada pelo ano de publicação");
		for(Livro lv : listaLivro) {
			System.out.println(lv);
		}
	}

}
