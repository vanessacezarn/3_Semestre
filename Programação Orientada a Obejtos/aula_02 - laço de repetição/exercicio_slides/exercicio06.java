//6- Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.

package exercicio06_repeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um número: ");
			n=teclado.nextInt();
			System.out.println("digite 0 para SAIR");
		}while(n!=0);
		
		if(n==0) {
			System.out.println("FIM DO PROGRAMA ");
		}
		
		teclado.close();
	}

}
