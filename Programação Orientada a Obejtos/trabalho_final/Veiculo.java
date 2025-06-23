package pkg;

public class Veiculo {
	private String placa;
	private String modelo;
	private String marca;
	private int anoDeFabricacao;
	private double quilometragem;
	
	
	
	public Veiculo(String placa, String modelo, String marca, int anoDeFabricacao, double quilometragem) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anoDeFabricacao = anoDeFabricacao;
		this.quilometragem = quilometragem;
	}

	public String getPlaca() {
		return placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	
	public double getQuilometragem() {
		return quilometragem;
	}
	
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", anoDeFabricacao="
				+ anoDeFabricacao + ", quilometragem=" + quilometragem + "]";
	}
	
	
	
}
