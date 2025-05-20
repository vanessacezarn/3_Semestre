package exercicio06;

public class Gerente extends Funcionario {

	public Gerente(String nome) {
		super(nome);
	}

	@Override
	void calcularSalario(double horas) {
		salario = horas * 8 + 400; // BOIFICAÇÃO DE 800 REAIS MENSAIS
	}

	@Override
	void exibeDados() {
		System.out.println("GERENTE");
		System.out.println("Nome: "+nome);
		System.out.println("Salario :" + salario);
	}


}
