//7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.package exercicio07_repeticao;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double nota;
		int i=1;
		do {
			System.out.print("Digite a nota do aluno "+i+":");
			nota=teclado.nextDouble();
			i++;
			System.out.println("para SAIR digite -1");
		}while(nota!=-1);
		
		if(nota==-1) {
			System.out.println("FIM DO PROGRAMA");
		}
		teclado.close();
	}

}
