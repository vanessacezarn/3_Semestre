/*2 - Crie uma classe ContaBancaria com um método calcularSaldo(). Em seguida, crie uma classe 
 * ContaCorrente que herda da classe ContaBancaria e sobrescreve o método calcularSaldo()
 *  para calcular o saldo da conta corrente e imprimir o resultado.
*/
package exercicio02_contaBancaria;

public class ContaBancaria {
	public double saldo;
	
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}


	public void calcularSaldo() {
		System.out.println("verificando saldo da conta bancaria");
	}
}
