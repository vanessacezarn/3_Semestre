#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

#include "arvore2.h"

int main(){
    Arvore *arvore = NULL;
    int qtd = 10;
    int numero;

    srand(time(NULL));
    for(;qtd>0; qtd--){
        numero = rand()%100;
        cout<<"numero gerado: "<< numero<< endl;
        arvore=add(numero,arvore);
    }

    //exibirOrdenado(arvore);
    cout<<endl;
    mostrarArvore(arvore,0);


    return 1;
    

}