# HERANÇA
    • é uma forma de reutilização de software
    • permite reutilização, manutenção simples e eficientes alterações em cascatas
    • é chamada através da palavra "extends"
    • não permite herança múltipla --> classe que herda de outra classe, que herda de outra classe é uma alternativa
    • Comando Super
    	- usado para chamar o construtor da superclasse --> o da classe que é herdada
    	- Ele sempre é chamado, mesmo quando não está explícito no código, quando for explicitado deve ser o primeiro item dentro do construtor. 
    
    

## Exemplo 1 - CARRO
**classe Carro**
```.java
package aula08;
public class Carro {
	protected String nome;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void exibeMsg() {
		System.out.println("Estou na classe CARRO \no nome do carro é : "+nome);
	}
}

```
**classe onibus**
```.java
package aula08;
public class Onibus extends Carro {
	//CLASSE ONIBUS EXTENDE CARRO
	// ESTA CLASSE ONIBUS HERDA TUDO QUE TEM NA CLASSE Carro
	protected String modelo;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}

```
**Principal**
```.java
package aula08;
public class Principal {
	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.setNome("Fusca");
		c.exibeMsg();
		
		Onibus o = new Onibus();
		o.setNome("Expresso Medianeira");
		o.setModelo("OF-0984");
		o.exibeMsg();
		System.out.println("o modelo do onibus é : "+ o.getModelo());	
	}
}

```

## Exemplo 2 - Animal
**classe Animal**
```.java
package jogo_rapido1;

public class Animal {
	protected String nome;
	protected String som;
	protected int idade;
	
	public void exibir() {
		System.out.println("nome: "+nome);
		System.out.println("idade:  "+idade);
	}
}

```
**classe Cachorro**
```.java
package jogo_rapido1;
public class Cachorro extends Animal{
	protected String raca;
	
	public void latir() {
		System.out.println(som);
	}

}

```
**Principal**
```.java
package jogo_rapido1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c = new Cachorro();
		c.setNome("Tobi");
		c.setIdade(5);
		c.setSom("AUAU");
		c.setRaca("viralata");
		c.exibir();
		System.out.println("raça :  "+c.raca);
		c.latir();
	}

}


```
## Exemplo 3 - pessoa
**classe pessoa**
```.java
package jogorapido2;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibeDados() {
		System.out.println("nome: "+nome +"\nIdade: "+idade);
	}

}

```
**classe pessoa juridica**
```.java
package jogorapido2;
public class PessoaJuridica extends Pessoa{

	protected String cnpj;
	protected String socio;
	protected String dtAbertura;
	
	public PessoaJuridica(String nome, int idade,String cnpj ) {
		super(nome, idade);
		this.cnpj=cnpj;
		//pode instanciar os atributos dentro desse construtor
		// CLASSE PESSOA ("PAI") TEM UM CONSTRUTOR, LOGO A CLASSE PESSOA JURIDICA TEM QUE TER UM CONSTRUTOR POR CAUSA DA HERANÇA
		// SUPER() --> SIGNIFICA QUE QUANDO INSTANCIA PESSOAJURIDICA, PRECISO CHAMAR  O CONSTRUTOR DA SUPERCLASSE
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSocio() {
		return socio;
	}
	public void setSocio(String socio) {
		this.socio = socio;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

}

```
**Principal**
```.java
package jogorapido2;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p= new Pessoa("Vanessa ",22);
		p.exibeDados();
		
		System.out.println("\nPessoa Juridica");
		PessoaJuridica pj = new PessoaJuridica("Luiza",20,"123459");
		pj.exibeDados();
		System.out.println("cnpj: "+pj.cnpj);
		pj.setSocio ("Eric");
		System.out.println("socio: "+pj.socio);
	}
}

```

## Exemplo 4 - DESENHO
**classe desenho**
```.java
package herancamultipla;
public class Desenho {
	protected String nomeAutor;

	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
}

```
**classe desenho2d**
```.java
package herancamultipla;
public class Desenho2d extends Desenho {
	protected int largura;
	protected int altura;
	
	public Desenho2d(int largura, int altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
}

```
**classe quadrado**
```.java
package herancamultipla;

public class Quadrado extends Desenho2d {
	protected String descricao;
	public Quadrado(int largura, int altura,String descricao) {
		super(largura, altura);
		this.descricao=descricao;
	}
	public void exibeDados() {
		System.out.println("nome autor: "+this.nomeAutor);
		System.out.println("largura: "+this.largura);
		System.out.println("altura: "+this.altura);
		System.out.println("descricao: "+this.descricao);	
	}
}

```
**Principal - foi criada em outro pacote**
```.java
package pricipal;
import herancamultipla.Quadrado;
public class Principal {
	public static void main(String[] args) {

		Quadrado q = new Quadrado(100,200,"Quadrado-Vanessa");
		q.setNomeAutor("luiza");
		q.exibeDados();
	}
}

```
