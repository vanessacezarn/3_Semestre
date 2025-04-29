package questao10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int op=12;
		Produto p = new Produto();
		
		
		do {
			System.out.println("\tMENU");
			System.out.println("1 - Criar produto informando nome");
			System.out.println("2 - Criar produto informando nome e preço");
			System.out.println("3 - Exibir informações do produto");
			System.out.println("4 - Atribuir nome do produto ");
			System.out.println("5 - Obter nome do produto");
			System.out.println("6 - Atribuir preço do produto");
			System.out.println("7 - Obter preço do produto");
			System.out.println("8 - Atribuir quantidade em estoque");
			System.out.println("9 - Obter quantidade em estoque");
			System.out.println("0 - SAIR");
			System.out.print("Digite uma das opções acima: ");
			op = teclado.nextInt();
			teclado.nextLine();
			
			if(op==1) {
				
				System.out.println("Opção escolhida 1 - Criar produto informando nome ");
				System.out.print("Informe o nome do produto:");
				String nome = teclado.nextLine();
				p = new Produto(nome);
				

				
			}else if(op==2) {
				System.out.println("Opção escolhida 2 - Criar produto informando nome e preço");
				System.out.print("Informe o nome do produto:");
				String nome = teclado.nextLine();
				System.out.print("Informe o preço do produto:");
				double preco = teclado.nextDouble(); 		
				p = new Produto(nome,preco);
				
			}else if(op==3) {
				System.out.println("Opção escolhida 3 - Exibir informações do produto");
				p.exibirInformacoes();
				
				
			}else if(op==4) {
				System.out.println("Opção escolhida 4 - Atribuir nome do produto");
				System.out.print("Digite o nome do produto: ");
				String nome = teclado.nextLine();
				p.setNome(nome);
			}else if(op==5) {
				System.out.println("Opção escolhida 5 - Obter nome do produto");
				System.out.println("O nome do produto é "+p.getNome());
				
			}else if(op==6) {
				System.out.println("Opção escolhida 6 - Atribuir preço do produto");
				System.out.print("Digite o preço do produto: ");
				Double preco = teclado.nextDouble();
				p.setPreco(preco);
				
			}else if(op==7) {
				System.out.println("Opção escolhida 7 - Obter preço do produto");
				System.out.println("O preço do produto é de "+p.getPreco());
				
			}else if(op==8) {
				System.out.println("Opção escolhida 8 - Atribuir quantidade em estoque");
				System.out.print("Digite a quantidade em estoque do produto: ");
				int quantia = teclado.nextInt();
				p.setQuantidadeEstoque(quantia);
			}else if(op==9) {
				System.out.println("Opção escolhida 9 - Obter quantidade em estoque");
				System.out.println("Em estoque há "+p.getQuantidadeEstoque()+" produtos");
				
			}else if(op==0) {
				System.out.println("FIM DO PROGRAMA");
				
			}else {
				System.out.println("OPÇÃO INVALIDA");
			}
			
				
		}while(op != 0);
		
		
		teclado.close();
	}

}
