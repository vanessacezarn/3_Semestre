package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("*** SISTEMA DE CADASTRO DE VEÍCULOS ***");

		Veiculo vei;
		List<Veiculo>listaVeiculos = new ArrayList<Veiculo>();
		Arquivo arquivo = new Arquivo("Veiculos");
		listaVeiculos = arquivo.leArquivo();
		String opc;
		
		do {
			System.out.println("\tMENU");
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Alterar quilometragem do veículo");
			System.out.println("3 - Excluir veículo pelo número da placa");
			System.out.println("4 - Sair do sistema");
			System.out.print("Escolha uma das opções acima : ");
			opc = teclado.nextLine();
			
			if(opc.equals("1")) {
				System.out.println("----------------------------------------------");
				System.out.println("\tCADASTRANDO VEÍCULOS");
				System.out.print("Digite a placa do veículo : ");
				String placa = teclado.nextLine().toUpperCase();
				int encontrado = 0;
				for (Veiculo v : listaVeiculos) {
					if(v.getPlaca().equals(placa)) {
						encontrado = 1;
					}
				}
				if(encontrado == 0) {
					System.out.print("Digite o modelo do veículo : ");
					String modelo = teclado.nextLine();
					System.out.print("Digite a marca do veículo : ");
					String marca = teclado.nextLine();
					System.out.print("Digite o ano de fabricação do veículo : ");
					int anoFabricacao = teclado.nextInt();
					System.out.print("Digite a quilometragem do veículo : ");
					Double quilometragem = teclado.nextDouble();
					
					vei = new Veiculo(placa,modelo,marca,anoFabricacao,quilometragem);
					listaVeiculos.add(vei);
					System.out.println("CADASTRO REALIZADO COM SUCESSO!!!");
					arquivo.gravaArquivo(listaVeiculos);
				}else {
					System.out.println("A placa digitada já está cadastrada no sistema");
				}
				System.out.println("---------------------------------------------");

			}else if(opc.equals("2")) {
				System.out.println("----------------------------------------------");
				System.out.println("\tALTERAR QUILOMETRAGEM");
				System.out.print("Digite a placa do veículo que deseja fazer a alteração : ");
				String alterar = teclado.nextLine().toUpperCase();
				int encontrado = 0 ;
				for (Veiculo v : listaVeiculos) {
					if(v.getPlaca().equals(alterar)) {
						encontrado = 1;
						System.out.print("Digite a nova quilometragem : ");
						double nova = teclado.nextDouble();
						v.setQuilometragem(nova);
						arquivo.gravaArquivo(listaVeiculos);
						System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!!!");
					}
				}
				if(encontrado == 0) {
					System.out.println("Placa digitada não pertence a nenhum carro cadastrado no sistema");
				}
				
				System.out.println("---------------------------------------------");

				
			}else if (opc.equals("3")) {
				System.out.println("----------------------------------------------");
				System.out.println("\tEXCLUIR VEÍCULO");
				System.out.print("Digite a placa do veículo que deseja excluir do sistema:");
				String excluir = teclado.nextLine().toUpperCase();
				int encontrado = 0 ;
				for(Veiculo v : listaVeiculos) {
					if(v.getPlaca().equals(excluir)) {
						listaVeiculos.remove(v);
						arquivo.gravaArquivo(listaVeiculos);
						System.out.println("VEÍCULO EXCLUIDO COM SUCESSO!!!!");
					}
				}
				if(encontrado == 0) {
					System.out.println("Placa digitada não pertence a nenhum carro cadastrado no sistema");
				}
				System.out.println("----------------------------------------------");
				
			}else if(opc.equals("4")) {
				System.out.println("----------------------------------------------");
				System.out.println("\tSAINDO DO SISTEMA");
				System.out.println("----------------------------------------------");

			}else {
				System.out.println("----------------------------------------------");
				System.out.println("\tOPÇÃO INVÁLIDA!!!! Tente novamente");
				System.out.println("----------------------------------------------");
			}
			
		}while(!opc.equals("4"));
		
		
		teclado.close();
	}

}
