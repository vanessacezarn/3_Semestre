/*4 - Crie uma classe Casa com um método calcularPreco(int tamanho) que retorna o preço da casa com base no
 *  tamanho em metros quadrados. Sobrecarregue o método calcularPreco() para aceitar um número de quartos
 *   e retornar o preço da casa com base no tamanho e no número de quartos
*/
package exercicio04_casa;

public class Casa {
	public double preco;
	
	public void calcularPreco(int tamanho, double valor_m2) { // valor_m2 = valor do metro quadrado
		preco = tamanho * valor_m2;
		System.out.println("Valor da casa calculado de acordo com o tamanho");
		System.out.println("Valor R$ "+preco);
	}
	public void calcularPreco(int tamanho, double valor_m2, int nQuartos, double valorQuarto) { // valor_m2 = valor do metro quadrado
		preco = (tamanho * valor_m2)+ (nQuartos * valorQuarto);
		System.out.println("Valor da casa calculado de acordo com o tamanho e número de quartos");
		System.out.println("Valor R$ "+preco);
	}
}
