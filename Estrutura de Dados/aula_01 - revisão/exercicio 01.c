/*1)Programe em C/C++:
  -popule um vetor com n números inteiros e aleatórios (0 a 500)
  -exiba o vetor com n números armazenados  
  -insira no vetorPar os números pares e no vetorImpar os números ímpares.
  -exiba o vetorPar e Ímpar*/

  #include<stdio.h>

  int main(){
        srand(time(NULL));
        int v[10],par[10],impar[10];
        int i,p=0,im=0;

        for(i=0;i<10;i++){
            v[i] = rand() % 150;
            printf("\t%d",v[i]);
        }

        for(i=0;i<10;i++){
            if(v[i]%2 ==0){
                par[p]= v[i];
                p++;

            }else{
                impar[im]=v[i];
                im++;
            }
        }
        printf("\n");
       
        printf("Vetor com os elementos pares:");
        for(i=0;i<p;i++){
            printf("\t%d",par[i]);
        }

        printf("\n");
        
        printf("Vetor com os elementos impares:");
        for(i=0;i<im;i++){
            printf("\t%d",impar[i]);
        }

    return 0;
  }
