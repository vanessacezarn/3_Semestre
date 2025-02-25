//3 - Escreva um programa Java que use um laço para imprimir a tabuada do 7.
package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=1;
		System.out.println("TABUADA DO 7");
		
		for(i=1;i<11;i++) {
			a=7*i;
			System.out.println("7 x "+i+" = "+a);
			a=1;
			
		}
	}

}
