/*6) Crie uma classe abstrata chamada Funcionario com os atributos Nome e Salário. Crie também um método abstrato
 *  chamado CalcularSalario. Crie duas classes que herdam de Funcionario, uma chamada Gerente e outra chamada 
 *  Vendedor, que implementam o método CalcularSalario.
*/
package exercicio06;

public abstract class Funcionario {
	public String nome;
	public double salario;
	
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	abstract void calcularSalario(double horas);
	
	abstract void exibeDados();
	
}
