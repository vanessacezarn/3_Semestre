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
    * Utilizado para localizar, contar, inseri
    * Não possui ordenação
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
    * Utilizado para exibir ordenado
    * Possui ordenação
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
    * Utilizado para deletar, calcular fator balanceamento
    * Percorre todos os galhos e começa a visitar somente quando não achar nenhuma nó folha, ou seja, que não tem nenhum dado depos à esquerda ou direita 
  

```
void edr(Arvore * raiz){
  if(raiz){
      edr(raiz->esq);
      edr(raiz->dir);
      cout<< raiz->dado <<endl;
```

## codigo em aula
**arvore.cpp**
```.cpp
#include <iostream>
#include <cstdlib>

using namespace std;

#include "arvore.h"

int main() {

    Arvore *arvore = NULL;
    arvore = inserir(50, arvore);
    arvore = inserir(35, arvore);
    arvore = inserir(40, arvore);
    arvore = inserir(60, arvore);

    exibirOrdenado(arvore);
    cout << "\nTotal de elementos: " << contar(arvore) << endl;
    cout << "Total de folhas: " << contarFolhas(arvore) << endl;
    exibirFolhas(arvore);

    return 1;
}

/* 
COMO SERIA ESSA ÁRVORE EM JAVA
TreeSet<Integer> arvore = new TreeSet<>();
arvore.add(50);
arvore.add(35);
arvore.add(40);
arvore.add(60);
for (TreeSet raiz : arvore) {
    System.out.println(raiz);
}
*/
```
**arvore.h**
```.h
typedef struct no {
    int dado;
    struct no *esq;
    struct no *dir;
} Arvore;

Arvore *inserir(int valor, Arvore *raiz) {
    if (raiz) { // Percurso pré-fixado ou RED
        // Percorrer ou pra esquerda ou para direita
        if (valor < raiz->dado) {
            // Ir para esquerda
            raiz->esq = inserir(valor, raiz->esq);
        } else {
            // Ir para direita
            raiz->dir = inserir(valor, raiz->dir);
        }
        return raiz;
    } else {
        Arvore *novo = (Arvore*) malloc (sizeof(Arvore));
        novo->dado = valor;
        novo->esq = NULL;
        novo->dir = NULL;
        return novo;
    }
}

void exibirOrdenado(Arvore *raiz) {
    if (raiz) { // Percurso in-fixado ou ERD
        exibirOrdenado(raiz->esq);
        cout << raiz->dado << "\t";
        exibirOrdenado(raiz->dir);
    }
}

int contar(Arvore *raiz) {
    if(raiz) {
        return 1 + contar(raiz->esq) + contar(raiz->dir);
    } else {
        return 0;
    }
}

int somar(Arvore *raiz) {
    if(raiz) {
        return raiz->dado + contar(raiz->esq) + contar(raiz->dir);
    } else {
        return 0;
    }
}

int contarPares(Arvore *raiz) {
    if (raiz) {
        if (raiz->dado % 2 == 0) {
            return 1 + contarPares(raiz->esq) + contarPares(raiz->dir);
        }
        return 0 + contarPares(raiz->esq) + contarPares(raiz->dir);
    }
    return 0;
}

int contarFolhas(Arvore* raiz) {
    if (raiz) {
        if (!raiz->esq && !raiz->dir) {
            return 1;  // É uma folha
        }   
    return contarFolhas(raiz->esq) + contarFolhas(raiz->dir);
    }
    return 0;
}

void exibirFolhas(Arvore *raiz) {
    if (raiz) { // Se raiz existe
        if (!raiz->esq && !raiz->dir) {
            cout << raiz->dado << "\t";
        } else {
            exibirFolhas(raiz->esq);
            exibirFolhas(raiz->dir);
        }
    }
}

bool localizar(int valor, Arvore *raiz) {
    if(raiz) {
        if(valor == raiz->dado) {
            return true;
        }
        if (valor < raiz->dado) { // Percorrer para a esquerda
            return localizar(valor, raiz->esq);
        } else { // Percorrer para a direita
            return localizar(valor, raiz->dir);
        }
    }
    return false;
}
```
      
