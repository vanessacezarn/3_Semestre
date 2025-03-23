//6) Criar uma classe chamada Aluno com 3 construtores, sendo que o primeiro recebe o nome e a matrícula do aluno, o segundo recebe 
//apenas a data de nascimento do aluno e o terceiro construtor recebe o nome do aluno, a data de nascimento e o ano em que o aluno 
//ingressou na faculdade.Crie uma classe principal, com 3 objetos, cada um instanciando a classe com um construtor diferente.

package exercicio06;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		int matricula;
		String data_nascimento;
		int ano_ingresso;
		
		
		System.out.print("Digite o nome do aluno:");
		nome = teclado.nextLine();
		System.out.print("Digite a data de nascimento do aluno:");
		data_nascimento=teclado.nextLine();
		System.out.print("Digite a matricula do aluno :");
		matricula=teclado.nextInt();
		System.out.print("Digite o ano de ingresso do aluno:");
		ano_ingresso=teclado.nextInt();

		
		Aluno a1 = new Aluno(nome,matricula);
		a1.exibir1();
		Aluno a2 = new Aluno(data_nascimento);
		a2.exibir2();
		Aluno a3 = new Aluno(nome,data_nascimento, ano_ingresso);
		a3.exibir3();
		
		
		
			
		
		teclado.close();
	}

}
