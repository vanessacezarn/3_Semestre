import java.util.ArrayList;

public class ListaLista{

    public static void main(String[] args) {
        ArrayList<Integer>lista1 = new ArrayList<>();
        ArrayList<Integer>lista2 = new ArrayList<>();
        ArrayList<Integer>lista3 = new ArrayList<>();
        ArrayList<ArrayList>listaPrincipal = new ArrayList<>();
        

        lista1.add(126);
        lista1.add(14);
        lista1.add(895);
        lista1.add(644);
        listaPrincipal.add(lista1);

       
        lista2.add(26);
        lista2.add(14);
        lista2.add(39);
        listaPrincipal.add(lista2);

        lista3.add(89);
        lista3.add(170);
        listaPrincipal.add(lista3);

        System.out.println("Exibindo as listas");
        for(ArrayList lista:listaPrincipal){
            System.out.println(lista);
        }

        //EXIBINDO A LISTA INTEIRA DA PRIMEIRA POSIÇÃO
        System.out.println("\nEXIBINDO A LISTA INTEIRA NA PRIMERIA POSIÇÃO:");
        System.out.println(listaPrincipal.get(0));

        //EXIBINDO ITEM A ITEM DA LISTA PRINCIPAL NA PRIMEIRA  POSIÇÃO
        System.out.println("\n EXIBINDO ITEM A ITEM DA LSITA PRINCIPAL NA PRIMEIRA POSIÇÃO");
        for(Object i: listaPrincipal.get(0)){
            System.out.println(i);
        }

        //EXIBINDO OS PARES DA LISTA PRINCIPAL, ANALISANDO ITEM A ITEM DAS LISTAS INTERNAS
        System.out.println("EXIBINDO OS PARES DA LISTA PRINCIPAL, ANALISANDO ITEM A ITEM DAS LISTAS INTERNAS");
        for(ArrayList lista:listaPrincipal){
            for(Object i : lista){

            System.out.println(lista);
            }
        }

        

    }
}

