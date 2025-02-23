//3)Programa em C/C++ que leia o arquivo dados.txt com números inteiros, um abaixo do outro, e os armazenem em um vetor.
//Contudo, os números repetidos sejam ignorados.

//3)Programa em C/C++ que leia o arquivo dados.txt com números inteiros, um abaixo do outro, e os armazenem em um vetor.
//Contudo, os números repetidos sejam ignorados.

#include<stdio.h>
int main(){
    FILE *fp;

    int n=0,num;

    fp = fopen("dados.txt","r");
    if(!fp){
        printf("Erro na leitura\n");
        exit(0);
    }else{
        printf("Arquivo aberto com SUCESSO");
    }

    while(fscanf(fp,"%i",&num) != EOF){
        n++;
    }

    printf("o arquivo possui %d elementos",n);


    fclose(fp);


    return 0;
}
