//4 - Crie uma classe Carro que possua os atributos marca, modelo e ano. Proteja os atributos utilizando 
//encapsulamento. Crie os métodos get e set para cada atributo. Crie um método exibeDetalhes que exibe os
//detalhes do carro. Faça leitura pelo teclado dos valores


package exercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Carro c = new Carro();
		
		System.out.print("Digite a marca do carro: ");
		c.setMarca(teclado.nextLine());
		System.out.print("Digite o modelo do carro: ");
		c.setModelo(teclado.nextLine());
		System.out.print("Digite o ano do carro: ");
		c.setAno(teclado.nextInt());
		c.exibidetalhes();
		
		teclado.close();

	}

}
