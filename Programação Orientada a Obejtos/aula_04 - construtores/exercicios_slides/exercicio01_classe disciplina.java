//1) Crie uma classe Disciplina que contenha os atributos (nome, carga horária e nome do professor) e os métodos de atribuir 
//e recuperar esses valores.
//Mostre na tela:
//a) O conteúdo original dos atributos
//b) A opção para o usuário inserir os valores
//c) A exibição do novo conteúdo dos atributos

package exercicio01;

public class Disciplina {
	String nome;
	int cargaHoraria;
	String nomeProfessor;

	public void atribuir(String disciplina, int carga, String professor) {
		nome = disciplina;
		cargaHoraria = carga;
		nomeProfessor = professor;
	}
	
	public void recuperar() {
		
	}
	public void exibir() {
		System.out.println("Nome da disciplina : "+nome);
		System.out.println("Carga horária : " +cargaHoraria);
		System.out.println("Professor da disciplina : "+nomeProfessor);
	}
}
