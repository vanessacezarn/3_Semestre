typedef struct no{
    int dado;
    struct no *prox;
}Celula;


Celula *inserir (int dado, Celula *lista){
    Celula *novo = (Celula*)malloc(sizeof(Celula));   
    novo->dado = dado;
    novo->prox = lista; 
    if (!lista){
        return novo;
    }  
}

Celula *exibir(Celula *lista){
     
    for (Celula *p = lista; p!= NULL; p = p->prox){
        cout<< p->dado << "\t";
    }
    cout <<endl;
}

Celula *deletar(int dado, Celula *lista) {
    Celula *p, *pR;
    for (p = lista, pR = NULL; p; pR = p, p = p->prox) {
        if (dado == p->dado) {
            if (p == lista) {
                lista = lista->prox;
                free(p);
                return lista;
            }
            if (!p->prox) {
                pR->prox = NULL;
                free(p);
                return lista;
            }
            pR->prox = p->prox;
            free(p);
            return lista;
        }
    }
    return lista;
}
 
 
Celula *deletarPares(Celula *lista) {
    for (Celula *p = lista; p;) {
        if (p->dado % 2 == 0) {
            lista = deletar(p->dado, lista);
            p = lista;
        } else {
            p = p->prox;
        }
    }
    return lista;
}

Celula *unirLista(Celula *listaA, Celula *listaB){
    Celula *p;
 
    for (p = listaA; p->prox != NULL; p = p->prox);
 
    p->prox = listaB;
 
    return listaA;
}

Celula *ordenarLista(Celula *lista){
   
    int tmp;
    bool houveTroca;

    do {
        houveTroca = false;
        for(Celula *p = lista; p->prox != NULL; p = p->prox) {
            if (p->dado > p->prox->dado) {
                tmp = p->dado;
                p->dado = p->prox->dado;
                p->prox->dado = tmp;
                houveTroca = true;
            }
        }
    } while (houveTroca);
}