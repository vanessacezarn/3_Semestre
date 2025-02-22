// Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em qual quadrante o ponto se encontra no plano cartesiano 
//ou se o ponto está sobre um dos eixos.

//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
package exercicio05;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x,y;
		System.out.print("Digite as coordenadas de um ponto (x,y) :");
		x=teclado.nextInt();
		y=teclado.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("O ponto informado está no PRIMEIRO quadrante");
		}else {
			if(x>0 && y<0) {
				System.out.println("O ponto informado está no QUARTO quadrante");
			}else {
				if(x<0 && y>0) {
					System.out.println("O ponto informado está no SEGUNDO quadrante");
				}else {
					if(x<0 && y<0) {
						System.out.println("O ponto informado está no TERCEIRO quadrante");
					}else {
						if(x==0 && y==0) {
							System.out.println("O ponto informado está na ORIGEM do sistema cartesiano");
						}else {
							if(x==0 && y!=0) {
								System.out.println("O ponto está sobre o EIXO Y");
							}else {
								if(x!=0 && y==0) {
									System.out.println("O ponto está sobre o EIXO X");
								}
							}
						}
					}
				}
			}
		}

	}

}
