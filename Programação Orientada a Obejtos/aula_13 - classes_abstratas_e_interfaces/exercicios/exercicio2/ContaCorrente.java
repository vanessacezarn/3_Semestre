package exercicio02;

public class ContaCorrente extends Conta{

	@Override
	void Depositar(double deposito) {
		saldo = saldo + deposito;
		System.out.println("deposito realizado com sucesso");

	}

	@Override
	void Sacar(double saque) {
		if(saldo>=saque) {
			saldo=saldo-saque;
			System.out.println("saque realizado com sucesso");
		}else {
			if(saque<=(saldo+limite)) {
				saldo=saldo-saque;
				System.out.println("saque realizado com sucesso mas você entrou no limite");
			}else {
				System.out.println("saldo insuficiente");

			}
		}
	}

}
