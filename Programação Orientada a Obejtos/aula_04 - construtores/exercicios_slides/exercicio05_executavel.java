//5) Criar uma classe chamada Pessoa com 2 construtores, um que receba o nome e a idade da pessoa e outro recebendo apenas a idade. 
//Solicite ao usuário qual dos construtores ele gostaria de utilizar na instanciação da classe. Além de receber parâmetros,
//os construtores imprimem na tela o conteúdo dos parâmetros recebidos.

package exercicio05;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.println("Qual construtor deseja usar?");
		int op;
		do {
		System.out.println("1 - para construtor 1 (nome e a idade da pessoa)");
		System.out.println("2 - para construtor 2 (idade da pessoa)");
		op = teclado.nextInt();
		teclado.nextLine();
		if(op!=1 && op!=2) {
			System.out.println("OPÇÃO INVÁLIDA - escolha uma opção válida");
		}
		}while(op!=1 && op!=2);
		
		if(op==1) {
			
			System.out.print("Digite o nome: ");
			nome = teclado.nextLine();
			System.out.print("Digite a idade: ");
			idade = teclado.nextInt();
			Pessoa p = new Pessoa(nome,idade);
			
		}else {
			System.out.print("Digite a idade: ");
			idade = teclado.nextInt();
			Pessoa p2 = new Pessoa(idade);
		}
		teclado.close();
	
	}
}
