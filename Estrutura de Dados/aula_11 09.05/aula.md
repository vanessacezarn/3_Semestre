# Recursão
* técnica de repetição por empilhamento de processo --> o mesmo processo se chamando várias vezes
    * entender o que compõe uma repetição
        * for (inicialização da variável de controle; teste de parada com variável de controle; transformação da variável de controle)        
* passagem por Parâmetro
  * 1 - por valor - cópia
  * 2 - por referência - endereço
    * implícita - objetos e arrays
    * explicita (&) --> *

```.cpp
#include<iostream>
#include<ctime>
#include<cstdlib>

#define TAM 5

using namespace std;

/* PASSOS PARA UMA RECURSÃO
A - INICIALIZAÇÃO DA VARIAVEL DE CONTROLE
B-CONDIÇÃO DE PARADA/CONTINUIDADE
C-TRANSFORMAÇÃO DA VARIAVEL DE CONTROLE --> PONTO DE RECURSÃO
*/
void popularR(int vetor[], int n){
    if(n>0){
        //CÓDIGO ANTES DA RECURSÃO, OU SEJA, NO EMPILHAMENTO
        vetor[n-1] = rand() % 20;
        //PONTO DE RECURSÃO - TRANSFORMAÇÃO DA VARIÁVEL DE CONTROLE
        popularR(vetor,n-1);
        // CODIGO DEPOIS DA RECURSÃO, OU SEJA, NO DESEMPILHAMENTO
        
    }
}

void exibirR(int vetor[], int n){
    if(n>0){
        //CÓDIGO ANTES DA RECURSÃO, OU SEJA, NO EMPILHAMENTO
        cout << vetor[n-1] << "\n";
        //PONTO DE RECURSÃO - TRANSFORMAÇÃO DA VARIÁVEL DE CONTROLE
        exibirR(vetor,n-1);
        // CODIGO DEPOIS DA RECURSÃO, OU SEJA, NO DESEMPILHAMENTO
        
    }
}

int somarR(int vetor[],int n){
    if(n>0){
        int resultado = vetor [n-1] + somarR(vetor,n-1);
        return resultado;
    }
    return 0;
}

int contarParesR(int vetor[],int n){
    if(n>0){
        if(vetor[n-1]%2 == 0)
            return 1 + contarParesR(vetor,n-1);
        else
            return 0 + contarParesR(vetor,n-1);
        
    }
    return 0;
}
int menorR(int vetor[],int n){
    if(n>1){ // AO INVES DE SAIR DO VETOR NO FINAL DO EMPILHAMENTO, PARA NA PRIMEIRA POSIÇÃO
        int oquevemdecima = menorR(vetor,n);
        if (oquevemdecima < vetor[n-1]){
            return oquevemdecima;
        }
        return vetor[n-1];
        
        
    }
    return 0;
}

int main(){
    srand(time(NULL));
    int vetor[TAM];
    popularR(vetor,TAM);
    exibirR(vetor, TAM);
    cout << "A soma dos valores é "<< somarR(vetor,TAM)<<endl;
    cout << "quantidade de pares "<< contarParesR(vetor,TAM)<<endl;
    cout << "menores elemento "<< menorR (vetor,TAM)<<endl;
}
```
