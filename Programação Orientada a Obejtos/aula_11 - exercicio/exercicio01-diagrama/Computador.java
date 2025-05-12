package exercicio01;

public class Computador {
	protected String marca;
	private String modelo;
	
	public Computador(String marca) {
		super();
		this.marca = marca;
		this.modelo = "Portatil";
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
	
	public void exibeModelo() {
		System.out.println("modelo: "+modelo);
	}
	
	
}
