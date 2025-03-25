# TRATAMENTO DE EXCEÇÕES
    🡺 excessão é um evento que ocorre durante a a excecução do programa, que interro,pe p fluxo normal de execução
    🡺
    🡺

## Exemplos de erro 

*** exemplo de erro 1 - tentando acessar um elemento fora do indice de um array ***
```.java
package exemplo1;

public class Ex1 {

	public static void main(String[] args) {
// EXEMPLO 1 - TENTANDO ACESSAR UM ELEMENTO FORA DO INDICE DE UM ARRAY
		int []  numeros = {1,2,3};
		
		System.out.println(numeros[3]); //ERRO ESPERADO : ArrayIndexOutOfBoundsException 
		
	}

}

```

*** exemplo de erro 2 - divisão por zero***

```.java
package exemplo2;

public class Ex2 {
	public static void main(String[] args) {
		// divisão por zero
		
		int a = 10, b=0;
		
		System.out.println(a/b); //ERRO ESPERADO : ArithmeticException
		
	}
}

```
*** exemplo de erro 3 - tentando converter uma string em um número***
```.java
package exemplo2;

public class Ex3 {

	public static void main(String[] args) {
		// TENTANDO CONVERTER UMA STRING EM UM NUMERO
		String numero = "abc";
		int valor = Integer.parseInt(numero); // ERRO ESPERADO : NumberFormatException

	}

}

```

```
