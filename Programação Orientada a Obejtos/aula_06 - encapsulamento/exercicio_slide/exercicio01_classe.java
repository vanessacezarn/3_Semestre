//1 - Crie uma classe ContaBancaria que possua os atributos saldo e limite. Proteja os atributos utilizando encapsulamento.
//Crie os métodos get e set para cada atributo. Crie um método saque que permita ao usuário sacar um valor da conta, desde que
//não ultrapasse o limite da conta. Faça leitura pelo teclado.
package exercicio01;

public class ContaBancaria {
	private double saldo;
	private double limite;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void saque(double valor){
		if(saldo>=valor) {
			saldo=saldo-valor;
			System.out.println("Saque realizado com sucesso!!!");
		}else {
			if(valor<=(limite+saldo)) {
			saldo=saldo-valor;
			System.out.println("Saque realizado com sucesso!!!");
			System.out.println("Você entrou no limite da conta");
			}else {
			System.out.println("Salso insuficiente");
			}
		}
	}
	

	
}
