
/*Crie uma classe Aluno com atributos nome, nota1 e nota2. Crie uma lista de alunos e adicione alguns alunos
 *  nessa lista. Em seguida, percorra a lista e calcule a média de cada aluno. Se a média for maior ou igual a 6,
 *   imprima que o aluno foi aprovado. Caso contrário, imprima que o aluno foi reprovado.
*/package exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Aluno>listaAlunos = new ArrayList<>();
		Aluno a = new Aluno("Vanessa",8,8.4);
		listaAlunos.add(a);
		
		Aluno a2 = new Aluno("Luiza",4,9.4);
		listaAlunos.add(a2);
		
		Aluno a3 = new Aluno("Guilherme",5,5.9);
		listaAlunos.add(a3);
		
		Aluno a4 = new Aluno("Amanda",9,8.4);
		listaAlunos.add(a4);
		
		for (Aluno al : listaAlunos) {
			double notaF = (al.nota1 + al.nota2)/2;
			if(notaF  >= 6) {
				System.out.println("Aluno(a) "+al.nome+" situação APROVADO");
			}else {
				System.out.println("Aluno(a) "+al.nome+" situação REPROVADO");
			}
		}
	}

}
