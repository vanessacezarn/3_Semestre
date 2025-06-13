# ÁRVORE
* a árvore tem niveis ➔ a raiz está no nível zero
* exibir a árvore e os seus níveis
* deleção --> podar(retirar as folhas), excluir um número ou excluir a árvore
### executar no vs code
```
  dir
  g++ .\lista.cpp -o roda
  .\roda.exe
```
**remover professor**
```.cpp
Arvore *remover(int dado, Arvore *raiz) {
    if (raiz) {
        if (dado == raiz->dado) {//localizei o dado e remover
            //verificar se eh folha
            if (!raiz->esq && !raiz->dir) {
                free(raiz);
                return NULL;
            }
            //verificar se ha um filho somente
            if ((raiz->esq && !raiz->dir) || (raiz->dir && !raiz->esq)) {
                Arvore *tmp;
                if (raiz->esq) {
                    tmp = raiz->esq;    
                }
                if (raiz->dir) {
                    tmp = raiz->dir;    
                }
                free(raiz);
                return tmp;
            }
            //se estou neste ponto eh porque o nodo tem dois filhos e o filho da esquerda serah o novo pai
            Arvore *novoPai = raiz->esq;
            Arvore *tmp = novoPai->dir;
            novoPai->dir = raiz->dir;
            free(raiz);
 
            Arvore *p;
            for (p = novoPai->dir; p->esq; p = p->esq);
           
            p->esq = tmp;
            return novoPai;
        }
        if (dado < raiz->dado) {
            raiz->esq = remover(dado, raiz->esq);
        } else {
            raiz->dir = remover(dado, raiz->dir);
        }
        return raiz;
    }
    return NULL;
}
```

```
  cout << "Digite numero para pesquisa/delecao: ";
    cin >> numero;
 
    arvore = remover(numero, arvore);
   
    cout << "Total de nos apos remocao: " << contarNodos(arvore) << endl;
    exibirArvore(0, arvore);
 
    cout << endl;
```
