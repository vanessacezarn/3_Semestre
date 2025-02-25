 //4 - Escreva um programa Java que use um laço para somar os números de 1 a 100.
package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		int i,soma=0;
		
		for(i=1;i<101;i++) {
			soma=soma+i;
		
		}
		System.out.print("SOMA DOS NÚMEROS DE 1 A 100 = ");
		System.out.println(soma);
	}

}
