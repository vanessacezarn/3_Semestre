//1 - Escreva um programa Java que use um vetor para ler 5 nomes de pessoas e depois os imprima na tela.
package vetor_matriz_ex01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		String [] nomes = new String [5];
		int i;
		
		for (i=0;i<5;i++) {
			System.out.print("Digite um nome:");
			nomes[i] = teclado.nextLine();	
		}
		
		System.out.println("\tNOMES DIGITADOS");
		for(i=0;i<5;i++) {
			System.out.println(nomes[i]);
		}
		
		
		
		teclado.close();
	}
	
}


