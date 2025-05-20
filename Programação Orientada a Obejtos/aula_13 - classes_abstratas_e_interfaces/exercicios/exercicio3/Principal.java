package exercicio03;


public class Principal {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.saldo = 1500;
		cc.limite = 200;
		cc.Depositar(1000);
		cc.Sacar(5000);
		cc.Sacar(450);
		
		System.out.println("\n");
		
		ContaInvestimento ci = new ContaInvestimento();
		ci.saldo = 0;
		ci.limite=0;
		ci.Depositar(2000);
		ci.Sacar(1800);
		ci.Sacar(800);
	}

}
