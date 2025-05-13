## PASSAGEM E RECEBIMENTO DE OBJETOS
* quando passa um objeto por parâmetro --> está sendo passado uma referência para esse objeto
* quando chama um método e passa um objeto por parâmetro para ele, o método passa a ter acesso a todas as propiedades e métodos desse objeto
* para poder fazer essa passagem por parâmetro é necessário
	* definir o objeto que será passado como parâmetro
 	* definir o método que receberá o objeto como parâmetro
  	* declarar o parâmetro como o tipo de objeto que serápassado
  	  
* public static --> metodo qu efunciona como uma função,não deoende da classe
              --> não é uma boa pratica para POO
              --> "corrigir uma gambiarra com outra gambiarra"
* Os métodos static ou métodos da classe são funções que não dependem de nenhuma variável de instância, quando invocados executam uma função sem a dependência do conteúdo de um objeto ou a execução da instância de uma classe, conseguindo chamar direto qualquer método da classe e também manipulando alguns campos da classe.
  

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
## Retornando Objetos
* é possível retornar objetos em métodos
* útil para envio e recebimento de novos objetos para serem trabalhados em outra clases

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
* estrutura de daos que permite armazenar e manipular coleções de objetos
* são implementadas usando interface List e pode ser criadas usando classes como ArrayList, LinkedList e Vector
* interface List é uma subinterface da interface Collection e define um contrato para classes que implementam listas em Java. Ela estende a interface Iterable, o que significa que as listas podem ser percorridas usando um loop for-each.
* listas podem conter objetos de qualquer tipo, incluindo tipos primitivos, como int, double e boolean.
  
**exemplo 5 - pessoa**
```.java
package pkg5;
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
package pkg5;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa ("Vanessa",22);
		Pessoa pessoa2 = new Pessoa ("Maria",25);
		Pessoa pessoa3 = new Pessoa ("Pedro",40);
		
		listaPessoa.add(pessoa1);
		listaPessoa.add(pessoa2);
		listaPessoa.add(pessoa3);
		
		// CHAMANDO UM METODO E PASSANDO A LISTA COMO PARÂMETRO
		exibirPessoas(listaPessoa);
	}
	public static void exibirPessoas(List<Pessoa> lista) {
		for(Pessoa p : lista) {
			System.out.println("nome: "+p.getNome());
			System.out.println("idade: "+p.getIdade());		
			}
	}
	// OUTRA FORMA DE PERCORRER A LISTA E EXIBIR SEU CONTEÚDO
	public static void exibirPessoas2(List<Pessoa> lista) {
		for(int i=0;i<lista.size();i++) {
			System.out.println("nome: "+lista.get(i).getNome());
			System.out.println("idade: "+lista.get(i).getIdade());		
			}
	}
}

```
## Métodos mais comuns para manipular elementos da lista - interface List
* add(Object elemento): adiciona um elemento à lista.
* add(int indice, Object elemento): adiciona um elemento à lista em um índice específico.
* remove(Object elemento): remove um elemento da lista.
* remove(int indice): remove um elemento da lista em um índice específico.
* get(int indice): retorna o elemento da lista no índice especificado.
* set(int indice, Object elemento): substitui o elemento na lista no índice especificado pelo elemento especificado.
* size(): retorna o número de elementos na lista.

