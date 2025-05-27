//PROVA 27/05 - PROGRAMAÇÃO ORIENTADA A OBJETOS
// VANESSA CEZAR DO NASCIMENTO

package prova;

public class ProdutoAlimenticio extends Produto {
	public int validade;
	
	public ProdutoAlimenticio(String nome, double precoBase, double percentualDesconto, int validade) {
		super(nome, precoBase, percentualDesconto);
		this.validade = validade;
		
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
		if(validade<10) {
			precoFinal = precoBase/2; // SE O PRODUTO FOR VENCER DENTRO DE 10 DIAS O PREÇO CAI PELA METADE
		}else {
			precoFinal = precoBase-desconto;
		}
		System.out.println("Preço final é de : "+precoFinal);
	}
	
	public void validade() {
		if(validade<10) {
			System.out.println("O produto está perto da data de validade, o preço dele cairá pela metade");
		}
	}
}
