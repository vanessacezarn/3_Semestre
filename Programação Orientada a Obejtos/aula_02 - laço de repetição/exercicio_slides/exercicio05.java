// 5 - Escreva um programa Java que use um laço para calcular o fatorial de umnúmero inteiro.
package exercicio05;
import java.util.Scanner;


public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n,i,res=1;
		
		System.out.println("Digite um numero para calcular o fatorial:");
		n=teclado.nextInt();
		
		for(i=n;i>=1;i--) {
		res *= i;
			
		}
		System.out.println(res);
	
		teclado.close();
	}
	

}

