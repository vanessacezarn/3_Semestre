/*Crie uma classe Conta com atributos numero, titular e saldo. Crie uma lista de contas e adicione algumas
 *  contas nessa lista. Em seguida, crie um método que recebe uma lista de contas e retorna a conta com o
 *   maior saldo.Por fim, chame esse método passando a lista de contas e imprima os dados da conta com o 
 *   maior saldo
*/
package exercicio13;

public class Conta {
	protected String numero;
	protected String titular;
	protected double saldo;
	public Conta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta numero=" + numero + ", titular=" + titular + ", saldo=" + saldo ;
	}
	
	
	
}
