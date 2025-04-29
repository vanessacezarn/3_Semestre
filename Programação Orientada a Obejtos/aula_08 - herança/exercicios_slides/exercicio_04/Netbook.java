package exercicio4;

import java.util.Scanner;

public class Netbook extends Computador {

	public Netbook(String marca) {
		super(marca);
	}
	public void exibeMarca() {
		System.out.println("marca: "+marca);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a marca do netbook: ");
		String marca = teclado.nextLine();
		Netbook ne = new Netbook(marca);
		ne.exibeModelo();
		ne.exibeMarca();
		teclado.close();
	}

}
