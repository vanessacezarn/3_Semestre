// 4 - Escreva um programa Java que use uma matriz para ler as notas de 3 alunos em 4 disciplinas e depois calcule e imprima a média de cada disciplina.
package vetor_matriz_ex04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		double [][] notas = new double[3][4];
		int i,j;
		double media = 0, soma=0;
		for ( i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1));
			for(j=0;j<4;j++) {
				System.out.print("Digite a nota da disciplina "+(j+1)+" :");
				notas[i][j] = teclado.nextDouble();
				
			}
		}
		
		
		for(j=0;j<4;j++) {
			soma=0;
			media=0;
			for(i=0;i<3;i++) {
				soma = soma + notas[i][j];
			}
			media = soma/3;
			System.out.println("Disciplina "+(j+1)+" MEDIA =  "+media);
			
		}
	
		
		teclado.close();
	}

}
