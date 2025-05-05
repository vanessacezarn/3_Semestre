package exercicio03_pessoa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	
		
		Pessoa p = new Pessoa();
		System.out.print("digite uma mensagem que será exibida apenas uma vez: ");
		String mensagem = teclado.nextLine();
		p.falar(mensagem);
		
		System.out.print("\ndigite o quantas vezes deseja que uma mensagem seja repetida: ");
		int repeticoes = teclado.nextInt();
		teclado.nextLine();
		System.out.print("digite a mensagem a ser repetida: ");
		String mensagem2 = teclado.nextLine();
		p.falar(mensagem2, repeticoes);
		
		teclado.close();
	}

}
