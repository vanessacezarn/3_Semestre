typedef struct no {
    int dado;
    struct no *esq;
    struct no *dir;
} Arvore;

Arvore *inserir(int valor, Arvore *raiz) {
    if (raiz) { // Percurso pré-fixado ou RED
        // Percorrer ou pra esquerda ou para direita
        if (valor < raiz->dado) {
            raiz->esq = inserir(valor, raiz->esq);// Ir para esquerda
        } else {
            raiz->dir = inserir(valor, raiz->dir);// Ir para direita
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

// EXIBIR ARVORE EM FORMA DE ARVORE como é mode texto dvai ficar de lado
void exibirArvore(int nivel, Arvore *raiz){
    if (raiz){ // percurso -> primiero tudo para DIRETIRA --> visita RAIZ --> vai para ESQUERDA
    // vai para DIREITA
    exibirArvore(nivel+1, raiz->dir);

    // visita RAIZ
    for(int i = 0; i < nivel; i++){
        cout << "  ";
    }
    cout << "(" << nivel << ")" << raiz->dado << endl;
    
    // vai para ESQUERDA
    exibirArvore(nivel+1, raiz->esq);

    }
}