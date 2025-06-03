//Crie uma classe Triangulo com três atributos: lado1, lado2 e lado3. Crie um construtor que inicialize esses atributos e um método
//validarTriangulo que lance uma exceção IllegalArgumentException caso os valores informados não formem um triângulo válido 
//(por exemplo, se a soma de dois lados for menor ou igual ao terceiro lado).

package pkg2;


public class Triangulo {
	public double lado1;
	public double lado2;	
	public double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public void validarTriangulo() throws MinhaExcecao {
		if((lado1+lado2)<= lado3 || (lado1+lado3)<= lado2 || (lado3+lado2)<= lado1) {
			throw new MinhaExcecao ("valores informados não formam um triangulo");
		}else {
			System.out.println("triangulo valido!!");
		}
	}

	

	
}
