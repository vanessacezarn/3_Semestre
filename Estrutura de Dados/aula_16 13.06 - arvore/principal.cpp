#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

#include "arvore.h"

int main(){
    Arvore *arvore = NULL;
    int qtd = 10;
    int numero;

    srand(time(NULL));
    for(;qtd>0; qtd--){
        numero = rand()%100;
        cout<<"numero gerado: "<< numero<< endl;
        arvore=inserir(numero,arvore);
    }

    exibirOrdenado(arvore);
    cout<<endl;
    exibirArvore(0,arvore);


    return 1;


}