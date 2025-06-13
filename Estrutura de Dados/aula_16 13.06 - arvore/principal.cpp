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
        numero = rand()%10;
        cout<<"numero gerado: "<< numero<< endl;
        arvore=inserir(numero,arvore);
    }

    exibirOrdenado(arvore);
    cout<<endl;
    cout<< "TOTAL DE NOS: " << contar(arvore)<<endl;

    exibirArvore(0,arvore);

    cout<< "Digite numero para pesquisa/delecao: " ;
    cin >> numero;

    cout << "Localizado? " << localizar(numero,arvore) << endl;
    cout << "Localizando com nivel: " << localizarNivel(numero,arvore) << endl;

    cout << "total de folhas : " << contarFolhas(arvore)<< endl;


    cout << "Exibindo as folhas : ";
    exibirFolhas(arvore);


    //cout<< "apagando as folhas: ";
    //arvore=podar(arvore);

    cout<< "\nDigite numero para remocao: " ;
    cin >> numero;

    arvore = remover(numero,arvore);

    cout<<"Total de nos apos a remocao : "<< contarFolhas(arvore)<<endl;
    exibirArvore(0,arvore);






    return 1;


}