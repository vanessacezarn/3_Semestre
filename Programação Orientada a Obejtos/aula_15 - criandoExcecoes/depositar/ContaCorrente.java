package depositar;

import pkg.MinhaExcecao;

public class ContaCorrente extends Conta{


	
	@Override
	void Depositar(double valor) throws MinhaExcecao{
		if(valor<0) {
			throw new MinhaExcecao ("Impossivel depositar valor negativo");
		}else {
			saldo=saldo+valor;
			System.out.println("Deposito realizado com sucesso!!\n saldo = "+saldo);
		}
	}

	@Override
	void Sacar(double valor) throws MinhaExcecao {
		if(valor>(saldo+limite) ) {
			throw new MinhaExcecao ("Impossivel sacar SALDO INSUFICIENTE");
		}else {
			if(valor<0) {
				throw new MinhaExcecao ("Impossivel sacar valor negativo");

			}else {
				saldo = saldo - valor;
				System.out.println("saque realizado com sucesso!!\n saldo = "+saldo);
			}
		}
	}

}
