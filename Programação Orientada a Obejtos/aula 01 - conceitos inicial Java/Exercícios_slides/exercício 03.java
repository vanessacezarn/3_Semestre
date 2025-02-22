// 3 - Faça um algoritmo para ler um número e verificar se ele é par ou ímpar.
//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025

package exercicio03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int n,p;
		
		System.out.print("Digite um número:");
		n = teclado.nextInt();
		p = n%2;
		
		if(p==0)
			System.out.println("o número digitado é PAR");
		else
			System.out.println("o número digitado é ÍMPAR");
			

	}

}
