// 5 - Escreva um programa Java que use um laço para calcular o fatorial de umnúmero inteiro.
package exercicio05_repeticao;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n,i,fatorial=1;
		
		System.out.print("Digite um número para calcular o seu fatorial: ");
		n=teclado.nextInt();
		
		for(i=n;i>=1;i--) {
			fatorial=fatorial*i;
		}
		
		System.out.println(n+"! = "+fatorial);
		
		teclado.close();
	}

}
