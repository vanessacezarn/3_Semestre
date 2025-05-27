//PROVA 27/05 - PROGRAMAÇÃO ORIENTADA A OBJETOS
// VANESSA CEZAR DO NASCIMENTO
package prova;

public class  Produto {
	protected String nome;
	protected double precoBase;
	protected double percentualDesconto;
	protected double desconto = 0;

	public Produto(String nome, double precoBase, double percentualDesconto) {
		super();
		this.nome = nome;
		this.precoBase = precoBase;
		this.percentualDesconto = percentualDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	
	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public void aplicarDesconto() {
		if(percentualDesconto == 0) {
			System.out.println("o produto não tem desconto");
		}else {
			desconto = (precoBase)*(percentualDesconto/100);
			System.out.println("o valor de desconto foi de : "+desconto);
		}
	}
	
	public void calcularPrecoFinal() {
		double precoFinal;
		precoFinal = precoBase-desconto;
		System.out.println("Preço final é de : "+precoFinal);
	}
	
	
	

}

