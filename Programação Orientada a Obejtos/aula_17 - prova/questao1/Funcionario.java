package questao1;

public abstract class Funcionario {
	public String nome;
	public double salarioBase;
		
	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public void exibirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Salário base : "+salarioBase);
	}
	
	abstract double calcularSalarioFinal();
}
