/*1 - Crie uma classe Aluno com os atributos nome e notaFinal. Em seguida, crie uma classe Boletim com um método imprimirStatus(Aluno a) 
 * que imprime se o aluno foi aprovado (nota = 6) ou reprovado.*/
package exercicio01;

public class Aluno {
	private String nome;
	private double notaFinal;
	private Boletim boletim;
	

	public Aluno(String nome, double notaFinal, Boletim boletim) {
		super();
		this.nome = nome;
		this.notaFinal = notaFinal;
		this.boletim = boletim;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	public Boletim getBoletim() {
		return boletim;
	}
	
	
	
}
