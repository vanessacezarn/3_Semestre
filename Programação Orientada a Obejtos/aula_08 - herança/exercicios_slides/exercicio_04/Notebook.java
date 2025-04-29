package exercicio4;

import java.util.Scanner;

public class Notebook extends Computador {
	
	public Notebook(String marca) {
		super(marca);
	}

	public void exibeMarca() {
		System.out.println("a marca: "+marca);
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a marca do notebook: ");
		String marca = teclado.nextLine();
		Notebook n = new Notebook(marca);
		n.exibeModelo();
		n.exibeMarca();
		teclado.close();
	}

}
