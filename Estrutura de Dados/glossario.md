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
## Estrutura abstrata
    ➤ modelos logicos que definem como os dados devem ser organizados e manipulados  ➞ não considera como eles são armazenados fisicamente
    ➤ definem operações, como inserção, busca e remoção, e regras de manipulação
    ➤ determinam o comportamento da estrutura ➞ mas não especificam exatamente como os dados serão armazenados.
    ➤ exemplos: 
        ◘ list
            ➞ Coleção ordenada de elementos.
            ➞ Permite inserções, remoções e buscas por posição.
            ➞ Pode ser implementada com arrays ou listas encadeadas
        ◘ dicionario - map
           ➞ Cada elemento possui uma chave única associada a um valor.
           ➞ Acesso rápido  quando bem implementado.
        ◘ Conjunto (Set) – Coleção de Elementos Únicos
           ➞ Não permite elementos repetidos. --> Útil para evitar duplicatas.
           ➞ Implementado com tabelas hash (HashSet).
            import java.util.HashSet;

```.java
HashSet<String> conjunto = new HashSet<>();
conjunto.add("A");
conjunto.add("B");
conjunto.add("A"); // Ignorado, pois já existe
System.out.println(conjunto.size()); // Saída: 2
```
           
![image](https://github.com/user-attachments/assets/110850d9-a0f4-4c6a-89bd-01dce84e8ea5)
