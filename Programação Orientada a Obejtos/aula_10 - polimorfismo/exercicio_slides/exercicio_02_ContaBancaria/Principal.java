package exercicio02_contaBancaria;

public class Principal {

	public static void main(String[] args) {

		ContaBancaria cb = new ContaBancaria(100);
		cb.calcularSaldo();
		
		ContaCorrente cc = new ContaCorrente(1500);
		cc.calcularSaldo();
	}

}
