//5) Criar uma classe chamada Pessoa com 2 construtores, um que receba o nome e a idade da pessoa e outro recebendo apenas a idade. 
//Solicite ao usuário qual dos construtores ele gostaria de utilizar na instanciação da classe. Além de receber parâmetros,
//os construtores imprimem na tela o conteúdo dos parâmetros recebidos.
package exercicio05;

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa(String nomePessoa, int idadePessoa) {
		nome = nomePessoa;
		idade = idadePessoa;
		System.out.println("CONSTRUTOR 1");
		System.out.println("NOME: "+nome);
		System.out.println("IDADE: "+idade);
	}
	
	public Pessoa(int idadePessoa) {
		idade = idadePessoa;
		System.out.println("CONSTRUTOR 2");
		System.out.println("IDADE: "+idade);
	}
}
