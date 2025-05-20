package exercicio02;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.saldo = 1500;
		cc.limite = 200;
		cc.Depositar(200);
		cc.Sacar(500);
		cc.Sacar(1800);
		cc.Sacar(1250);
	}
}
