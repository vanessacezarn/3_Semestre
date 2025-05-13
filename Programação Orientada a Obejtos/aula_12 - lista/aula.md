## aula
public static --> metodo qu efunciona como uma função,não deoende da classe
              --> não é uma boa pratica para POO
              --> "corrigir uma gambiarra com outra gambiarra"

### retorno de objetos

## EXEMPLOS SLIDES

**Exemplo 1 - pessoa**
```.java
package pkg;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}

```
```.java
package pkg;
public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("Vanessa",22);
		meuMetodo(pessoa);
	}
	
	public static void meuMetodo(Pessoa p) {
		System.out.println("nome: "+p.getNome());
		System.out.println("idade: "+p.getIdade());
	}
}

```

**Exemplo 2 - produto -retornando uma copia do objeto**
```.java
package pkg2;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// RETORNA UMA COPIA DO PRODUTO
	public Produto clone() {
		return new Produto(this.nome,this.preco);
	}
}

```

```.java
package pkg2;

public class Principal {

	public static void main(String[] args) {

		Produto produto1 = new Produto("caneta",1.5);
		Produto produto2 = produto1.clone();
		
		System.out.println("produto 1 - nome: "+produto1.getNome()+", Preço: "+produto1.getPreco());
		System.out.println("produto 2 - nome: "+produto2.getNome()+", Preço: "+produto2.getPreco());
		
		produto2.setPreco(2.0);
		
		System.out.println("\nproduto 1 - nome: "+produto1.getNome()+", Preço: "+produto1.getPreco());
		System.out.println("produto 2 - nome: "+produto2.getNome()+", Preço: "+produto2.getPreco());
	}

}

```

**Exemplo 3 - produto - retornando o propio objeto**
como se fosse ponteiro --> aponta para o endereço de armazenamento, não para o conteudo armazenado
```.java
package pkg3;
public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//RETORNA O PROPIO OBJETO
	public Produto clone() {
		return this;
	}
}

```
```.java
package pkg3;

public class Principal {

	public static void main(String[] args) {

		Produto produto1 = new Produto("caneta",1.5);
		Produto produto2 = produto1.clone();
		
		System.out.println("produto 1 - nome: "+produto1.getNome()+", Preço: "+produto1.getPreco());
		System.out.println("produto 2 - nome: "+produto2.getNome()+", Preço: "+produto2.getPreco());
		
		produto2.setPreco(2.0);
		
		System.out.println("\nproduto 1 - nome: "+produto1.getNome()+", Preço: "+produto1.getPreco());
		System.out.println("produto 2 - nome: "+produto2.getNome()+", Preço: "+produto2.getPreco());
		
		if(produto1 == produto2) {
			System.out.println("São iguais");
		}else {
			System.out.println("são diferentes");
		}
	}
}

```
## RELACIONAMENTO ENTRE CLASSES
* é possivel termos objetos objetos como atributos de classes, além de somente tipos primitivos (int,double,char)

## Exemplos slides
**Exemplo 4 - endereço**
```.java
package pkg4;

public class Endereco {
	private String rua;
	private int numero;
	
	public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}
}

```
```.java
package pkg4;

public class Pessoa2 {

		private String nome;
		private int idade;
		private Endereco endereco;
		public Pessoa2(String nome, int idade, Endereco endereco) {
			this.nome = nome;
			this.idade = idade;
			this.endereco = endereco;
		}

		public String getNome() {
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public Endereco getEndereco() {
			return endereco;
		}		
	}
```
```.java
package pkg4;
public class Principal {

	public static void main(String[] args) {
		// INICIALIZA O OBJETO ENDERECO DENTRO DA PASSAGEM DE PARAMETROS
		Pessoa2 p = new Pessoa2("João",30,new Endereco("rua 1",123));
		
		System.out.println("nome: "+p.getNome());
		System.out.println("idade: "+p.getIdade());
		System.out.println("endereço: "+p.getEndereco().getRua()+", "+p.getEndereco().getNumero());
		// SE FOR SOMENTE getEndereco() IRA RETORNAR O ENDEREÇO DE MEMORIA,NÃO O CONTEUDO
	}
}
```

# LISTA
