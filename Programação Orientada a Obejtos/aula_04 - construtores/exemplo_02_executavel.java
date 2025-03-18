package pkg2;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Carro c = new Carro();
		System.out.print("Digite a marca do carro:");
		c.marca=teclado.nextLine();
		System.out.print("Digite a modelo do carro:");
		c.modelo=teclado.nextLine();
		c.exibirDados();
		System.out.println();
		c.alugar();
		c.alugar();
		c.alugar();
		System.out.println();
		c.exibirDados();
		c.devolver();
		c.devolver();
		System.out.println();
		c.exibirDados();
		
		
		
		
		teclado.close();
	}

}
