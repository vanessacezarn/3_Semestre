# ÁRVORES Binárias
* tem que estar balanceado ---> vai rodando a árvore conforme vai adicionando dados, para que tenha-se uma certo equilibrio entre os lados
* menor vai sendo preenchido a esquerda e o maior a direita do seus respectivos numeros proximos
* para procurar um determinado numero não precisa compara-lo com todos, compara com o primeiro da arvore e escolhe para que lado vai
   * o lado não escolhido automatimante não vai ser usado na comparação
* mais recomendado para guardar e buscar dados em sistema
* ao entrar na árvore tem que empilhar os dados e para sair dela tem que desempilhar os dados
  * para cada nó sem filhos **"nó folha"**, sem filho para direita ou esqueda, o empilhamento tem que passar por ele, é contabilizado como se ele tivesse dois filhos, pois ele é uma árvore binária
  * percurso, ou seja, percorrer uma árvore - visitar é o "print"
      * pré-fixado ou RED - visita a raiz e vai para esquerda e vai para direita --> 50,35,40,60
            * tem raiz? sim, print = 50, vai para esquerda tem a raiz? sim, print = 35, vai para esquerda, tem raiz? não volta para a ultima raiz, vai para direita tem raiz? sim, print = 40, vai para esquerda tem raiz? não, volta para  raiz anterior, vai para direita tem raiz? não, volta até a primeira raiz. e então vai para direita, tem raiz? sim, print = 60;
      * in-fixado ou ER - vai esquerda, visita raiz e vai direita
      * pós-fixado ou EDR - vai esquerda, vai direita e visita raiz, empilha tudo e desempilha tudo antes de ir para a raiz
### exemplo visual de árvore
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
## percurso, ou seja, percorrer uma árvore - visitar é o "print"
 ```mermaid
graph TD;
    50-->35;
    35-->40;
    50-->60;
    
```
* **pré-fixado ou RED** - visita a raiz e vai para esquerda e vai para direita --> 50,35,40,60
    * tem raiz? sim, print = 50, 
    * vai para esquerda tem a raiz? sim, print = 35, 
    * vai para esquerda, tem raiz? não volta para a ultima raiz, 
    * vai para direita tem raiz? sim, print = 40, 
    * vai para esquerda tem raiz? não, volta para  raiz anterior, 
    * vai para direita tem raiz? não, volta até a primeira raiz. 
    * e então vai para direita, tem raiz? sim, print = 60;
    * vai para esquerda, tem raiz? não volta para a ultima raiz, 
    * vai para direita tem raiz? não, volta até a primeira raiz.
```
void red(Arvore * raiz){
  if(raiz){
      cout<< raiz->dado <<endl;
      red(raiz->esq);
      red(raiz->dir);
```
    
* **in-fixado ou ERD** - vai esquerda, visita raiz e vai direita --> 35,40,50,60
    * vai para esquerda, tem raiz? sim, print=35
    * vai para direita, tem raiz? não, volta para a raiz
    * vai da
    *  
```
void erd(Arvore * raiz){
  if(raiz){
      erd(raiz->esq);
      cout<< raiz->dado <<endl;
      erd(raiz->dir);
```

* **pós-fixado ou EDR** - vai esquerda, vai direita e visita raiz, empilha tudo e desempilha tudo antes de ir para a raiz-->40,35,60,50

```
void edr(Arvore * raiz){
  if(raiz){
      edr(raiz->esq);
      edr(raiz->dir);
      cout<< raiz->dado <<endl;
```






      
