//Faça um programa para leitura de dois números e após faça as quatro operaçõesmatemáticas (Soma, Subtração, Multiplicação e divisão)
//faça um menu utilizando switch case

//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
package exercicio10;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1,n2;
		double soma,subtracao,multiplicacao,divisao;
		int opcao;
				
		System.out.println("\t***MENU***");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICÃO");
		System.out.println("4 - DIVISÃO");
		
	
		do{
			System.out.print("Escolha uma das opções do menu: ");
		    opcao=teclado.nextInt();
		    
		    if(opcao<1 || opcao>4) {
		    	System.out.println("Opção inválida");
		    }
		}while(opcao<1 || opcao>4);
		
		System.out.print("Informe dois números: ");
		n1=teclado.nextDouble();
		n2=teclado.nextDouble();
		
		switch(opcao) {
			case 1 :
				soma=n1+n2;
				System.out.println("SOMA: "+ n1 + " + " + n2 +" = "+ soma);
				break;
			case 2 :
				subtracao=n1-n2;
				System.out.println("SUBTRAÇÃO: "+ n1 + " - " + n2 +" = "+ subtracao);
				break;
			case 3 :
				multiplicacao=n1*n2;
				System.out.println("MULTIPLICAÇÃO: "+ n1 + " * " + n2 +" = "+ multiplicacao);
				break;
			case 4 :
				if(n2==0) {
					System.out.println("DIVISÃO = OPERAÇÃO INVALIDA: não é possivel divisão por 0");
				}else {
					divisao=n1/n2;
					System.out.println("DIVISÃO: "+ n1 + " / " + n2 +" = "+ divisao);
				}
				
				break;
		}
		
	}

}
