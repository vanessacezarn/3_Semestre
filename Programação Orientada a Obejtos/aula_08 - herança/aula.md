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
		c.nome = "Tobi";
		c.idade = 5;
		c.som = "AU AU ";
		c.raca = "viralata";
		c.exibir();
		System.out.println("raça :  "+c.raca);
		c.latir();
	}

}

```
