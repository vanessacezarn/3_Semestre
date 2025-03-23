#  REVISÃO

## CLASSE  
    • MODELO PARA CRIAR OBJETOS 
    • define as caracteríticas (atributos) e comportamentos (meétodos) que um objeto pode ter
    • A classe Carro define que todo carro tem uma marca e um ano, além de um comportamento chamado buzinar().
    
``` .java
    class Carro {
         String marca;   // Atributo
         int ano;        // Atributo

        void buzinar() {  // Método
          System.out.println("Biiiiiiiii!");
        }
    }

```
## OBJETO 
    • INSTâNCIA DA CLASSE
    • representa um elemento real do mundo dentro do programa
    • meuCarro é um objeto da classe Carro. Ele tem uma marca ("Toyota"), um ano (2022) e pode buzinar.

``` .java
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();  // Criando um objeto da classe Carro
        meuCarro.marca = "Toyota";  // Definindo valores para os atributos
        meuCarro.ano = 2022;

        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Ano: " + meuCarro.ano);

        meuCarro.buzinar(); // Chamando o método
    }
}


```

## MÉTODO 
    • COMPORTAMENTO DO OBJETO
    • é um conjunto de instruções dentro de uma classe que define um comportamento do objeto
    • o método buzinar() não retorna nada, apenas imprime algo na tela.
    • o método obterDescricao() retorna uma String com a descrição do carro.

```.java
class Carro {
    String marca;
    int ano;

    void buzinar() {  // Método sem retorno
        System.out.println("Biiiiiiiii!");
    }

    String obterDescricao() {  // Método com retorno
        return "Marca: " + marca + ", Ano: " + ano;
    }
}


```

## CONSTRUTOR 
    • INICIALIZAR O OBJETO
    • O construtor é um método especial usado para criar (ou inicializar) objetos. Ele é chamado automaticamente quando um objeto é instanciado.
    • this.marca = marca; significa que estamos atribuindo o valor recebido no parâmetro ao atributo da classe
    ```.java
    class Carro {
    String marca;
    int ano;

    // Construtor
    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + ", Ano: " + ano);
    }
    }

    public class Main {
        public static void main(String[] args) {
            Carro meuCarro = new Carro("Ford", 2023); // Chamando o construtor
            meuCarro.exibirInfo();
        }
    }
```




