/*Crie uma classe "Pessoa" com um construtor que recebe um parâmetro
"nome" e um método "trabalhar" que imprime "A pessoa está trabalhando".
Crie uma subclasse "Funcionario" que herda da classe "Pessoa". No
construtor da classe "Funcionario", utilize o comando "super" para chamar o
construtor da classe "Pessoa" e passar o parâmetro "nome". Adicione um
método "trabalhar" na classe "Funcionario" que imprime "O funcionário está
trabalhando*/
package exercicio2;

public class Funcionario extends Pessoa{

	public Funcionario(String nome) {
		super(nome);
	}
	
	public void trabalhar() {
		System.out.println("O funcionario está trabalhando");
	}

}
