/*Crie uma classe Aluno com atributos nome, nota1 e nota2. Crie uma lista de alunos e adicione alguns alunos
 *  nessa lista. Em seguida, percorra a lista e calcule a média de cada aluno. Se a média for maior ou igual a 6,
 *   imprima que o aluno foi aprovado. Caso contrário, imprima que o aluno foi reprovado.
*/
package exercicio10;

public class Aluno {
		protected String nome;
		protected double nota1;
		protected double nota2;
		public Aluno(String nome, double nota1, double nota2) {
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getNota1() {
			return nota1;
		}
		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}
		public double getNota2() {
			return nota2;
		}
		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}
		
		
		

}
