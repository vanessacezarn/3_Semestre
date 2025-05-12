package exercicio06;

public class Gerente extends Funcionario {
	protected double bonusAnual;
	public Gerente(String nome, double salario,double bonus) {
		super(nome, salario);
		this.bonusAnual = bonus;
	}

}
