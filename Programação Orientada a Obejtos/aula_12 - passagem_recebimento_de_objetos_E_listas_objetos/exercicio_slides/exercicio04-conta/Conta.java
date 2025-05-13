/*4 - Crie uma classe Conta com os atributos titular e saldo. Crie um método depositar(Conta c, double valor) que receba a
 *  conta como parâmetro e aumente o saldo.
*/
package exercicio04;

public class Conta {
	private String titular;
	private double saldo;
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
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
		return "Conta titular: " + titular + ", saldo: " + saldo ;
	}
	
	
	
	

}
