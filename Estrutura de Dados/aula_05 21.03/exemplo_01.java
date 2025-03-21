import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno{
    int matricula;
    String nome;

    public Aluno (int matricula, String nome){
        this.matricula = matricula;
        this.nome= nome;   
    }

    @Override
    public String toString() {
        return "Aluno [matricula = " + matricula + ", nome = " + nome + "]";
    }

    
}
    
public class ListaObjeto{
        public static void main(String[] args) {
            List<Aluno> alunos = new ArrayList<>();
            int matricula;
            String nome;
            //Aluno tmp;
            Scanner teclado = new Scanner(System.in);
            for (int i=0; i<3;i++){
                System.out.print("Matricula "+i+": ");
                matricula=teclado.nextInt();
                teclado.nextLine();

                System.out.print("Nome: ");
                nome = teclado.nextLine();

                alunos.add(new Aluno(matricula, nome));
               
                /*Aluno alunoTmp = new Aluno(1,"Vanessa");
                tmp = new Aluno(matricula, nome);
                if(alunos.contains(tmp)){
                    System.out.println("aluno já cadastrado");
                }else{
                    alunos.add(tmp);
                }*/
               
            }
            System.out.println(alunos); // utiliza a classe
            for(Aluno aluno: alunos){
                System.out.println(aluno);
            }
            teclado.close();
        }
}


