package exercicio03;

public class Gerente extends Funcionario{

	public Gerente(String nome, double horasTrabalhadas) {
		super(nome, horasTrabalhadas);
		// TODO Auto-generated constructor stub
	}
	
	public void calcularSalario() {
		double salario = horasTrabalhadas*5;
		double salarioFinal = (salario*0.1)+salario;
		System.out.println("o salario do gerente "+nome+" é de "+salarioFinal);
	}

}
