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
        //cout << raiz->dado << "\t";
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

int contar(Arvore *raiz) {
    if(raiz) {
        return 1 + contar(raiz->esq) + contar(raiz->dir);
    } 
    return 0;
    
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

int localizarNivel(int dado, Arvore *raiz){
    if(raiz){
        if(dado == raiz->dado){
            return 0;
        }
        if(dado < raiz->dado){ // vai para esquerda
            int respostaEmpilhamento = localizarNivel(dado,raiz->esq);
            if(respostaEmpilhamento == -1){ // se não foi localizado
                return -1;
            }
            return 1 + respostaEmpilhamento;

        }else{ // vai para direita
            int respostaEmpilhamento = localizarNivel(dado,raiz->dir);
            if(respostaEmpilhamento == -1){ // se não foi localizado
                return -1;
            }
            return 1 + respostaEmpilhamento;
        }
    }
    return -1; // chegou no vazio e nõa encontrou o valor
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

Arvore *podar(Arvore *raiz){
    if(raiz){
        if(!raiz->esq && !raiz->dir){
            // apagar o no da folha
            free(raiz);
            return NULL;
        }
        raiz->esq = podar(raiz->esq);
        raiz->dir = podar(raiz->dir);
        return raiz;
    }
    return NULL;

}

Arvore *limpar(Arvore *raiz){
    if(raiz){
        raiz->esq = limpar(raiz->esq);
        raiz->dir = limpar(raiz->dir);
        free(raiz);
        }
    return NULL;
}

Arvore * remover(int dado, Arvore *raiz){
    if(raiz){
        if (dado == raiz->dado){// localizei o dado e remover
            // verifica se eh folha
            if(!raiz->esq && !raiz->dir){
                free(raiz);
                return NULL;
            }
            // VERFICA SE HA UM FILHO SOMENTE
            if((raiz->esq && !raiz->dir) || (raiz->dir && !raiz->esq)){
                 Arvore *tmp; 
                if(raiz->esq){
                    tmp = raiz->esq; // Filho da esquerda é armazenado em tmp
                }else{
                    tmp = raiz->dir;
                }
                free(raiz);// limpa o numero que deseja-se apagar
                return tmp;// "religa" o filho de volta a arvore
                
            }
            // se estou nesse ponto eh porque o nodo tem dois filhos e o filho da esq sera o novo pai
            Arvore *novoPai = raiz->esq;
            Arvore *tmp = novoPai->dir;
            novoPai->dir = raiz->dir;
            free(raiz);

            Arvore*p;
            for(p = novoPai->dir;p->esq; p=p->esq);

            p->esq = tmp;
            return novoPai;

        }
        if(dado < raiz->dado){
            raiz->esq = remover(dado, raiz->esq);
        }else{
            raiz->dir = remover(dado, raiz->dir);
        }
        return raiz;
    }
    return NULL;
}