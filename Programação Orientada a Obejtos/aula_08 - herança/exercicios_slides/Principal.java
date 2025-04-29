/*3) Crie uma classe chamada Pessoa que herda da classe SerHumano os
atributos nome e idade e o método falar. A classe SerHumano também
possui herança e herda o atributo tipo e o método andar da classe Animal.
Desse modo, crie uma classe Principal para exibir na tela o conteúdo de
todos os atributos e realizar a chamada de todos os métodos envolvidos no
processo. O método falar retorna a string “Nem todos falam” e o método
andar imprime na tela a string “Todos andam, mas o modo é variado”.
Solicite ao usuário para informar o nome, a idade e o tipo.*/
package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o tipo da pessoa:");
		String tipo=teclado.nextLine();
		System.out.println("Digite o nome da pessoa:");
		String nome=teclado.nextLine();
		System.out.println("Digite a idade da pessoa:");
		int idade=teclado.nextInt();
		
		Pessoa p = new Pessoa(tipo, nome, idade);
		
		System.out.println("\nInformações");
		System.out.print("tipo: "+p.tipo);
		System.out.print("nome: "+p.nome);
		System.out.print("idade: "+p.idade);
		String fala=p.falar();
		System.out.println(fala);
		p.andar();
		
		teclado.close();
	}

}
