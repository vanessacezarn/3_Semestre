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
# FILAS
        ➢ filas Queue - classe abstrata ➞ esqueleto com atributos e métodos .... só que não instância objetos
            • FIFO - First In, First Out
                ➜ operações classicas 
                    - inserir na final/cauda ➞ add, push 
                    - remover no inicio/cabeça ➞ remove, pop
                ➜ operações herdadas
                    - size
                    - contains
                    - indexOf
---
         ➢ Cenário de aplicação de filas
            1) gerenciar processos ➞ id, descrição
            2) processos tem prioridades ➞ processos com id entre 1 e 500 tem alta prioridade e processos entre 501 e 100 tem baixa prioridade
            3) há duas filas ➞ normal (processos entre 501 e 1000) e prioritária (processos entre 1 e 500)
            4) dinâmica:
                - um número aleatório será gerado entre 0 e 1000
                    * se o número sorteado for 0 --> atender/remover a cabeça da fila de prioridade - tratar quando vazia
                    * se for entre 501 e 100 ➞ atender/remover a cabeça da fila de normal
                    * se for entre 1 e 500 ➞ atender/remover a cabeça da fila de prioritária
