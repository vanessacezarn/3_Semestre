# usando recursão no codigo
**lista.h**
```.cpp
typedef struct no{
    int dado;
    struct  no *prox;
}Lista;

Lista *inserir (int dado,Lista *lista){
    if (lista && dado >= lista->dado){
        if(dado != lista->dado){ // CONTROLE DE DUPLICADOS
            lista->prox = inserir(dado, lista->prox);
        }
        return lista;
    }else{ // CHEHOU AO FINAL DA LISTA
        Lista *novo = (Lista*)malloc(sizeof(Lista));
        novo->dado = dado;
        if(lista){
          novo->prox = lista;
        }else{
          novo->prox = NULL;
        }
        return novo;
    }
}

void exibir(Lista *lista){
    if (lista){
        cout<< lista -> dado << endl;
        exibir(lista->prox);
    }
}

int contar(Lista *lista){
    if (lista){
        return 1 + contar(lista->prox);
    }
    return 0;
}

Lista *localizar(int numero, Lista *lista){
    if (lista){
        if(numero == lista->dado){
            return lista;
        }
        return localizar(numero, lista->prox);

    }
    return NULL;
}


```
**principal.cpp**
```.cpp
#include <iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

#include "lista.h"

int main (){
    srand(time(NULL));
    Lista *lista  = NULL;
    for (int i =0; i<50;i++){
        lista = inserir(rand()%100, lista);
    }
    cout<< "TOTAL de elementos: " << contar(lista) << endl;
    exibir(lista);

int numero;
cout << "numero para pesquisa: ";
cin >> numero;

Lista *resposta = localizar(numero,lista);
if(resposta){
    cout << resposta ->dado <<" : "<< "localizado\n" << endl;
}else{
    cout << "numero nao esta na lista" << endl;
}

  

    return 1;
}
```
