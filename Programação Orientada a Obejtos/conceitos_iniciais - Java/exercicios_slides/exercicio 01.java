//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
//1 - Faça um programa para leitura de dois números e após faça as quatro operações matemáticas (Soma, Subtração, Multiplicação e divisão)
//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025

package exercicio01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1,n2;
		double soma,subtração,multiplicação,divisão=0;
		//divisão começou valendo 0 pois estava dando problema no if
		
		System.out.println("Digite dois números:");
		n1=teclado.nextDouble();
		n2=teclado.nextDouble();
		
		soma=n1+n2;
		System.out.println("SOMA = "+soma);
		subtração=n1-n2;
		System.out.println("SUBTRAÇÃO = "+subtração);
		multiplicação=n1*n2;
		System.out.println("MULTIPLICAÇÃO = "+multiplicação);
		if(n2!=0) {
			divisão=n1/n2;
			System.out.println("DIVISÃO = "+divisão);
		}else {
			System.out.println("DIVISÃO = OPERAÇÃO INVALIDA: não é possivel divisão por 0");
		}
		
				

	}

}
