//VANESSA CEZAR DO NASCIMENTO - ATIVIDADE 1 - 18/02/2025
//2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendose que o preço do combustível é de R$4,90, 
//escreva um algoritmo para ler a marcação do odômetro (marcador de quilometragem) no início do dia, a marcação no final do dia, 
//o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. 
//Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia

package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double combustivel= 4.90;
		int odometroinicial, odometrofinal,totalkm;
		double combustivel_gasto,valor_gasto_combustivel;
		double valor_recebido;
		double media_consumo,lucro;
		
		System.out.print("Digite a marcação inicial do odômetro:");
		odometroinicial= teclado.nextInt();
		System.out.print("Digite a marcação final do odômetro:");
		odometrofinal= teclado.nextInt();
		totalkm=odometrofinal-odometroinicial;
	
		System.out.print("Digite o número de litros de combustivel gasto:");
		combustivel_gasto=teclado.nextDouble();
		
		System.out.print("Digite o valor total recebido dos passageiros em reais:");
		valor_recebido=teclado.nextDouble();
		
		media_consumo=totalkm/combustivel_gasto;
		valor_gasto_combustivel=combustivel*combustivel_gasto;
		lucro=valor_recebido-valor_gasto_combustivel;
		
		System.out.println("A média de consumo do taxi foi de "+media_consumo+" Km/l");
		System.out.println("O lucro dia foi de "+lucro+" reais");
		
		
	}

}
