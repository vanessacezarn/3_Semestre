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

        List<Pessoa> pessoas = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        String nome;
        String email;
        int op=1;// VERIFICA SE DESEJA CADASTRAR MAIS UM NOME
        String vetorNome[]; // VERIFICAR SE O NOME DIGITADO É COMPOSTO POR PELO MENOS DUAS PALAVRAS
        int flag=0; //USADO PARA O CASO DE O NOME DIGITADO NÃO FOR COMPLETO

        do{
            flag=0;
            System.out.print("Digite o nome comleto: ");
            nome = teclado.nextLine().toLowerCase(); // LE O NOME E O TRANFORMA PARA MINUSCULO

            vetorNome = nome.split(" ");// DIVIDIR O NOME DIGITADO

            if(vetorNome.length<2){ //VERIFICA SE O NOME DIGITADO TEM NOME E SOBRENOME
                System.out.println("é necessario digitar o nome completo");
                flag=1; // SE O NOME DIGITADO NÃO FOR COMPLETO, FLAG PASSA A VALER 1 , O QUE FAZ O CODIGO RETORNAR PARA O INICIO DO DO...WHILE
            }
            if(flag==0){
                email = vetorNome[0]+"."+vetorNome[vetorNome.length -1]+"@ufn.edu.br";
                // equals - para comparar emails
      
                Pessoa p = new Pessoa(nome,email);
                pessoas.add(p); //ADICIONA O NOME E O EMAIL A LISTA PESSOAS

                System.out.print("Deseja continuar: 1 - sim 2 - não");
                op = teclado.nextInt();
                teclado.nextLine();
            }
        }while(op == 1);

        System.out.println("\nPessoas cadastradas:");
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.nome + ", E-mail: " + p.email);
        }

        teclado.close();
    }
}
