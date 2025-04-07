//2 - Crie uma classe Circulo que possua o atributo raio. Proteja o atributo utilizando encapsulamento. 
//Crie os métodos get e set para o atributo. Crie um método calculaArea que calcule a área do círculo e
//retorne o resultado. Faça leitura pelo teclado dos valores.

package exercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Circulo c = new Circulo();
		System.out.print("Digite o valor do raio do circulo: ");
		c.setRaio(teclado.nextDouble());
		double area;
		area = c.calculaArea();
		System.out.println("a area do circulo = "+area);
		
		
		teclado.close();
	}

}
