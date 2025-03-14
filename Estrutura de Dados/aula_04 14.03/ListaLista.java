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

        //EXIBINDO A LISTA INTEIRA DA PRIMEIRA POSI



    }
}
