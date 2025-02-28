
import java.util.ArrayList;
import java.util.Random;


public class lista{
    public static void main(String[] args) { //atalho: psvm
        //codigo que popula uma lista com n numeros aleatorios inteiros
        ArrayList<Integer> lista = new ArrayList<>();
        
        Random gerador = new Random();
        int tamanho = gerador.nextInt(10,15);
        int numero;

        for (int i=0;i<tamanho;i++){
            numero = gerador.nextInt(50);
            if(!lista.contains(numero)){ // se o numero não tiver adicona
                lista.add(numero);
            }
        }

        //ordenar
        lista.sort(null);
       
        //exbir
        System.out.println("Exibindo por objetos...");
        System.out.println("Total de "+lista.size());
        for(Integer i : lista){
            System.out.println(i);
        }

        //apagar algum numero
        
        //numero = 15;
        /*if(lista.contains(15)){ //da certo mas não é a melhor opção 
            lista.remove(numero);//apaga apenas a primeira ocorrncia
            System.out.println("numero localizado e excluido");
        }else{
            System.out.println("numero não localizado");
        }*/

        if(lista.remove((Integer)15)){ //conversão pois o 15 é int e a lista é integer
            System.out.println("numero localizado e apagado");
        }else{
            System.out.println("numero não localizado");
        }

        //PERCORRER

        //percorre via indice 

       for (int i=0;i<tamanho;i++){
            if(lista.get(i) % 2 != 0){ 
                lista.set(i,-1); //coloca o -1 na posiçao i
            }
       }

        //exbir NOVAMENTE COM -1 NO LUGAR DOS IMPARES
        System.out.println("Exibindo por objetos...");
        System.out.println("Total de "+lista.size());
        for(Integer i : lista){
            System.out.println(i);
        }




    }
}
