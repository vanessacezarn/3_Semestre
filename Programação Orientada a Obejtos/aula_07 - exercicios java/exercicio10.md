# Exercicio 10 
	10) Crie uma classe Tarefa com os atributos: descricao (String), concluida (boolean, inicializado como false)
	Implemente:
	  Um método concluirTarefa() que marca a tarefa como concluída
	  Um método exibirTarefa() que exibe a descrição e se ela está concluída ou não
	Na Main:
	  Crie um vetor ou lista com 3 tarefas (usando entrada via teclado)
	  Marque uma das tarefas como concluída
	  Mostre todas as tarefas com seu status
**classe - Tarefa**
```.java
package pck10;
public class Tarefa {
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public void concluirTarefa() {
		this.concluida = true;
		System.out.println("Mensagem do sistema: tarefa concluida com sucesso !!");
	}
	
	public void exibirTarefa() {
		System.out.print("Tarefa: "+this.descricao);
		if(this.concluida) {
			System.out.println(" Concluida");
		}else {
			System.out.println(" Não concluida");
		}
	}
	
}

```

**main**
```.java
package pck10;
import java.util.Scanner;
public class Ex102 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//int[] vetor = new int[3]; EXPLICAÇÃO DE COMO CRIAR O VETR
		
		String descricao;
		Tarefa[] tarefas = new Tarefa[3];
		
		for(int i=0 ; i<3; i++) {
			System.out.print("Digite a descrição da tarefa "+i+" : ");
			descricao=teclado.nextLine();
			tarefas[i] = new Tarefa(descricao); 
			}
		
		tarefas[1].concluirTarefa();
		
		System.out.println("\n");
		for( int i=0 ; i<3; i++) {
			tarefas[i].exibirTarefa();
		}
		
		teclado.close();		
	}
}

```
