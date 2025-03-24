//1) Crie uma classe Disciplina que contenha os atributos (nome, carga horária e nome do professor) e os métodos de atribuir 
//e recuperar esses valores.
//Mostre na tela:
//a) O conteúdo original dos atributos
//b) A opção para o usuário inserir os valores
//c) A exibição do novo conteúdo dos atributos

package exercicio01;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		int cargaHoraria;
		String nomeProfessor;
		
		Disciplina d = new Disciplina();
		System.out.println("a) O conteúdo original dos atributos"); //todos os atributos iniciaram nulos
		d.recuperar();
		System.out.println();
		
		System.out.println("b) Insira os dados");
		System.out.print("nome da disciplina: ");
		nome=teclado.nextLine();
		System.out.print("carga horaria da disciplina: ");
		cargaHoraria=teclado.nextInt();
		teclado.nextLine();
		System.out.print("nome do professor da disciplina: ");
		nomeProfessor=teclado.nextLine();
		d.atribuir(nome, cargaHoraria, nomeProfessor);
		System.out.println();
		
		System.out.println("c) A exibição do novo conteúdo dos atributos");
		d.recuperar();
		
		teclado.close();
		
	}
}
