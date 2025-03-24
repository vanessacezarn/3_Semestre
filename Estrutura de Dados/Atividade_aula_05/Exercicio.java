//VANESSA CEZAR DO NASCIMENTO 

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
//CLASSE PARA VERIFICAR SE O EMIAL GERADO JA EXISTE E CASO JÁ EXISTA GERAR UM NOVO COM UM CONTADOR 
class verificaemail{ 
    List<String>listaEmail;

    public verificaemail(){
        listaEmail = new ArrayList<>();
    }

    public String verificaAdiconaEmail(String email){
        String emailFinal = email;
        int contador=1;
        boolean emailexiste = false;

        for(String i: listaEmail){
            if(i.equals(emailFinal)){
                emailexiste=true;
            }
        }

        if(emailexiste){ //CASO O EMAIL JA EXISTA É ADICIONADO UM CONTADOR AO EMAIL
            emailFinal = email.split("@")[0] + contador + "@ufn.edu.br" ;
            //DIVIDI O EMAIL ANTES DO @ ADICIONA O CONTADOR E O "@ufn.edu.br"
            contador++;
        }

        listaEmail.add(emailFinal);
        return emailFinal;
    }
}




public class exercio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        verificaemail verificaEmail = new verificaemail();
        //verificaemail verificaEmail = new verificaemail();
        String nome;
        String email;
        int op=1;// VERIFICA SE DESEJA CADASTRAR MAIS UM NOME
        String vetorNome[]; // VERIFICAR SE O NOME DIGITADO É COMPOSTO POR PELO MENOS DUAS PALAVRAS
        int flag=0; //USADO PARA O CASO DE O NOME DIGITADO NÃO FOR COMPLETO

        while(op==1){
            
            flag=0;
            System.out.print("Digite o nome completo: ");
            nome = teclado.nextLine().toLowerCase(); // LE O NOME E O TRANFORMA PARA MINUSCULO
           
            vetorNome = nome.split(" ");// DIVIDIR O NOME DIGITADO
            if(vetorNome.length<2){ //VERIFICA SE O NOME DIGITADO TEM NOME E SOBRENOME
                System.out.println("é necessario digitar o nome completo");
                flag=1; // SE O NOME DIGITADO NÃO FOR COMPLETO, FLAG PASSA A VALER 1 , O QUE FAZ O CODIGO RETORNAR PARA O INICIO DO DO...WHILE
            }
            if(flag==0){ //SOMENTE GERA O EMAIL SE O NOME DIGTADO FOR COMPLETO
                email = vetorNome[0]+"."+vetorNome[vetorNome.length -1]+"@ufn.edu.br";
                
                String emailFinal = verificaEmail.verificaAdiconaEmail(email);
                Pessoa p = new Pessoa(nome,emailFinal);
                pessoas.add(p); //ADICIONA O NOME E O EMAIL A LISTA PESSOAS

                System.out.print("Deseja continuar: (1- sim, 2- não): "); //PERGUNTA AO USARIO SE ELE DESEJA CADASTRAR MAIS NOMES
                op = teclado.nextInt();
                teclado.nextLine();
                if(op!=1 &&  op !=2){
                    System.out.println("Opção invalida!! - escolha uma opção válida");
                    System.out.print("Deseja continuar: (1- sim, 2- não): ");
                    op = teclado.nextInt();
                    teclado.nextLine();
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
