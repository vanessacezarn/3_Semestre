package aula03;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner teclado = new Scanner(System.in);
			
			//Pessoa p; // declara que vai existir uma classe pessoa mas ainda não pode usar 
			//p= new Pessoa(); // CHAMANDO pessoa e cria uma alocaçao de memoria
			Pessoa p =  new Pessoa();
			System.out.println("Pessoa 1 instanciada!");
			
			p.nome = "VANESSA";
			p.idade = 22;
			//System.out.println("nome: "+p.nome);
			System.out.println("idade 1: "+p.idade);
			
			
			//INSTANCIEM E ATRIBUAM NOVA CLASSE
					
			Pessoa p2= new Pessoa();
			System.out.println("Pessoa 2 instanciada!");
			
			p2.nome="aaa";
			p2.idade=1;
			//System.out.println("nome 2: "+p2.nome);
			System.out.println("idade 2: "+p2.idade);
			
			Pessoa p3= new Pessoa();
			System.out.println("Pessoa 3 instanciada!");
			
			p3.idade = 25;
			System.out.println("idade 3: "+p3.idade);
			
			teclado.close();
	}

}

