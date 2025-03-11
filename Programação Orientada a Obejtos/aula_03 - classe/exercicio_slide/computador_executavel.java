package exercicio2;

import java.util.Scanner;

public class ComputadorExecut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Computador c1= new Computador();
		System.out.println("COMPUTADOR 1");
		System.out.print("Digite a marca:");
		c1.marca = teclado.nextLine();
		System.out.print("Digite a modelo:");
		c1.modelo = teclado.nextLine();
		System.out.print("Digite o tipo - notebook ou netbook ou tablet ou etc:");
		c1.tipo = teclado.nextLine();
		System.out.println("Digite o preço:");
		c1.preco = teclado.nextDouble();
		
		Computador c2 = new Computador();
		c2.marca = "Dell";
		c2.modelo = "Gamer Dell G15";
		c2.tipo = "Notebook";
		c2.preco = 6.399;
		
		System.out.println("COMPUTADOR 1: "+"marca: "+c1.marca +", modelo: "+c1.modelo+", tipo: "+c1.tipo+", preço: "+c1.preco);
		System.out.println("COMPUTADOR 2: "+"marca: "+c2.marca +", modelo: "+c2.modelo+", tipo: "+c2.tipo+", preço: "+c2.preco);

		
		teclado.close();

	}

}
