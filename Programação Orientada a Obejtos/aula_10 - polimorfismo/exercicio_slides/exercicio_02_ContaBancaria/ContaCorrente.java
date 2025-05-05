package exercicio02_contaBancaria;

public class ContaCorrente extends ContaBancaria{

	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	public void calcularSaldo() {
		System.out.println("saldo da conta corrente : "+saldo);
	}

}
