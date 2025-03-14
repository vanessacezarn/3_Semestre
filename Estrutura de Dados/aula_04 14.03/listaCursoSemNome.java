import java.util.ArrayList;

public class listaCursosemNome {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> cienciadaComputacao = new ArrayList<>();
        //0- estrutura de dados
        cienciadaComputacao.add(new ArrayList<String>());
        //1- banco de dados
        cienciadaComputacao.add(new ArrayList<String>());
        //2-ia
        cienciadaComputacao.add(new ArrayList<String>());

        //estrutura de dados - 0
        cienciadaComputacao.get(0).add("Andrisa");
        cienciadaComputacao.get(0).add("Luiza");
        cienciadaComputacao.get(0).add("Ceretta");
        cienciadaComputacao.get(0).sort(null);

        //banco de dados - 1
        cienciadaComputacao.get(1).add("Andrisa");
        cienciadaComputacao.get(1).add("Ceretta");
        cienciadaComputacao.get(1).sort(null);

        //estrutura de dados - 2
        cienciadaComputacao.get(2).add("miguel");
        cienciadaComputacao.get(2).add("Ceretta");
        cienciadaComputacao.get(2).sort(null);

        System.out.println("EXIBINDO ALUNOS DAS DISCIPLINAS\n");
        ArrayList<String> nomesAvaliados = new ArrayList<>();
        String nomeTMP;
        int contador;

        for(ArrayList<String> disciplina : cienciadaComputacao){
            for (Object aluno : disciplina){
                nomeTMP=aluno.toString();
                if(!nomesAvaliados.contains(nomeTMP)){
                    nomesAvaliados.add(nomeTMP);
                    contador =0;
                    for(ArrayList<String> d : cienciadaComputacao){
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
