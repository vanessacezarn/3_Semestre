//BASEADO NO CODIGO ANTERIOR (LISTA DE INTEGER), CONSTRUIR UM PROGRAMA EM JAVA QUE RECEBA, VIA TECLADO DO USUARIO, N NOMES DE PESSOAS. ASSIM COMO O PRIMEIRO CODIGO:
//1) NÃO PODE HAVER NOMES DUPLICADOS 
//2) AO FINAL DO CADASTRO, A LISTA PRECISARÁ SER ORDENADA 
//3) O CODIGO DEVE PERMITIR QUE O USUARIO DIGITE UM NOME PARA PESQUISA E O PROGRAMA EXCLUA ESSE NOME DA LISTA
//4) EXIBIR NOVAMENTE A LISTA 
//-EM JAVA,COMO COLOCAR MAISCULO UM NOME ANTES DE ARMAZENA-LO NA LISTA.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
       ArrayList<String> lista = new ArrayList<>();
       Scanner teclado = new Scanner(System.in);
       String nome;

       Random gerador = new Random();
       int tamanho = gerador.nextInt(1,10);
       System.out.println("Quantia de nome a serem digitados "+tamanho);

       for(int i=0; i<tamanho;i++){
        System.out.print("Digite um nome:");
        nome = teclado.nextLine().toUpperCase();
        if(!lista.contains(nome)){ 
            lista.add(nome);
        }
       }
lista.sort(null);

       System.out.println("Exibindo por ordem alfabetica os números digitados...");
       System.out.println("Total de "+lista.size());
        for(String i : lista){
            System.out.println(i);
        }



        teclado.close();
    }
    
}
