//3) Crie uma classe chamada Pessoa. Nesta classe deve conter os atributos: Nome, email, data de nascimento, Endereço e o atributo Admin do 
//tipo booleano. Crie um método que retorne o Email da pessoa. Crie um método chamado promoverAdmin que ao ser chamado altera o atributo Admin.
//Faça a leitura de duas pessoas na main e mantenha uma como admin e outra não.

package exercicio03;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Pessoa p = new Pessoa();
		System.out.println("PESSOA 1");
		System.out.print("Digite o nome:");
		p.nome=teclado.nextLine();
		System.out.print("Digite o email:");
		p.email=teclado.nextLine();
		System.out.print("Digite a data de nascimeto:");
		p.data_nascimento=teclado.nextLine();
		System.out.print("Digite o endereço:");
		p.endereco=teclado.nextLine();
		String retorno;
		retorno = p.Email();
		//System.out.println("o email da pessoa 1 é "+retorno);
		Pessoa p2 = new Pessoa();
		System.out.println("PESSOA 2");
		System.out.print("Digite o nome:");
		p2.nome=teclado.nextLine();
		System.out.print("Digite o email:");
		p2.email=teclado.nextLine();
		System.out.print("Digite a data de nascimeto:");
		p2.data_nascimento=teclado.nextLine();
		System.out.print("Digite o endereço:");
		p2.endereco=teclado.nextLine();
		p2.Email();
		String retorno2;
		retorno2 = p2.Email();
		
		System.out.println();
		System.out.println("o email da pessoa 1 é "+retorno);
		System.out.println("o email da pessoa 2 é "+retorno2);
		System.out.print("pessoa 2 : ");
		p2.promoverAdmin();
		
		
		teclado.close();
	}

}
