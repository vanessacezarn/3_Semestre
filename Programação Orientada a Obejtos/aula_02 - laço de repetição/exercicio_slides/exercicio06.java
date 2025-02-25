package exercicio06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		
		do{
			System.out.print("digite um número inteiro: ");
			n=teclado.nextInt();
		}while(n!=0);
		
		
		teclado.close();
	}

}
