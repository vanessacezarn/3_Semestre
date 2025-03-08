//8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido
package exercicio08_repeticao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		
		do {
			System.out.print("Digite o nome de uma cidade:");
			nome=teclado.nextLine();
		}while(!nome.equals("São Paulo"));
		
		
		System.out.println("FIM DO PROGRAMA");
		
		teclado.close();
	}

}
