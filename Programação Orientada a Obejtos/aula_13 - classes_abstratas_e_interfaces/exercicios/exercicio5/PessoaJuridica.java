package exercicio05;

public class PessoaJuridica extends Pessoa {
	public String cnpj;
	public PessoaJuridica(String nome, String cidade, String cnpj) {
		super(nome, cidade);
		this.cnpj= cnpj;
	}

	@Override
	void efetuarCompra() {
		System.out.println("PESSOA Juridica");
		System.out.println("o cliente "+nome+", cnpj: "+cnpj+" esta realizando uma compra na cidade "+cidade);		
	}

}
