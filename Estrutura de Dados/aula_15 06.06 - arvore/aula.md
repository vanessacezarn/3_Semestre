# ÁRVORES
* tem que estar balanceado ---> vai rodando a árvore conforme vai adicionando dados, para que tenha-se uma certo equilibrio entre os lados
* menor vai sendo preenchido a esquerda e o maior a direita do seus respectivos numeros proximos
* para procurar um determinado numero não precisa compara-lo com todos, compara com o primeiro da arvore e escolhe para que lado vai
   * o lado não escolhido automatimante não vai ser usado na comparação
* mais recomendado para guardar e buscar dados em sistema
* ao entrar na árvore tem que empilhar os dados e para sair dela tem que desempilhar os dados
  * para cada nó sem filho "nó folha" o empilhamento tem que passar por ele, é contabilizado como se ele tivesse dois filhos, pois ele é uma árvore binária
# exemplo visual de árvore
 ```mermaid
graph TD;
    10-->17;
    17-->15;
    17-->20;
    10-->2;
    2-->1;
    2-->5;
    5-->3;
    5-->7;
```
