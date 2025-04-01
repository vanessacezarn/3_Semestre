//4 – Pesquise quais são as Exceções existentes que já possuem tratamento e explique brevemente como
//cada uma funciona. Teste duas exceções

// EXEMPLOS DE EXCEÇÕES
//	IllegalArgumentException = ocorre quando um método recebe um argumento inválido.
//	NegativeArraySizeException = ocorre quando tenta-se criar um array com tamanho negativo.
//	NullPointerException = aparece quando tenta-se acessar um método ou tributo de um objeto nulo.
//	IOException = ocorre quando há falhas em operações de entrada/saída.
	
//TESTE 1 DE EXCEÇÕES  - NegativeArraySizeException = ocorre quando tenta-se criar um array com tamanho negativo.

package exercicio04;

public class Ex4 {

	public static void main(String[] args) {
		try {
		int [] array = new int [-5];
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}

//TESTE 2 DE EXCEÇÕES - NullPointerException = aparece quando tenta-se acessar um método ou tributo de um objeto nulo.

package exercicio04;

public class Ex4_teste2 {

	public static void main(String[] args) {
		String texto = null;
		
		try {
		System.out.println(texto.length());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}


