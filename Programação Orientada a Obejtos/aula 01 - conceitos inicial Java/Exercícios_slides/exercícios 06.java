// Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles

//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
package exercicio06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1,n2,n3,maior;
		
		System.out.println("Digite 3 valores:");
		n1=teclado.nextDouble();
		n2=teclado.nextDouble();
		n3=teclado.nextDouble();
		
		maior=n1;
		if(n2>maior) {
			maior=n2;
		}
		if(n3>maior) {
			maior=n3;
		}

		System.out.println("O maior valor digitado = "+maior);
	}

}
