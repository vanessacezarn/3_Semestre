package exercicio06;

public class Vendedor extends Funcionario{

	public Vendedor(String nome) {
		super(nome);
	}

	@Override
	void calcularSalario(double horas) {
		salario = 6.5 * horas;
	}

	@Override
	void exibeDados() {
		System.out.println("VENDEDOR");
		System.out.println("Nome: "+nome);
		System.out.println("Salario :" + salario);
	}

}
