//• 3 - Crie uma classe Pessoa com os atributos nome, idade e gênero. Imprimaas informações da pessoa na tela.

package exercicio3;

import java.util.Scanner;

public class Pessoa {
	public String nome;
	public int idade;
	public String genero;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.print("Digite o nome:");
		p.nome=teclado.nextLine();
		System.out.print("Digite a idade:");
		p.idade=teclado.nextInt();
		System.out.print("Digite o gênero:");
		teclado.nextLine();
		p.genero=teclado.nextLine();
		
		System.out.println("Nome:"+p.nome+", Idade: "+p.idade+", Gênero: "+p.genero);

		
		
		
		
		teclado.close();

	}
}
