package exercicio01;

	abstract class Conta {
		public double saldo;
		public double limite;
		
		abstract void Depositar(double deposito) ;
		
		abstract void Sacar(double saque);

}
