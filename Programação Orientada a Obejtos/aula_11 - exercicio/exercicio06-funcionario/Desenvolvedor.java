package exercicio06;

public class Desenvolvedor extends Funcionario {
	protected double horasExtras;
	public Desenvolvedor(String nome, double salario, double horas) {
		super(nome, salario);
		this.horasExtras = horas;
	}
	public void aumentarSalario() {
		double total = salario + (horasExtras*8);
		System.out.println(" salario final é de "+total);
	}
}
