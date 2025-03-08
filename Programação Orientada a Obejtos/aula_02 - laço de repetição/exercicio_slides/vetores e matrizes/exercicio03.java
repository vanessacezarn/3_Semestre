//3 - Escreva um programa Java que use um vetor para ler as notas de 5 alunos e depois calcule e imprima a média das notas.
package vetor_matriz_ex03;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double [] notas = new double[5];
		double soma=0,media;
		for(int i=0;i<5;i++) {
			System.out.print("Digite a nota do aluno "+i+": ");
			notas[i] = teclado.nextDouble();
			soma = soma + notas[i];
		} 
		
		media=soma/5;
		System.out.println("A MÉDIA DA NOTAS DIGITADAS = "+media);
		
		teclado.close();
		
	}

}
