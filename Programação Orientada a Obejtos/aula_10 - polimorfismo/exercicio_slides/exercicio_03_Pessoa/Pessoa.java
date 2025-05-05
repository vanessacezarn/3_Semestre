/*3 - Crie uma classe Pessoa com um método falar(String mensagem) que imprime a mensagem passada 
 * como parâmetro. Sobrecarregue o método falar() para aceitar uma mensagem
 *  e um número de repetições e imprimir a mensagem várias vezes.

*/
package exercicio03_pessoa;

public class Pessoa {
	
	public void falar(String mensagem) {
		System.out.println("\nexibindo mensagem");
		System.out.println(mensagem);
	}
	public void falar(String mensagem,int repeticoes) {
		System.out.println("\n exibindo mensagens repetidas");

		for(int i=0;i<repeticoes;i++) {
			System.out.println(mensagem);
		}
	}
}
