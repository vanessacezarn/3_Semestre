package exercicio04;

public class Principal {

	public static void main(String[] args) {

		Cheque c = new Cheque();
		c.setValor(250);
		ContaBancaria cb = new ContaBancaria("1234-5",1500);
		System.out.println("a conta "+cb.numeroConta+" tem saldo de "+cb.saldo);
		cb.depositar(100);
		System.out.println("a conta "+cb.numeroConta+" tem saldo de "+cb.saldo);	
		cb.depositar(c.getValor());
		System.out.println("a conta "+cb.numeroConta+" tem saldo de "+cb.saldo);

	}
	

}
