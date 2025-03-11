package exercicio4;

import java.util.Scanner;


public class LivroExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner (System.in);
		
		Livro l = new Livro();
		
		System.out.print("Digite o nome do livro:");
		l.nome=teclado.nextLine();
		System.out.print("Digite o autor:");
		l.autor=teclado.nextLine();
		System.out.print("Digite o ano de publicação:");
		l.anoPublicaco=teclado.nextInt();
		
		System.out.println("Nome do livro:"+l.nome+", Autor: "+l.autor+", Ano de publicação: "+l.anoPublicaco);

		
		
		
		
		teclado.close();
	}

}
