# revisão Estrutura de dados
    youtube - alezandre Zamberlan video de listas https://www.youtube.com/watch?v=zbqMFNnh1Kc 
    - ABSTRATAS
        • LINEARES
          - lista
          - dicionario
          - pilha
          - fila
        • OPERAÇÕES CLÁSSICAS DAS ED lineares
          - add(Add, append) | push, Push (pilha) | offer, Enqueue (fila)
          - remove (Remove, remove) | pop, Pop (pilha) | poll, Dequeeu (filha)
          - contains (Contains, in)
          - isEmpty (Empty, empty)
          - size(Count, len)
          - pilha/filha -> peek
        • Ed lineares em java, c#, e python são baseadas na teoria da teoria da orientação a objetos
            ◘ terceirização de serviços
                - há objetos e classes que atendem serviços solicitados
        • Contudo, há implementação dessas estruturas sem se basear na orientação a objetos
           ◘ são implementados procedais, geralmente em C para atender necessidades em dispositivos ou recursos computacionais com baixo reccurso (processador, memória,...)
             - possibilidade de trabalhar com estrutura de dados e suas operações via programação
                 ◘ criar a estrutura de dados usando struct em C
                     - inserir
                     - remover
                     - estaContido
                     - estaVzio
                     - tamanho
                ◘ alocação dinâmica de memoria
                  - solicitar (SO) e usar memória em tempo de excecução
                      - malloc -solicitar
                      - free - liberar

  # RECURSÃO  https://www.youtube.com/watch?v=5WAulVX_a0M
    • é uma tecnica de programação que substitui os laços/loop tradicionais - for, while, do..while
    • tecnica baseada em empilhamento do mesmo processo
      - o mesmo método fica se chamando de forma recursiva
      ◘ Estrtura básica de uma repetição:
        1) inicialização da variavel de controle da repetição
        2) teste de parada via variável de controle
        3) transformação da variávelde controle - incrementar, decrementar, modificar
      ◘ Tipos de recursão
        - recursão sem retorno --> via métodos void
        - recursão com retorno --> via métodos com retorno com um tipo de dado

```
#include <iostream>
using namespace std;

int main() {
    int numero;
    cout << "Digite um numero positivo: ";
    cin >> numero;

    for (int i = 0; i <= numero; i++) {
        cout << i << "\n";
    }
    return 1;
}
```

```
//exibir números um numero informado e o zero

#include <iostream>
using namespace std;

int main() {
    int numero;
    cout << "Digite um numero positivo: ";
    cin >> numero;

    for (int i = numero; i >= 0; i--) {
        cout << i << "\n";
    }
    return 1;
}
```

```
//exibir números entre 0 e um numero informado de forma recursiva

#include <iostream>
using namespace std;

void exibirCrescente(int i) {
    if (i >= 0) {
        //chamada recursiva com a transformação da variável de controle
        exibirCrescente(i - 1);
        //este código será executado na volta da recursão - desempilhamento
        cout << i << "\n";
    }
}

int main() {
    int numero;
    numero = 900;

    exibirCrescente(numero);


    return 1;
}
```
---

```
//exibir números entre o numero informado e o zero de forma recursiva

#include <iostream>
using namespace std;

void exibirCrescente(int i) {
    if (i >= 0) {        
        cout << i << "\n";
        exibirCrescente(i-1);
    }
}

int main() {
    int numero;
    numero = 5;
    exibirCrescente(numero);
    return 1;
}
```

---

```
#include <iostream>
#include <ctime>

using namespace std;

void popularVetor(int vetor[], int n) {
    srand(time(NULL));

    for (int i = 0; i < n; i++) {
        vetor[i] = rand() % 20;
    }
}

void exibirVetor(int vetor[], int n) {
    for (int i = 0; i < n; i++) {
        cout << vetor[i] << "\t";
    }
    cout << "\n";
}


int main() {
    int vetor[10];

    popularVetor(vetor, 10);
    exibirVetor(vetor, 10);

    return 1;
}
```

---

```
#include <iostream>
#include <ctime>

using namespace std;

void popularVetorR(int vetor[], int n) {
    if (n > 0) {
        vetor[n - 1] = rand() % 20;
        popularVetorR(vetor, n - 1);
    }
}

void exibirVetorR(int vetor[], int n) {
    if (n > 0) {
        //código executado antes do empilhamento
        exibirVetorR(vetor, n - 1);
        //código executado depois do empilhamento
        cout << vetor[n - 1] << "\t";
    }
}


int main() {
    int vetor[10];
    srand(time(NULL));
    popularVetorR(vetor, 10);
    exibirVetorR(vetor, 10);
    cout << "\n";

    return 1;
}
```

---

```
import java.util.ArrayList;
import java.util.Random;

public class Lista {

    public static void popular(ArrayList<Integer> lista, int tamanho) {
        Random gerador = new Random();
        for (int i = 0; i < tamanho; i++) {            
            lista.add( gerador.nextInt(20) );
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (Integer numero : lista) {
            System.out.print(numero + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        popular(lista, 10);
        exibir(lista);
    }
}
```

---

```
import java.util.ArrayList;
import java.util.Random;

public class ListaRecursiva {
    static Random gerador = new Random();
    static int numero;

    public static void popularR(ArrayList<Integer> lista, int tamanho) {
        if (tamanho > 0) {
            numero = gerador.nextInt(20);
            if (!lista.contains(numero)){
                lista.add( numero );
            }
            popularR(lista, tamanho - 1);
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (Integer numero : lista) {
            System.out.print(numero + "\t");
        }    
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        popularR(lista, 10);
        exibir(lista);
    }
}
```

---

```
import java.util.ArrayList;
import java.util.Random;

public class ListaRecursiva {
    static Random gerador = new Random();
    static int numero;

    public static void popularR(ArrayList<Integer> lista, int tamanho) {
        if (tamanho > 0) {
            numero = gerador.nextInt(20);
            if (!lista.contains(numero)){
                lista.add( numero );
            }
            popularR(lista, tamanho - 1);
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (Integer numero : lista) {
            System.out.print(numero + "\t");
        }    
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        popularR(lista, 10);
        exibir(lista);
    }
}
```
