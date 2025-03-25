//3 – Faça o tratamento de exceções em conversões de valores lidos pelo teclado. Por exemplo, ao ler uma string e converter ela para double

package exercicios_slidses;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra;
		System.out.print("Digite uma palavra: ");
		palavra=teclado.nextLine();
		try {
		double valor;
		valor = Integer.parseInt(palavra); // ERRO ESPERADO : NumberFormatException	
		}catch(Exception e){
			System.out.println("exceção: "+e.toString() );
		}
		System.out.println("CONTINUA");
		
		teclado.close();
	}
	
	
}


