//2) Crie uma classe chamada Livro que contenha os atributos Título, Autor, Ano de publicação, Gênero e
//Emprestado (bool). Crie método que retorne as informações do livro. Crie também um método responsável por fazer
//o empréstimo do livro e outro para fazer a devolução. Faça o controle disto utilizando o atributo Emprestado.

package exercicio02;



public class Livro {
	String titulo;
	String autor;
	int ano_publicacao;
	String genero;
	boolean emprestado = false;
	
	public boolean emprestimo() {
		System.out.println();
        System.out.println("EMPRÉSTIMO");
        if (!emprestado) {
           return false; 
        } else {
        	emprestado=true;
            return true;
        }
    }
	
	public boolean devolucao() {
		System.out.println();
		System.out.println("DEVOLUÇÃO");
		if(emprestado) {
			return true;
			
		}else {
			return false;
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
+
