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
		
		System.out.println();
		l.informacoes_livro();
		
		boolean retorno;
		retorno = l.emprestimo();
		if (!retorno) {
            System.out.println("Livro disponível.");
            int op;
            System.out.println("Deseja pegar emprestado o livro? (1-sim, 2-não)");
            op = teclado.nextInt();
            if (op == 1) {
                System.out.println("Livro emprestado com sucesso!!!.");
                l.emprestado=true;
            } 
        } else {
            System.out.println("Livro já está emprestado.");
        }
		
		
		
		retorno = l.devolucao();
		if(retorno) {
			int opd;
            System.out.println("Deseja devolver o livro? (1-sim, 2-não)");
            opd = teclado.nextInt();
            if (opd == 1) {
			System.out.println("Livro devolvido com sucesso");
			l.emprestado=false;
            }else {
            	System.out.println("cliente segue com o livro");
            }
		}else {
			System.out.println("Livro não está emprestado, logo não é possível realizar devolução");
		}
		
		
		teclado.close();
	}
	
}
