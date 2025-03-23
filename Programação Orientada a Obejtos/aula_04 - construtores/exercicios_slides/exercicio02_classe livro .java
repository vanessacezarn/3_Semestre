//2) Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e
//Emprestado (bool). Crie método que retorne as informações do livro. Crie também um método responsável por fazer
//o empréstimo do livro e outro para fazer a devolução. Faça o controle disto utilizando o atributo Emprestado.

package exercicio02;

import java.util.Scanner;

public class Livro {
	String titulo;
	String autor;
	int ano_publicacao;
	String genero;
	boolean emprestado = false;
	
	public void emprestimo(Scanner teclado) {
        System.out.println("EMPRÉSTIMO");
        if (!emprestado) {
            System.out.println("Livro disponível.");
            int op;
            System.out.println("Deseja pegar emprestado o livro? (1-sim, 2-não)");
            op = teclado.nextInt();
            if (op == 1) {
                emprestado = true;
                System.out.println("Livro emprestado com sucesso.");
            } 
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }
	
	public void devolucao(Scanner teclado) {
		System.out.println("DEVOLUÇÃO");
		if(emprestado) {
			int op;
            System.out.println("Deseja devolver o livro? (1-sim, 2-não)");
            op = teclado.nextInt();
            if (op == 1) {
			System.out.println("Livro devolvido com sucesso");
			emprestado=false;
            }else {
            	System.out.println("cliente segue com o livro");
            }
		}else {
			System.out.println("Livro não está emprestado, logo não é possível realizar devolução");
		}
	}
	
	public void informacoes_livro(){
		System.out.println();
		System.out.println("Informações sobre o livro");
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano de publicação: "+ano_publicacao);
		if(emprestado) {
			System.out.println("livro emprestado");
		}else {
			System.out.println("livro disponível para emprestimo");
		}
	
	
		
		
	}

}
