package exercicio1;

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Carro c1 = new Carro();
		System.out.println("CARRO 1");
		System.out.print("Digite a marca: ");
		c1.marca=teclado.nextLine();
		System.out.print("Digite o modelo: ");
		c1.modelo=teclado.nextLine();
		System.out.print("Digite o ano de fabricação:");
		c1.anoFabricacao=teclado.nextInt();
		
		
		Carro c2 = new Carro();
		System.out.println("CARRO 2");
		teclado.nextLine();
		System.out.print("Digite a marca: ");
		c2.marca=teclado.nextLine();
		System.out.print("Digite o modelo: ");
		c2.modelo=teclado.nextLine();
		System.out.print("Digite o ano de fabricação:");
		c2.anoFabricacao=teclado.nextInt();
		
		System.out.println("CARRO 1: marca = "+c1.marca+", modelo = "+c1.modelo+", ano de fabricação ="+c1.anoFabricacao);

		System.out.println("CARRO 2: marca = "+c2.marca+", modelo = "+c2.modelo+", ano de fabricação ="+c2.anoFabricacao);
		
		
		
		teclado.close();
	}

}
