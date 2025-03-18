package aula4_construtores;

public class Carro {
	public String marca;
	public String modelo;
	
	public Carro(String modeloCarro) {
		modelo = modeloCarro;
		
	}
	public Carro() { //QUANDO NÃO TEMOS CONSTRUTOR, COMPILADOR COMPREENDE ISSO!
		
	}
	public Carro(String modeloCarro,String marcaCarro) {
		modelo = modeloCarro;
		marca = marcaCarro;
	}
	
	
	
	public void exibirDados(){
		System.out.println("MODELO: "+modelo);
		System.out.println("MARCA: "+marca);

		
	}

}
