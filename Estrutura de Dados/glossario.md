# ESTRUTURA DE DADOS
## Estruturas físicas
    ➤ formas como os dados são armazenados na memória do computador
    ➤ tipos de variaveis: int, double, float, char, boolean
    ➤ determinam como os dados serão organizados e acessados ➞ influencia o desempenho dos algoritmos
    ➤ dependem da implementação ➞ a forma como os dados são representados fisicamente pode mudar conforme a linguagem e modelo de memoria do computador
    ➤ exemplos:
        ◘ Array (vetores e matrizes) 
            ➞ é uma estrutura de dados física e linear que armazena um conjunto de elementos do mesmo tipo, organizados em posições consecutivas da memória. Cada elemento do array pode ser acessado por um índice numérico.
            ➞ tamanho fixo
            ➞ Boa eficiência para leitura, mas custo alto para inserções/remoções no meio
        ◘ Listas encadeadas
            ➞ cada elemento contem um valor e um ponteiro para o proximo elemento
            ➞ tamanho dinamico 
            ➞ inserção/remoção rapidos, mas acesso sequencial mais lento que array para busca
        ◘ filas
            ➞ Firt In, Fisrt Out (LIFO) --> onde o primeiro elemento a entrar é o primeiro a sair
            ➞ somente operações de inserção (cauda ou fim) e remoção(cabeça ou inicio)
        ◘ pilhas
            ➞ Last In, First Out (LIFO) --> onde o último elemento a entrar é o primeiro a sair
            ➞ somente operações de inserção e remoção no topo
        ◘ HashMap
            ➞ Estrutura que armazena pares chave-valor usando uma função hash para acesso rápido
           ➞ Chaves únicas.
           ➞ Usado para dicionários, caches, etc.
