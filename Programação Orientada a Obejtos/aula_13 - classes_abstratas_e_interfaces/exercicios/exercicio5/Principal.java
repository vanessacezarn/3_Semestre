package exercicio05;

public class Principal {

	public static void main(String[] args) {
		Pessoa pf = new PessoaFisica("vanessa","santa maria","03715");
		pf.efetuarCompra();
		
		Pessoa pj = new PessoaJuridica("luiza","são borja","1234555");
		pj.efetuarCompra();
		
	}

}
