# revisão
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
```
**principal.cpp**
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


```
