//4 - Crie uma classe Carro que possua os atributos marca, modelo e ano. Proteja os atributos utilizando 
//encapsulamento. Crie os métodos get e set para cada atributo. Crie um método exibeDetalhes que exibe os
//detalhes do carro. Faça leitura pelo teclado dos valores

package exercicio04;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	
	public String getMarca() {
		return marca;
	}
	

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

	public void exibidetalhes() {
		System.out.println("\nDetalhes sobre o carro digitado");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Ano: "+ano);
	}
	
	
}
