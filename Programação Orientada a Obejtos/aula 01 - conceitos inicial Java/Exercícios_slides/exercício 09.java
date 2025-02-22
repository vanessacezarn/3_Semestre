//Escreva um algoritmo para ler a idade de uma pessoa e mostrar qual sua situação de eleitor, conforme as seguintes condições:
//Se a idade for menor que 16 anos, informar que a pessoa não está apta a votar.
//Se a idade for maior ou igual a 16 anos e menor que 18 anos ou superior a 70 anos, informar que o voto é facultativo.
//Caso contrário, informar que o voto é obrigatório. 

//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
package exercicio09;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = teclado.nextInt();
		
		if(idade<16) {
			System.out.println("NÃO está apto a votar");
		}else {
			if(idade>16  && idade<18 || idade>70) {
				System.out.println("voto é FACULTATIVO");
			}else {
				System.out.println("voto é OBRIGATÓRIO");
			}
		}

	}

}
