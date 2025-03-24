//4) Crie uma classe ContaCorrente que obedeça à descrição abaixo:
//A classe possui o atributo saldo do tipo float e os métodos definirSaldoInicial, depositar e sacar.
//O método definirSaldoInicial deve atribuir o valor passado por parâmetro ao atribuito saldo
//O método depositar, deve adicionar o valor passado por parâmetro ao atributo saldo
//O método sacar deve reduzir o valor passado por parâmetro do saldo já existente
//Necessário verificar a condição de o valor do saldo ser insuficiente para o saque que se deseja fazer.
//O valor de retorno deve ser true (verdadeiro) quando for possível realizar o saque e false (falso) quando não for possível (public bool sacar(float valor))
//Crie uma classe ContaCorrente que obedeça à descrição abaixo (continuação):
//Crie um objeto novaConta do tipo ContaCorrente.
//Chame o método definirSaldoInicial passando o valor 1000 como parâmetro.
//Escreva o valor do atributo saldo ??
//Realize um saque de 500 reais (utilize o método sacar).
//Faça um depósito de 50 reais (utilize o método depositar)
//Escreva o valor do atributo saldo na tela.
//Realize um saque de 600 reais.
//Escreva o valor do atributo saldo na tela

package exercicio04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		ContaCorrente novaConta = new ContaCorrente();
		
		novaConta.definirSaldoInicial(1000);
		System.out.println("Saldo na conta é de : "+novaConta.saldo);
		
		boolean retorno;
		retorno = novaConta.sacar(500);
		if(retorno) {
			System.out.println("Saque realizado com sucesso !!!");
		}else {
			System.out.println("ERRO: não é possivel sacar esse valor, saldo na conta é insuficiente ");
			
		}
		novaConta.depositar(50);
		System.out.println("Saldo na conta é de : "+novaConta.saldo);
		
		retorno = novaConta.sacar(600);
		if(retorno) {
			System.out.println("Saque realizado com sucesso !!!");
		}else {
			System.out.println("ERRO: não é possivel sacar esse valor, saldo insuficiente na conta");
			
		}
		
		System.out.println("Saldo na conta é de : "+novaConta.saldo);

		
		
		teclado.close();
	}
	

}
