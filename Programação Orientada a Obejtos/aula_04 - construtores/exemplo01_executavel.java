package aula4_construtores;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			String ma,mo;
			System.out.print("Digite a marca do carro:");
			ma=teclado.nextLine();
			System.out.print("Digite a modelo do carro:");
			mo=teclado.nextLine();
			
			Carro c = new Carro(mo,ma); //CHAMADA DO CONSTRUTOR
			//c.marca = "Ford";
			//c.modelo = "Corcel";
			c.exibirDados();
			
			Carro c2  = new Carro("saveiro");
			c2.marca = "VW";
			System.out.println();
			c2.exibirDados();
			
			Carro c3 = new Carro();
			c3.marca = "Fiat";
			c3.modelo = "Uno";
			System.out.println();
			c3.exibirDados();
			
			
			
			
			teclado.close();
	}

}
