/*Crie uma classe Conta com atributos numero, titular e saldo. Crie uma lista de contas e adicione algumas 
 * contas nessa lista. Em seguida, crie um método que recebe uma lista de contas e retorna a conta com o maior
 *  saldo.Por fim, chame esse método passando a lista de contas e imprima os dados da conta com o maior saldo
*/
package exercicio13;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static String maiorValor(List<Conta>listaConta) {
		double maior=0;
		String conta="0000-0";
		for (Conta cc : listaConta) {
			if(cc.saldo>maior) {
				maior=cc.saldo;
				conta = cc.numero;
			}
		}
		return conta;
	}
	public static void main(String[] args) {
		List<Conta>listaConta = new ArrayList<>();
		Conta c = new Conta("4587-8","vanessa",514.55);
		listaConta.add(c);
		Conta c2 = new Conta("4236-0","luiza",51.50);
		listaConta.add(c2);
		Conta c3 = new Conta("5689-7","Amanda",789);
		listaConta.add(c3);
		Conta c4 = new Conta("8569","guilherme",14.55);
		listaConta.add(c4);
		String conta = maiorValor(listaConta);
		System.out.println("DADOS DA CONTA COM MAIOR SALDO");
		for(Conta cc : listaConta) {
			if(conta==cc.numero) {
				System.out.println(cc);
			}
		}
		
	}

}
