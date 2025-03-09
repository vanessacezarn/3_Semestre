// 7 - Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a 
//nota mais baixa em cada disciplina

package vetor_matriz_ex07;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int [][] notas = new int[3][4];
		int i,j;
		int maior, menor;
		
		
		for ( i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1));
			for(j=0;j<4;j++) {
				System.out.print("Digite a nota da disciplina "+(j+1)+" :");
				notas[i][j] = teclado.nextInt();
				
			}
		}
		
		
		for(j=0;j<4;j++) {
			maior = -9999999;
			menor = 9999999;
			for(i=0;i<3;i++) {
				
				if(notas[i][j]>maior) {
					maior = notas[i][j];
				}
				if(notas[i][j]<menor) {
					menor = notas[i][j];
				}
			}
			System.out.println("Disciplina "+(j+1)+" : ");
			System.out.println("MAIOR NOTA = "+maior);
			System.out.println("MENOR NOTA = "+menor);
			System.out.println();
		}
	
		
		teclado.close();

	}

}
