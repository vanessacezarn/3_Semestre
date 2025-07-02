package questao1;

public class FuncionarioCLT extends Funcionario {
	
	public double salarioFinal;
	
	public FuncionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
	}


	@Override
	public void exibirDados() {
		super.exibirDados();
	}
	
	@Override
	double calcularSalarioFinal() {
		salarioFinal = salarioBase+500;
		return salarioFinal;
	}
	
}
