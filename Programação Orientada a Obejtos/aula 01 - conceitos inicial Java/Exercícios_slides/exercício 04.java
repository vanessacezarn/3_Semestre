//4 - Escrever um algoritmo para ler quatro valores inteiros, calcular a sua média, e escrever na tela os que são superiores à média.
//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025

package exercicio04;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1,n2,n3,n4;
		double media;
		
		System.out.print("Digite 4 valores inteiros:");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		n3=teclado.nextInt();
		n4=teclado.nextInt();
		
		media=(n1+n2+n3+n4)/4.0;
		System.out.println("a MÉDIA dos valores digitados = "+media);
		System.out.print("valores acima da média: ");
		
		if(n1>media) 
			System.out.print(n1+"  ");
		if(n2>media) 
			System.out.print(n2+"  ");
		if(n3>media) 
			System.out.print(n3+"  ");
		if(n4>media) 
			System.out.print(n4+"  ");
		
		if(n1<=media && n2<=media && n3<=media && n4<=media) {
			System.out.print("nenhum numero é acima da media");
		}

	}

}
