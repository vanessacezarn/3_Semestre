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
```







