//3 - Crie uma classe Retangulo que possua os atributos base e altura. Proteja os atributos utilizando 
//encapsulamento. Crie os métodos get e set para cada atributo. Crie um método calculaArea que calcule a área 
//do retângulo e retorne o resultado. Faça leitura pelo teclado dos valores.

package exercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		System.out.print("Digite o comprimento da base do retangulo: ");
		r.setBase(teclado.nextDouble());
		System.out.print("Digite o comprimento da altura do retangulo: ");
		r.setAltura(teclado.nextDouble());
		
		double area;
		area=r.calculaArea();
		System.out.println("A área do retangulo = "+area);
		
		teclado.close();

	}

}
