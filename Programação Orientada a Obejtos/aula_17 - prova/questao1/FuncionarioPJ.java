package questao1;

public class FuncionarioPJ extends Funcionario {

	
	public FuncionarioPJ(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
		
	@Override
	public void exibirDados() {
		super.exibirDados();
	}


	@Override
	double calcularSalarioFinal() {
		return salarioBase;
	}

}
