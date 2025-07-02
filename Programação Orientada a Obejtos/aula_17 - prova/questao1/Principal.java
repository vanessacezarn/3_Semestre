package questao1;

public class Principal {

	public static void main(String[] args) {

		FuncionarioCLT fc = new FuncionarioCLT("Vanessa",1500);
		fc.exibirDados();
		System.out.println("Salário final: "+fc.calcularSalarioFinal());
		
		System.out.println("--------------");
		
		FuncionarioPJ fp = new FuncionarioPJ("Luiza",1800);
		fp.exibirDados();
		System.out.println("Salário final: "+fp.calcularSalarioFinal());
	
	}

}
