#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

#include "lista.h"

int main(){
    srand(time(NULL));

    //1- Faça um método que receba as duas listas e exiba os números que estão presentes em ambas.
    Celula *listaA = NULL;
    for (int i=0;i<25;i++){
        listaA = inserir(rand()%100,listaA);
    }
    Celula *listaB = NULL;
    for (int i=0;i<20;i++){
        listaB = inserir(rand()%100,listaB);
    }

    cout<<"Exibindo dados da lista A" <<endl;
    exibir(listaA);
    cout<<"Exibindo dados da lista B "<<endl;
    exibir(listaB);

    // 2 - Faça um método que exclua todos os números pares da lista1 ou listaA
    cout<<"\nDELETANDO numeros pares da lista A" <<endl;
    listaA = deletarPares(listaA);
    cout<<"\nExibindo a lista A sem os pares" <<endl;
    exibir(listaA);

    // 3 - Faça um método que una a lista1 ou listaA na lista2 ou listaB. Ou seja, todos os elementos da primeira lista devem vir primeiro dos elementos da segunda lista
    Celula *listaAB = NULL;
    cout<<"\nUNINDO dados da lista A e B  "<<endl;
    listaAB = unirLista(listaA,listaB);
    exibir(listaAB);

    // 4 - Faça um método que receba o resultado da união da lista1 com a lista2 e aplique um método de ordenação
    ordenarLista(listaAB);
    cout<<"\nExibindo dados da lista AB ORDENADOS "<<endl;
    exibir(listaAB);

    // 5 - Faça um método que delete todos os elementos da lista criada da união entre lista1 e lista2.
    cout<<"\n EXCUINDO  dados da lista AB ORDENADOS "<<endl;
    while (listaAB != NULL) {
        int valor = listaAB->dado;
        listaAB = deletar(valor, listaAB);
    }
    exibir(listaAB);

    return 1;
}