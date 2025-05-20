package exercicio03;


public class ContaCorrente extends Conta{

	@Override
	void Depositar(double deposito) {
		saldo = saldo + deposito;
		System.out.println("deposito realizado com sucesso na Conta Corrente");

	}

	@Override
	void Sacar(double saque) {
		if(saldo>=saque) {
			saldo=saldo-saque;
			System.out.println("saque realizado com sucesso na ContaCorrente");
		}else {
			if(saque<=(saldo+limite)) {
				saldo=saldo-saque;
				System.out.println("saque realizado com sucesso mas você entrou no limite da Conta Corrente");
			}else {
				System.out.println("saldo insuficiente na Conta Corrente");

			}
		}
	}

}
