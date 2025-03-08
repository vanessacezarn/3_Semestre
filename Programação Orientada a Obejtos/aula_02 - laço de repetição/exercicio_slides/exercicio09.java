//9 - Escreva um programa Java que use um laço para imprimir os números primos de 1 a 50.
package exercicio09_repeticao;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, divisor = 0;
		int n;
		
		System.out.println("NÚMEROS PRIMOS");
		for(i=1;i<=50;i++) {
			divisor = 0;
			for(n=1;n<=i;n++) {
				if(i % n == 0) { 
					divisor ++;
				}
			}
			if(divisor==2) { //SE TIVER MAIS DE 2 DIVISORES NÃO É PRIMO 
				System.out.println(i);
			}
			
		}
			
			
		
	}

}
