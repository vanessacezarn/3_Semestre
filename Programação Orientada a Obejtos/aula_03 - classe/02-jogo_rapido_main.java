package jogorapido;

import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Professor p = new Professor();
		Laboratorio l = new Laboratorio ();
		
		p.nome = "Ricardo da Silva";
		l.local = "Sala 311";
		System.out.println("o nome do professor é "+p.nome);
		System.out.println("o local da aula é "+l.local);
		
		
		Professor p2 = new Professor();
		Laboratorio l2 = new Laboratorio ();
		System.out.println("nome do professor: ");
		p2.nome= teclado.nextLine();
		System.out.println("sala de aula: ");
		l2.local = teclado.nextLine();
		System.out.println("o nome do professor é "+p2.nome);
		System.out.println("o local da aula é "+l2.local);
		
		teclado.close();
	}

}
