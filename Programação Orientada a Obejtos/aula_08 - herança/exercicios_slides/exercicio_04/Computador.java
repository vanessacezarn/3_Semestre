package exercicio4;

public class Computador {
	protected String marca;
	private String modelo = "Portátil";
	
	public Computador(String marca) {
		super();
		this.marca = marca;
		this.modelo = "Portátil";
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public void exibeModelo() {
		System.out.println("Exibindo detalhes do computador");
		System.out.println("modelo: "+modelo);
	}
	

}
