//Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.
//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
package exercicio08;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1,n2,divisao;
		
		System.out.print("Digite dois valores:");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		
		if(n1>n2) {
			if(n2!=0) {
				divisao=n1%n2;
				if(divisao==0) {
					System.out.println("Os números digitados são MÚLTIPLOS");
				}else {
					System.out.println("Os números digitados NÃO são múltiplos");
				}
			}else {
				System.out.println("ERRO");
			}
		}else {
			if(n1<n2) {
				if(n1!=0) {
					divisao=n2%n1;
					if(divisao==0) {
						System.out.println("Os números digitados são MÚLTIPLOS");
					}else {
						System.out.println("Os números digitados NÃO são múltiplos");
					}
				}else {
					System.out.println("ERRO");
				}
			}else {
				System.out.println("Os números digitados são MÚLTIPLOS");//n1=n2-->TODO NÚMERO É MULTIPLO DE SI MESMO
			}
			
		}
		
		
	
		
	}

}
