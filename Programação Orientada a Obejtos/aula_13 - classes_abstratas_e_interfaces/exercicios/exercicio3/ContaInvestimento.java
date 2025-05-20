package exercicio03;

public class ContaInvestimento extends Conta{
	

	@Override
	void Depositar(double deposito) {
		System.out.println("investimento realizado com sucesso na conta de investimento");	
		saldo = saldo+ deposito;
	}

	@Override
	void Sacar(double saque) {
		if(saldo>=saque) {
			saldo=saldo-saque;
			System.out.println("saque realizado com sucesso da conta de investimento");
		}else {
				System.out.println("saldo insufiente para realizar um saque na conta de investimento");

		}	
	}
}
