//6 - Escreva um programa Java que use um vetor para ler os nomes de 5 cidades e outro vetor para armazenar as suas respectivas populações e 
//depois imprima na tela o nome da cidade mais populosa.

package vetor_matriz_ex06;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String[] cidade = new String [5];
		double [] populacao = new double[5];
		double populosa = -1111111111;
		int i,a=0;
		for (i=0;i<5;i++) {
			System.out.print("Digite o nome da cidade: ");
			cidade[i] = teclado.nextLine();
			System.out.print("Digite a populção da cidade digitada a cima: ");
			populacao[i]=teclado.nextDouble();
			teclado.nextLine();
			if(populacao[i]>populosa) {
				populosa = populacao[i];
				a=i;
				
			}
		}
		
		System.out.println("A cidade mais populosa é "+cidade[a]+" e ela contém uma população de "+populosa);
		
		teclado.close();
		
	}

}

