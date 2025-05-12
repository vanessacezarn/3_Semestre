package exercicio03;

public class Principal {

	public static void main(String[] args) {

		Funcionario f = new Funcionario("vanessa",500);
		f.calcularSalario();
		f.setHorasTrabalhadas(555);
		f.calcularSalario();
		
		Gerente g = new Gerente("Guilherme",550);
		g.calcularSalario();
		
	}

}
