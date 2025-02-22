// Escreva um algoritmo que leia 3 valores pelo teclado e então informe os valores informados em ordem crescente.

//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
package exercicio07;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1,n2,n3,maior,menor,meio;
		
		System.out.print("Digite 3 valores:");
		n1=teclado.nextDouble();
		n2=teclado.nextDouble();
		n3=teclado.nextDouble();
		
		//MAIOR VALOR
		if(n1>n2 && n1>n3) {
			maior=n1;
		}else {
			if(n2>n1 && n2>n3) {
				maior=n2;
			}else {
				maior=n3;
			}
		}
		
		//MENOR VALOR
		if(n1<n2 && n1<n3) {
			menor=n1;
		}else {
			if(n2<n1 && n2<n3) {
				menor=n2;
			}else {
				menor=n3;
			}
		}
		
		//VALOR DO MEIO
		if(n1!=menor && n1!=maior) {
			meio=n1;
		}else {
			if(n2!=menor && n2!=maior) {
				meio=n2;
			}else {
				meio=n3;
			}
		}
		
		
		System.out.print("valores informados em ordem crescente: ");
		System.out.println(menor+" , "+meio+" , "+maior);
	}

}
