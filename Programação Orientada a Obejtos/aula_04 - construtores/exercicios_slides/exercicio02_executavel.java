//2) Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e
//Emprestado (bool). Crie método que retorne as informações do livro. Crie também um método responsável por fazer
//o empréstimo do livro e outro para fazer a devolução. Faça o controle disto utilizando o atributo Emprestado.

package exercicio02;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Livro l = new Livro();
		System.out.print("Digite o titulo do livro:");
		l.titulo = teclado.nextLine();
		System.out.print("Digite o autor do livro:");
		l.autor = teclado.nextLine();
		System.out.print("Digite o ano de publicação do livro:");
		l.ano_publicacao = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Digite o gênero do livro:");
		l.genero = teclado.nextLine();
		l.emprestimo(teclado);
		l.devolucao(teclado);
		l.informacoes_livro();
		
		
		
		teclado.close();
	}
	
}
