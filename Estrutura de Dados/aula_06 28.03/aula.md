## Revisão 
     • Listas:
         - dicionarios = par de atributos: 1° é a chave e 2° ó valor
         - listas de : tipod primitivos; listas; dicionarios; objetos
     • Pilha 
     • Filas
     • Arvores
     • Grafos
# LISTA COM CONTROLE DE DUPLICIDADE - EQUALS E CONTAINS

## Classe aluno - java
```.java
public class Aluno{
    public int matricula;
    public String nome;
    public String email;
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = this.gerarEmail();
    }

    public String gerarEmail(){
        String vetorNomes[];
        vetorNomes = this.nome.toLowerCase().split( " ");
        return vetorNomes[0]+"."+vetorNomes[vetorNomes.length - 1]+"ufn.edu.br";
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", email=" + email + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        if (this.email.equals(aluno.email))
            return true;
        return false;
    } 
}
```
## Principal_aluno - java
```.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        Aluno tmp;
        String nome;
        int matricula =1;
        String opcao;
        
        while(true){
            System.out.print("Digite nome:");
            nome=teclado.nextLine().toUpperCase();
            tmp = new Aluno(matricula, nome);
            if(alunos.contains(tmp)){
                System.out.println("Aluno com email já cadastrado");
            }else{
                System.out.println("Aluno cadastrado com a matricula de número "+matricula);
                System.out.println("e com email "+tmp.email);
                alunos.add(tmp);
                matricula++;
            }
            System.out.println("Continua? (1-sim, 2-não)");
            opcao=teclado.nextLine();
            if (!opcao.equals("1")){
                break;
            }
        }

        alunos.sort((aluno1,aluno2) -> aluno1.nome.compareTo(aluno2.nome));

        System.out.println("Relacao aluno");
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
        //tmp = new Aluno(1, "Vanessa Cezar");
        /*if(!alunos.contains(tmp)){
            alunos.add(tmp);
            
        }
         */

        teclado.close();
    }
    
}

```
## Classe Aluno - python
``` py
class Aluno:
    #construtor
    def __init__(self, matricula,  nome):
        self.matricula = matricula
        self.nome = nome
        self.email = self.gerar_email()
    

    def gerar_email(self):
        vetor_nomes = self.nome.lower().split( " ")
        return vetor_nomes[0]+"."+vetor_nomes[-1]+"ufn.edu.br"
    
    def __str__(self):
        return "Aluno [nome=" + self.nome + ", email=" + self.email + "]"

    def __eq__(self, obj):
        ## verifica se obj é uma instancia da classe Aluno
        if not isinstance(obj, Aluno):
            return False
        # Comparando o email dos dois objetos
        return self.email == obj.email
    
```
## Principal Aluno - python
``` py
from aluno import Aluno

class Principal :
  #alunos = list(Aluno)
    alunos = []
    matricula = 1
  
    while(True):
        nome = input("digite nome: ").upper()
        tmp = Aluno(matricula,nome)
    
    
        if(tmp in alunos):
            print("Aluno com este email ja cadastrado")
        else:
            print("Aluno cadastrado com a matricula de número ",matricula)
            print("e com email ",tmp.email)
            alunos.append(tmp)
            matricula+=1
                
        opcao=input("Continua? (1-sim, 2-não)")
        if (opcao !="1"):
            break
            
    alunos.sort(key = lambda aluno : aluno.nome )

    print("Relacao aluno")
    for aluno in  alunos:
        print(aluno)
        
```
