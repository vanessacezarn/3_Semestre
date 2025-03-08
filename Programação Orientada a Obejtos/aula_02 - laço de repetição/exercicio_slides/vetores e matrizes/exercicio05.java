//5 - Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor.
package vetor_matriz_ex05;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int [] vetor = new int [10];
		int menor = 100000000 , maior = -1111111111;
		
		System.out.println("DIGITE 10 NÚMEROS INTEIROS");
		for(int i=0;i<10;i++) {
			System.out.print("número "+i+": ");
			vetor[i] = teclado.nextInt();
			
		}
		for(int i=0;i<10;i++) {
			if(vetor[i]>maior) {
				maior=vetor[i];
			}
			if(vetor[i]<menor) {
				menor=vetor[i];
			}
		}
		System.out.println("MAIOR VALOR DIGITADO = "+maior);
		System.out.println("MENOR VALOR DIGITADO = "+menor);
		
		
		
		
		
		
		
		teclado.close();
		

	}

}
