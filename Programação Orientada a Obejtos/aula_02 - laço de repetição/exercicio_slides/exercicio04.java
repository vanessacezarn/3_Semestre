 //4 - Escreva um programa Java que use um laço para somar os números de 1 a 100.
package exercicio04_repeticao;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,soma=0;
		for(i=0;i<101;i++) {
			soma=soma+i;
		}
		System.out.println("Soma dos números de 1 a 100 = "+soma);
	}

}
