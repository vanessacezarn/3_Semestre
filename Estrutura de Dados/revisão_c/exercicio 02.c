//2)Programa em C/C++ que gere n números aleatórios e os armazene um abaixo do outro em um arquivo dados.txt

#include<Stdio.h>
#include<stdlib.h>
#include <time.h>

void geravetor(int *v,int a){
    srand(time(NULL));
    int i;
    for(i=0;i<a;i++){
        *(v+i)= rand() % 150;
        printf("%d\t",*(v+i));
    }
    return;
}

int main(){
    srand(time(NULL));
    int a,i;
    int *v;
    FILE *fp;
    char nome[40];

    a=rand()%10;//GERA O TAMANHO DO VETOR

    v=(int *)malloc(a*sizeof(int));//ALOCAÇÃO DINÂMICA
    if(!v){ 
        printf("ERRO de alocação de memoria do vetor 1");
        exit(-1);
    }
   
    geravetor(v,a);

    printf("\ndigite o nome do arquivo a ser criado para armazenar um vetor:");
    gets(nome);

     if((fp = fopen(nome, "w"))==NULL){
    printf("Arquivo não pode ser aberto...PRESSIONE QUALQUER TECLA PARA CONTINUAR");
    getchar();
    exit(1);
 }

     for(i=0; i<a; i++){
        fprintf(fp, "%d\t", v[i]);


     }
    fclose(fp);
    free(v);
    return 0;
}
