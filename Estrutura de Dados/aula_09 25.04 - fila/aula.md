## O que já foi visto até agora em Estrutura de dados
    ᐅ física
    ᐅ  abstratas
        ◘ listas, dicionarios, listas de listas, lista de dicionarios, lista de objetos
              • orientação a objetos
                  ➜ reescrita de operações/métodos
                          JAVA          C#            PYTHON
                      - toString(), ToString(),  __str__, __repr__
                      - equals(),     Equals(),      __eq__
                      - hashCode(), GetHashCode(),   __hash__
# ➣ FILAS
        ➢ filas Queue - classe abstrata ➞ esqueleto com atributos e métodos .... só que não instância objetos
            • FIFO - First In, First Out
                ➜ operações classicas 
                    - inserir na final/cauda ➞ add, offer 
                    - remover no inicio/cabeça ➞ remove, 
                ➜ operações herdadas
                    - size
                    - contains
                    - indexOf
---
         ➢ Cenário de aplicação de filas
            1) gerenciar processos ➞ id, descrição
                • classe Processo
                    - atributos ➞ id, descrição
                    - metodos ➞ toString, equals
                    
            2) processos tem prioridades ➞ processos com id entre 1 e 500 tem alta prioridade e processos entre 501 e 100 tem baixa prioridade
            3) há duas filas ➞ normal (processos entre 501 e 1000) e prioritária (processos entre 1 e 500)
            4) dinâmica:
                - um número aleatório será gerado entre 0 e 1000
                    * se o número sorteado for 0 ➞ atender/remover a cabeça da fila de prioridade - tratar quando vazia 
                    * se o número sorteado for 500 ➞ atender e remover a cabeça da fila normal - tratar quando vazia
                    * demais números seguem a dinâmica acima ➞ controle de replicados
                - a dinâmica deve repetir 10.000 vezes
                - exibir as filas ao final, com processos não atendidos (mostrando contadores)
**classe Processo**
```.java
package fila;
public class Processo {
	int id;
	String descricao;
	/***
	 * DOCUMENTAÇÃO - CONSTRUTOR DE PROCESSO
	 * @param id - INTEIRO COM NUMERO ALEATORIO ENTRE 1 E 1000
	 * @param descricao - EXPLICAÇÃO DO PROCESSO
	 */
	
	public Processo(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	/***
	 * metodo para explicar javadocs para estudantes
	 * @param id - numero qualquer
	 * @param texto - texto com 10 palavras
	 */
	
	public void umExemplo(int id, String texto) {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Processo [id=" + id + ", descricao=" + descricao + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Processo other = (Processo) obj;
		return id == other.id;
	}
	

}

```
**classe Principal**
```.java
package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Principal {
/***
 * MÉTODO ESTATICO OU DE CLASSE RESPONSÁVEL POR GERAR PROCESSOS ALEATORIOS ENTRE 1 A 1000
 * DISTRIBUINDO EM DUAS FILAS:
 * @param filaPrioritaria - FILA PRIORITÁRIA (NÚMEROS ABAIXO DE 500)
 * @param filaNormal - FILA NORMAL (NÚMEROS ACIMA DE 500)
 * @param quantidadeProcessos
 */
	public static void gerarProcessosEmFilas(Queue<Processo> filaPrioritaria,Queue<Processo> filaNormal, int quantidadeProcessos ) {
		Random gerador = new Random();
		int numeroProcessoGerado;
		
		//ROTINA PARA GERAR 10000 PROCESSOS ENTRE 1 E 1000
				for(int i=0;i<quantidadeProcessos;i++) {
					numeroProcessoGerado = gerador.nextInt(0, 1001);
					
					switch (numeroProcessoGerado) {
					case 0:
						//ROTINA PARA RETIRAR DA FILA PRIORITARIA
						System.out.println("ATENDENDO: "+filaPrioritaria.poll()); //poll = remove
						break;
						
					case 500:
						//ROTINA PARA RETIRAR DA FILA NORMAL
						System.out.println("ATENDENDO: "+filaNormal.poll()); //poll = remove

						break;

					default:
						//ROTINA PARA INSERIR PROCESSO NA FILA PRIORITÁRIA
						if(numeroProcessoGerado<500) {
							Processo processoTmp = new Processo(numeroProcessoGerado,"processo de alta prioritaria");
							if(!filaPrioritaria.contains(processoTmp)) { //PARA EVITAR A REPETIÇÃO
								filaPrioritaria.offer(processoTmp); // = filaPrioritaria.add(processoTmp);
								System.out.println(processoTmp); // VAI EXIBIR O toString DA CLASSE PROCESSO
							}
						
						}else {	//ROTINA PARA INSERIR PROCESSO NA FILA NORMAL
							Processo processoTmp = new Processo(numeroProcessoGerado,"processo normal");
							if(!filaNormal.contains(processoTmp)) { //PARA EVITAR A REPETIÇÃO
								filaNormal.offer(processoTmp); // = filaNormal.add(processoTmp);
								System.out.println(processoTmp); // VAI EXIBIR O toString DA CLASSE PROCESSO
							}
							
						}
						break;
					}
				}
		
		
		
	}
	/***
	 * METODO ESTATICO QUE EXIBE MOSTRA PROCESSOS EXISTENTES EM FILA
	 * 
	 * @param fila - CONTEM UMA FILA NORMAL OU PRIORITARIA
	 * @param frase - TEXTO A SER EXIBIDO NO CABEÇALHO DA EXIBIÇÃO OU LISTAGEM
	 */
	public static void exibirProcessosNaoAtendio(Queue<Processo> fila, String frase) {
		System.out.println(frase);
		System.out.println("TOTAL de processos não atendidos: "+ fila.size());
		
		for(Processo processo: fila) {
			System.out.println(processo);
		}
	}
	
	public static void main(String[] args) {
		/* uso do java docs
		Processo novo = new Processo(100,"teste");
		novo.umExemplo(5, "ola");*/
		
		//FILA DE PRIORIDADE
		Queue<Processo>filaPrioritaria = new LinkedList<>();
		//FILA NORMAL
		Queue<Processo>filaNormal = new LinkedList<>();
		 
		gerarProcessosEmFilas(filaPrioritaria,filaNormal,1000);
		exibirProcessosNaoAtendio(filaPrioritaria,"Fila prioritaria");
		exibirProcessosNaoAtendio(filaNormal,"Fila normla");


		
		
		
	}

}


```







