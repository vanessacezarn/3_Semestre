/*Crie uma classe "Pessoa" com um construtor que recebe um parâmetro
"nome" e um método "trabalhar" que imprime "A pessoa está trabalhando".
Crie uma subclasse "Funcionario" que herda da classe "Pessoa". No
construtor da classe "Funcionario", utilize o comando "super" para chamar o
construtor da classe "Pessoa" e passar o parâmetro "nome". Adicione um
método "trabalhar" na classe "Funcionario" que imprime "O funcionário está
trabalhando*/
package exercicio2;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Vanessa");
		System.out.println("nome do funcionário: "+f.nome);
		f.trabalhar();
		
	}

}
