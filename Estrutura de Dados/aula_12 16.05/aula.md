## alocação dinâmica X alocação estática
* alocação dinâmica
    * java e c# --> new | dispose ou garbage collector 
    * c e cc++ --> malloc-free
**quadro**
```.c
typedef struct no{
   int dado;
   struct *prox;
} Celula;
for(Celula *i = lista; i != NULL; i = i ->prox){
   ## exibirdados
   ## pesquisar dados
   ## contar dados
} 
```
**exemplo 1**
```.c

#include<iostream>
using namespace std;

# include "lista.h"

int main(){
    Celula *lista = NULL;
//lista é do tipo de ponteiro de celula
    lista = inserir(7,lista);
    lista = inserir(10,lista);
    lista = inserir(5,lista);
    lista = inserir(66,lista);
    lista = inserir(48,lista);
    lista = inserir(99,lista);


    cout <<"lista contem "<< contarLista(lista)<< " elementos\n";
    exibir(lista);

    int numero;
    cout<<"digite numero para pesquisa: ";
    cin >> numero;

    cout<<numero<<" esta na lista?"<<estaNaLista(numero,lista)<<endl;

    return 1;

}
```

```.c
#include <cstdlib>
typedef struct no{
    int dado;
    struct no *prox;

}Celula;
// dado e lista são variaveis diferentes com diferentes enderço de memoria apenas com o mesmo nome

// SERIA O ADD DE JAVA
Celula *inserir(int dado, Celula *lista){
    // ALOCAR MEMÓRIA
    Celula *novo = (Celula *)malloc(sizeof(Celula));

    // DEPOSITAR VALORES QUE VEM DO PARÂMETRO
    novo->dado = dado; // dado que esta no inserir
    novo->prox = NULL; // todo dado adicionado sempre aponta para o último, null

    // TESTAR SE É O PRIMEIRO ELEMENTO A SER INSERIDO
    if(!lista){ // = if(lista == NULL)
        return novo;
    }

    // PERCORRER A ESTRUTURA ATÉ O FINAL, ou seja leva o ponteiro até a última posição (p->prox!=NULL)
    Celula *p;
    for (p = lista; p->prox != NULL; p = p->prox); 

    // ENCADEAR E RETORNAR
    p->prox = novo;

    return lista; // ESTÁ RETORNANO A POSIÇÃO DE MEMÓRIA
}

void exibir(Celula *lista){
    Celula *p ;
    // ESSE FOR PERCORRE TODA A LISTA E NÃO PARA NO ÚLTIMO

    for (Celula *p = lista; p!= NULL; p = p->prox){
        cout<< p->dado << "\t";
    }
    cout <<endl;
    
}
int contarLista(Celula *lista){
    int total = 0;
    for (Celula *p = lista; p!= NULL; p = p->prox){
        total++;
    }
    return total;
    
}

bool estaNaLista(int numero,Celula *lista){
    for (Celula *p = lista; p!= NULL; p = p->prox){
        if(numero == p->dado){
            return true; // = 1
        }
    }
    return false; // 0 ou não localizado
}
        



```


* alocação estática
  * tempo programação 


