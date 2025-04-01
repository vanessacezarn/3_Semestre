//1 - Crie uma classe ContaBancaria que possua os atributos saldo e limite. Proteja os atributos utilizando encapsulamento.
//Crie os métodos get e set para cada atributo. Crie um método saque que permita ao usuário sacar um valor da conta, desde que
//não ultrapasse o limite da conta. Faça leitura pelo teclado.

package exercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ContaBancaria c = new ContaBancaria();
		c.setSaldo(1000);
		c.setLimite(200);
		
		int op;
		do {
		System.out.println("\n \tMENU");
		System.out.println("1-verificar saldo");
		System.out.println("2 - realizar saque");
		System.out.println("3 - sair");
		System.out.print("digite a opção: ");
		op = teclado.nextInt();
			
		if(op ==1) {
			System.out.println("\nSALDO = "+c.getSaldo());
		}
		if(op==2) {
			double saque;
			System.out.print("\nDigite o valor que deseja sacar: ");
			saque=teclado.nextDouble();
			c.saque(saque);
		}
		if(op==3) {
			System.out.println("Fim do programa");
		}
		if(op!=1 && op !=2 && op!=3) {
			System.out.println("opção invalida");
		}
		}while(op !=3);
		teclado.close();
	}

}
