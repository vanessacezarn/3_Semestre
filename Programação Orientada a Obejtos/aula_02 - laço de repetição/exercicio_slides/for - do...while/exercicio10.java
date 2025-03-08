//10 - Escreva um programa Java que use um para calcular a média de vários números reais lidos do usuário até que seja lido o número 0.
package exercicio10_repeticao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double soma=0,n;
		double media;
		int i=0;
		do {
			System.out.print("Digite um número(para sair digite 0) :");
			n = teclado.nextDouble();
			if(n!=0) {//PARA QUE QUANDO O ZERO FOR DIGITADO ELE NÃO ENTRE NO CONTADOR i
				soma=soma+n;
				i++;
			}
		}while(n!=0);
		
		if(i>0) {
		media=soma/i;
		System.out.println("A MÉDIA DOS VALORES DIGITADOS = "+media);
		}
		else {
			System.out.println("NENHUM VALOR FOI DIGITADO"); //CASO DO PRIMEIRO VALOR DIGITADO SEJA O 0
		}
		teclado.close();

	}

}
