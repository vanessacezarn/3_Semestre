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

**Exemplo 4**
```.java
```
