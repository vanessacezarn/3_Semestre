# TRATAMENTO DE EXCEÇÕES
    🡺 excessão é um evento que ocorre durante a a excecução do programa, que interro,pe p fluxo normal de execução
    🡺
    🡺

## Exemplos de erro 

**exemplo de erro 1 - tentando acessar um elemento fora do indice de um array**
```.java
package exemplo1;
public class Ex1 {
	public static void main(String[] args) {
		int []  numeros = {1,2,3} ;
		System.out.println(numeros[3]); //ERRO ESPERADO : ArrayIndexOutOfBoundsException 
	}
}
```

**exemplo de erro 2 - divisão por zero**

```.java
package exemplo2;
public class Ex2 {
	public static void main(String[] args) {	
		int a = 10, b=0;
		System.out.println(a/b); //ERRO ESPERADO : ArithmeticException
	}
}
```

**exemplo de erro 3 - tentando converter uma string em um número**
```.java
package exemplo2;
public class Ex3 {
	public static void main(String[] args) {
		String numero = "abc";
		int valor = Integer.parseInt(numero); // ERRO ESPERADO : NumberFormatException
	}
}

```
## TRATANDO EXCEÇÕES
	🡺
 	🡺
**Tratando erro 1**
```.java
package exemplo1;

public class Ex1 {

	public static void main(String[] args) {
		int []  numeros = {1,2,3};
		try { //TRATADA O ERRO COMO UMA EXCEÇÃO
		System.out.println(numeros[3]);
		} catch(Exception e) {
			System.out.println("Exceção:" + e.getMessage()); //FORMAS DE MOSTRAR QUAL A EXEÇÃO - APENAS MOSTRAR O QUE ESTA ERRADO
			System.out.println("Exceção:" + e.toString()); // MOSTRA O QUE ESTA ERRADO E QUAL É O ERRO
		}
		
		System.out.println("o programa segue em excecução");
		System.out.println(numeros[3]); //FORA DO TRY, AQUI VAI GERAR UM ERRO FATAL 
		System.out.println("agora não"); // AQUI JÁ NÃO É MAIS EXECUTADO O PROGRAMA


	}

}

```
```.java
package exemplo1;

public class Ex1 {

	public static void main(String[] args) {
		int []  numeros = {1,2,3};
		try { //TRATADA O ERRO COMO UMA EXCEÇÃO
		System.out.println(numeros[2]);
		System.err.println("resultado"+(3/0));
		} catch(ArrayIndexOutOfBoundsException e) { // SE USAR DESSA MANEIRA ELE TRATA APENAS O ERRO ESPECIFICO - se ocorrer algum outro erro ele não é tratado 
			System.out.println("Exceção:" + e.getMessage()); //FORMAS DE MOSTRAR QUAL A EXEÇÃO
			System.out.println("Exceção:" + e.toString());
		}catch(Exception e ) { // TRATA O ERRO DE FORMA MAIS GENERICA
			System.out.println("Exceção:" + e.toString());

		}
		
		System.out.println("o programa segue em excecução");
		System.out.println(numeros[3]); //FORA DO TRY, AQUI VAI GERAR UM ERRO FATAL 
		System.out.println("agora não"); // AQUI JÁ NÃO É MAIS EXECUTADO O PROGRAMA


	}

}

```

**tratando erro 2**
```.java
package exemplo2;
public class Ex2 {
	public static void main(String[] args) {
		int a = 10, b=0;
		try {
		System.out.println(a/b); //ERRO ESPERADO : ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println("Exceção: "+e.toString());
		}
		System.out.println("CONTINUA");
	}
}

```
**tratando erro 3**
```.java
package exemplo2;
public class Ex3 {
	public static void main(String[] args) {
		String numero = "abc";
		try {
		int valor = Integer.parseInt(numero); // ERRO ESPERADO : NumberFormatException
		}catch(NumberFormatException e){
			System.out.println("exceção: "+e.toString() );
		}
		System.out.println("CONTINUA");
	}
}

```

