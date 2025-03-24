//  PROBLEMA DO CODIGO --> NÃO GERA EMAIL PARA PESSOAS COM NOME E ULTIMO SOBRENOME IGUAIS, MESMO QUE O NOME DO MEIO SEJA DIFERENTE

//Listas: dicionário ou objeto
//Fazer um programa em Java, C# ou C++ que receba nomes completos de pessoas (validar se nome foi digitado completo).
// A partir disso, gerar email da pessoa combinando o primeiro nome com o último nome, separados por '.', mais 
//'@ufn.edu.br'. Por exemplo, João Pedro Garcia -> joao.garcia@ufn.edu.br.Uma vez que o email foi gerado, adicionar
// o par (nome completo e email) em uma lista. Essa lista pode ser composta por dicionários (email será a chave e
// nome completo o valor) ou por objetos (da classe Pessoa, com atributos nome e email). Contudo, não pode haver 
//emails repetidos.Ao final, exibir a lista com os dados (nomes e emails).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa{
    String nome;
    String email;

    public Pessoa (String nome, String email){
        this.nome = nome;
        this.email= email;
    }
}
public class exercio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        String nome;
        String email;
        int op=1;// VERIFICA SE DESEJA CADASTRAR MAIS UM NOME
        String vetorNome[]; // VERIFICAR SE O NOME DIGITADO É COMPOSTO POR PELO MENOS DUAS PALAVRAS
        int flag=0; //USADO PARA O CASO DE O NOME DIGITADO NÃO FOR COMPLETO

        while (op == 1){
            flag=0; // VOLTAR A SER ZERO PARA PODER PASSAR MAIS UMA VEZ PELO LOOP, EM CASO DE NOME INCOMPLETO

            System.out.print("Digite o nome completo: ");
            nome = teclado.nextLine().toLowerCase(); 
           
            vetorNome = nome.split(" ");// DIVIDIR O NOME DIGITADO A CADA ESPAÇO DIGITADO
            if(vetorNome.length<2){ //VERIFICA SE O NOME DIGITADO TEM NOME E SOBRENOME
                System.out.println("é necessario digitar o nome completo");
                flag=1; // SE O NOME DIGITADO NÃO FOR COMPLETO, FLAG PASSA A VALER 1 , O QUE FAZ O CODIGO RETORNAR PARA O INICIO DO LOOP
            }

            if(flag==0){ //SOMENTE GERA O EMAIL SE O NOME DIGTADO FOR COMPLETO
                email = vetorNome[0]+"."+vetorNome[vetorNome.length -1]+"@ufn.edu.br";

                Pessoa p = new Pessoa(nome,email);

                boolean emailexiste = false; //USADO PARA VERIFICAR SE O EMAIL GERADO JÁ EXISTE NA LISTA
                for (Pessoa i : pessoas){
                    if(i.email.equals(email)){
                        emailexiste = true;
                    }
                }
                if (emailexiste) {
                    System.out.println("Este e-mail já está cadastrado! Tente um nome diferente.");
                    continue; // RETORNA PARA O INICIO DO LOOP 
                }
                
                pessoas.add(p); //ADICIONA O NOME E O EMAIL A LISTA PESSOAS

                System.out.print("Deseja continuar: 1 - sim 2 - não: "); //PERGUNTA AO USARIO SE ELE DESEJA CADASTRAR MAIS NOMES
                op = teclado.nextInt();
                teclado.nextLine();
                if(op!=1 &&  op !=2){ //CASO O USUARIO DIGITE ALGO DIFETENTE OPÇÕES VALIDAS
                    System.out.println("Opção invalida!! - escolha uma opção válida");
                    System.out.print("Deseja continuar: (1- sim, 2- não): ");
                    op = teclado.nextInt();
                    teclado.nextLine();//LIMPAR O BUFFER
                }
            }
        }

        System.out.println("\nPessoas cadastradas:"); // EXIBI TODOS OS NOMES E EMAIL CADASTRADOS
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.nome + ", E-mail: " + p.email);
        }

        teclado.close();
    }
}
