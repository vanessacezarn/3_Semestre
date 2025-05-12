package exercicio03;

public class Funcionario {
	protected String nome;
	protected double horasTrabalhadas;
	
	public Funcionario(String nome, double horasTrabalhadas) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}



	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}



	public void calcularSalario() {
		double salario = horasTrabalhadas*5;
		System.out.println("o salario do funcionario "+nome+" é de "+salario);
	}
}
