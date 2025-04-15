# HERANÇA
    • é uma forma de reutilização de software

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
```
**classe desenho2d**
```.java
```
**classe quadrado**
```.java
```
**Principal**
```.java
```
