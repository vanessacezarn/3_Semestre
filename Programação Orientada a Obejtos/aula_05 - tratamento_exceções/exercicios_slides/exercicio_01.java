//1 - Escreva um programa que solicita ao usuário para digitar um número inteiro e exiba a raiz quadrada desse número. Certifique-se de que 
//o programa trate adequadamente as exceções se o usuário digitar um valor inválido, por exemplo, ler um char ou string.

package exercicios_slidses;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		double raiz;
		
		System.out.print("Digite um número inteiro: ");
		//n = teclado.nextInt();
		try {
		n = teclado.nextInt();
		raiz= Math.sqrt(n);
		System.out.println("raiz ="+raiz);
		}catch(Exception e) {
			System.out.println("exceção:"+e.toString());
			System.out.println("programa continua");
			
		}
	
		
		teclado.close();
	}

}
//ERRO : InputMismatchException
