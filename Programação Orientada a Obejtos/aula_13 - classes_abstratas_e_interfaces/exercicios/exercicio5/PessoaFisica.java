package exercicio05;

public class PessoaFisica extends Pessoa {
	public String cpf;
	

	public PessoaFisica(String nome, String cidade,String cpf) {
		super(nome, cidade);
		this.cpf = cpf;
	}

	@Override
	void efetuarCompra() {
		System.out.println("PESSOA FÍSICA");
		System.out.println("o cliente "+nome+", cpf: "+cpf+" esta realizando uma compra na cidade "+cidade);
	}

}
