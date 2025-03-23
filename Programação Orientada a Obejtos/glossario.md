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

## CONSTRUTOR 
    • INICIALIZAR O OBJETO
