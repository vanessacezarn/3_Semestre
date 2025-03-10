// 8 - Escreva um programa Java que use um vetor para armazenar 10 números inteiros lidos do usuário e depois imprima na tela quantos números 
//são pares e quantos são ímpares.

package vetor_matriz_ex08;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int [] vetor = new int [10];
		int i,par=0,impar=0;
		
		for (i=0;i<10;i++) {
			System.out.print("Digite o elemento "+i+" : ");
			vetor[i]=teclado.nextInt();
			if(vetor[i]%2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println();
		System.out.println("DOS NÚMEROS DIGITADO "+par+" SÃO PARES E "+impar+" SÃO ÍMPARES");
		
		teclado.close();
	}

}

