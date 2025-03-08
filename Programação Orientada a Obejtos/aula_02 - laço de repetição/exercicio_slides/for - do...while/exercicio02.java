//2 - Escreva um programa Java que use um laço para imprimir os números pares de 2 a 20.

package exercicio02_repeticao;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Números pares de 2 a 20:");
		for(i=2;i<21;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
			

	}

}
