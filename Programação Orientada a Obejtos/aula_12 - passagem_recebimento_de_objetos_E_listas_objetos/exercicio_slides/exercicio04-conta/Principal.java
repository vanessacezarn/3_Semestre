package exercicio04;

public class Principal {
	public static void depositar(Conta c, double valor) {
		double deposito = c.getSaldo() + valor;
		c.setSaldo(deposito);
		
	}

	public static void main(String[] args) {

		Conta c = new Conta("vanessa",1500);
		System.out.println(c);

		System.out.println("Realizando depósito");
		depositar(c,520);
		System.out.println(c);
		
	}

}
