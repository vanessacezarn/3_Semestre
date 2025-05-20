# CLASSES ABSTRATAS 
* classe abstrata em java é uma classe que **não** pode ser INSTANCIADA, ou seja, não é possivel criar objetos a partir dela
* ela é projetada para ser estendida por outras classes que podem ser instanciada
* para criar uma classe abstrata usa-se **abstract** antes da palavra class na declaração da classe
* pode-se definir métodos abstratos dentro de uma classe abstrata
  * um método abstrato é um método sem implementação que deve ser implementado por qualquer classe que estanda a classe abstrata
    
**exemplo 1 - Animal**
```.java
package pkg;
abstract class Animal {
	// PELO ENCAPSULAMENTO SEMPRE VAI SER PUBLICO
	// public abstract class TAMBÉM PODER SER USADO
	public String especie;
	public int idade;
	
	public void exibeDados() {
		System.out.println("Espécie: "+especie);
		System.out.println("Idade: "+idade);
	}
	abstract void emitirSom();
}

```
```.java
package pkg;
public class Cachorro extends Animal {
	// OBRIGATORIAMENTE A CLASSE QUE EXTENDER DE ANIMAL TEM QUE IMPLEMENTAR OS MÉTODOS DA CLASSE ABSTRATA
	public String raca;
	@Override
	void emitirSom() {
		System.out.println("Au Au Au");
	}
	public void cuidarPatio() {
		System.out.println("o cachorro está cuidando do pátio");
	}
	@Override
	public void exibeDados() {
		//super.exibeDados(); -> PELO CTRL+SHIFT+S
		System.out.println("Espécie: "+especie);
		System.out.println("Idade: "+idade);
		System.out.println("raça: "+raca);
	}
}

```
```.java
package pkg;
public class Principal {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.especie = "cachorro";
		c.idade = 5;
		c.raca = "caramelo";
		c.exibeDados();
		c.cuidarPatio();
		c.emitirSom();
	}
}

```
**exemplo 2 - Forma**
```.java
package pkg2;
abstract class Forma {
	public abstract double area();
	public abstract double perimetro();
}
```
```.java
package pkg2;
public class Retangulo extends Forma {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	@Override
	public double area() {
		return largura*altura;
	}
	@Override
	public double perimetro() {
		return 2*(largura+altura);
	}
}
```
```.java
package pkg2;
public class Circulo extends Forma{
	private double raio;
	double pi = 3.14159;
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raio;
	}
}

```
```.java
package pkg2;
public class Principal {
	public static void main(String[] args) {
		System.out.println("RETANGULO");
		Retangulo r = new Retangulo(5,2.2);
		double areaR = r.area();
		double perimetroR = r.perimetro();
		System.out.println("area = "+areaR+" perimetro = "+perimetroR);
		
		System.out.println("CIRCULO");
		Circulo c = new Circulo(2);
		double areaC = c.area();
		double perimetroC = c.perimetro();
		System.out.println("area = "+areaC+" perimetro = "+perimetroC);
	}
}

```
# INTERFACES
* é uma espécie de contrato que define um conjunto de métodos que uma classe deve implementar
* é definida atraves da palavra-chave **interface**
* permite que diferentes classes possam implementar seus proópios comporatamentos para um
* j
* os métodos definidos na interface são por padrão public e abstract 🠖 não sendo necessário especificar esses modificadores de acesso 🠖 eles são implicitamente definidos
* para implementar uma interface em uma classe, utiliza-se a palavra chave **implements**
* a classe deve então implementar **TODOS** os métodos definidos na interface
  
**Exemplo 1 - Animal**
```.java
package pkg3;

public interface Animal {
	 void emitirSom();
	 void exibiDados();
}

```
```.java
```
```.java
```
```.java
```
# DIFERNÇAS ENTRE CLASSE ABSTRATA E INTERFACE
