import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        String nomeCompleto;
        Scanner teclado = new Scanner(System.in);

        String vetorNome[];
        do{
        System.out.print("Nome Completo:");
        nomeCompleto = teclado.nextLine();
        nomeCompleto = nomeCompleto.toUpperCase();
        vetorNome = nomeCompleto.split(" ");// DIVIDIR O NOME DIGITADO
        if(vetorNome.length<2){
            System.out.println("é necessario digitar o nome completo");
        }
        }while(vetorNome.length<2);
        
       /* for (int i = 0; i< vetorNome.length; i++){
            System.out.println(vetorNome[i]);
        }*/
        //Somente o ultimo sobrenome
        System.out.println(vetorNome[vetorNome.length -1]);

        // CRIAÇÃO DO EMAIL
        String email = vetorNome[0] + "." + vetorNome[vetorNome.length -1] + "@ufn.edu.br";
        email = email.toLowerCase();
        System.out.println(email);
        //System.out.println(nomeCompleto);

        teclado.close();
    }
}
