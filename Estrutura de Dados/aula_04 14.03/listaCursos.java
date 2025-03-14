import java.util.ArrayList;
import java.util.List;
public class listacurso {
    public static void main(String[] args) {
        ArrayList<String> estruturaDados = new ArrayList<String>();
        estruturaDados.add("Caretta");
        estruturaDados.add("Cleber");
        estruturaDados.add("Andrisa");
        estruturaDados.add("Luiza");
        estruturaDados.sort(null);

        //System.out.println(estruturaDados);

        ArrayList<String> bancodeDados = new ArrayList<>();
        bancodeDados.add("Caretta");
        bancodeDados.add("Andrisa");
        bancodeDados.add("Luiza");

        bancodeDados.sort(null);

        //System.out.println(bancodeDados);

        ArrayList<String> ia = new ArrayList<>();
        ia.add("Caretta");
        ia.add("Miguel");
        ia.sort(null);

        //System.out.println(ia);

        ArrayList<ArrayList> cienciaComputacao = new ArrayList<ArrayList>();
        cienciaComputacao.add(estruturaDados);
        cienciaComputacao.add(bancodeDados);
        cienciaComputacao.add(ia);

        for(Object disciplina : cienciaComputacao){
            System.out.println(disciplina);
        }

        System.out.println("EXIBINDO ALUNOS DAS DISCIPLINAS\n");
        ArrayList<String> nomesAvaliados = new ArrayList<>();
        String nomeTMP;
        int contador;

        for(ArrayList disciplina : cienciaComputacao){
            for (Object aluno : disciplina){
                nomeTMP=aluno.toString();
                if(!nomesAvaliados.contains(nomeTMP)){
                    nomesAvaliados.add(nomeTMP);
                    contador =0;
                    for(ArrayList d : cienciaComputacao){
                        for (Object a : d){
                            if(nomeTMP.equals(a.toString())){
                                contador++;
                            }
                            
                        }
                    }
                    System.out.println(nomeTMP +" aparece em " + contador + " disciplina\n");


                }
            }
        }
        


    }


}
