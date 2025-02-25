package matriz;

import java.util.Scanner;

public class Matrizusuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [][] matriz = new int[3][3];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print("Digite o elemento "+i+"-"+j+": ");
				matriz[i][j]=teclado.nextInt();
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		teclado.close();

	}

}
