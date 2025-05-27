//PROVA 27/05 - PROGRAMAÇÃO ORIENTADA A OBJETOS
// VANESSA CEZAR DO NASCIMENTO

package prova;

public class ProdutoEletronico extends Produto{
	
	public double garantia;
	
	public ProdutoEletronico(String nome, double precoBase, double percentualDesconto,double garantia) {
		super(nome, precoBase, percentualDesconto);
		this.garantia = garantia;
	
	}

	public void aplicarDesconto() {
		if(percentualDesconto == 0) {
			System.out.println("o produto não tem desconto");
		}else {
			desconto = (precoBase)*(percentualDesconto/100);
			System.out.println("o valor de desconto foi de : "+desconto);
		}
	}
	
	//SOBRECARGA
	public void aplicarDesconto(double valorDesconto) {
		if(valorDesconto ==0 ){
			System.out.println("o produto não tem desconto");
		}else {
			desconto = valorDesconto;
			System.out.println("o valor de desconto foi de : "+desconto);
		}
	}
	
	
	public void calcularPrecoFinal() {
		double precoFinal = precoBase - desconto + garantia;
		System.out.println("Preço final é de : "+precoFinal);
	}
	
	
	public void garantia() {
		System.out.println("O produto eletrônico tem garantia estendida que custa "+garantia);	
	}
	
	

	
	

	
	
	


	

	

	

	
	
}
