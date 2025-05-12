package exercicio01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("1-notebook");
		System.out.println("2-netbook");
		System.out.println("escolha uma opção");
		int op = teclado.nextInt();
		teclado.nextLine();
		if (op ==1) {
			System.out.println("digite a marca do notebook");
			String marca = teclado.nextLine();
			Notebook n = new Notebook(marca);
			n.exibeModelo();
			n.exibeMarca();
		}else if(op==2){
			System.out.println("digite a marca do netbook");
			String marca = teclado.nextLine();
			Netbook ne = new Netbook(marca);
			ne.exibeModelo();
			ne.exibeMarca();
		}
		teclado.close();
	}
}
