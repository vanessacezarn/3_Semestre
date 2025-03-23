package exercicio06;

public class Aluno {
	String nome;
	int matricula=0;
	String data_nascimento;
	int ano_ingresso;
	
	public Aluno (String nomeAluno, int matriculaAluno) {
		nome = nomeAluno;
		matricula = matriculaAluno;
	}

	public Aluno(String data_nascimentoAluno) {
		data_nascimento = data_nascimentoAluno;
	}
	
	public Aluno(String nomeAluno, String data_nascimentoAluno, int ano_ingressoAluno) {
		nome = nomeAluno;
		data_nascimento = data_nascimentoAluno;
		ano_ingresso = ano_ingressoAluno;
	}
	
	public void exibir1(){
		System.out.println();
		System.out.println("OBJETO 1");
		System.out.println("NOME: "+nome);
		System.out.println("MATRICULA: "+matricula);
		System.out.println();
		
	}
	
	public void exibir2(){
		System.out.println("OBJETO 2");
		System.out.println("DATA DE NASCIMENTO: "+data_nascimento);
		System.out.println();
		
	}
	public void exibir3(){
		System.out.println("OBJETO 3");
		System.out.println("NOME: "+nome);
		System.out.println("DATA DE NASCIMENTO: "+data_nascimento);
		System.out.println("ANO DE INGRESSO: "+ano_ingresso);
	}
	
}
