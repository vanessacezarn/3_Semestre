# POLIMORFISMO
    • poli = muitas + morphos = forma --> muitas formas
    • permite programar no geral ao invés de programas no específico
    • exemplo de polimorfismo: sobrescrita e sobrecarga
## Sobrescrita de métodos - override
    • métodos com o mesmo nome, mesmos parâmetros e mesmo tipo de retorno --> é alterado apenas o comportamento do método
    • ou seja, TUDO NO MÉTODO É IGUAL, APENAS MUDA A IMPLEMENTAÇÃO
    • processo de fornecer uma implementação diferente para um método já definido em uma classe base
    • é feito na classe derivada, que herda o método da classe base
    • é realizado com a mesma assinatura de método da classe base, mas com uma implementação diferente
    • permite que a classe derivada substitua o comportamento da classe base para o método em questão
    
### Exemplo 1 
**classe Animal**
```.java
package AULA;
public class Animal {
	public String nome;
	public void emitirSom() { // programando de forma geral
		System.out.println("Animal emitindo som...");
	}
}
```
**classe Capivara**
```.java
package AULA;

public class Capivara extends Animal {
	@Override
	public void emitirSom() {  //programado de forma especifica
		System.out.println("wheek-wheek");
	}
}
```
**classe Cachoroo**
```.java
package AULA;
public class Cachorro extends Animal {
	public String raca;	
	@Override
	public void emitirSom() { //programado de forma especifica
		System.out.println("au au");
	}
}
```

**classe Passarinho**
```.java
package AULA;
public class Passsarinho extends Animal {
	@Override
	public void emitirSom() {  //programado de forma especifica
		System.out.println("piu piu");
	}
}

```
**classe Peixe**
```.java
package AULA;
public class Peixe extends Animal {
	@Override
	public void emitirSom() { //programado de forma especifica
		System.out.println("glub glub");
	}
}
```
**classe Principal**
```.java
package AULA;
public class Principal {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.nome="Animal 1";
		a.emitirSom();
		
		System.out.println("\nclasse animal chamando classe cachorro");
		a = new Cachorro();
		a.emitirSom();
		
		System.out.println("\nclasse cachorro");
		Cachorro c = new Cachorro();
		c.nome="Caramelo";
		c.raca="SRD";
		c.emitirSom();
		
		System.out.println("\nclasse passarinho");
		a = new Passsarinho();
		a.emitirSom();
		
		System.out.println("\nclasse peixe");
		a = new Peixe();
		a.emitirSom();
		
		System.out.println("\nclasse capivara");
		a = new Capivara();
		a.emitirSom();
	}
}
```

### Jogo rápido
Crie uma classe Pessoa com um método trabalhar(). Em seguida, crie uma classe Programador que herda da classe Pessoa 
e sobrescreve o método trabalhar() para imprimir "Programando...".
 
**classe pessoa**
```.java
package jogoRapido1;
public class Pessoa {
	public void trabalhar() {
		System.out.println("trabalhando");
	}
}
```
**classe programador**
```.java
package jogoRapido1;
public class Programador extends Pessoa {
	public void trabalhar() {
		System.out.println("PROGRAMANDO");
	}
}
```
**classe principal**
```.java
package jogoRapido1;
public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.trabalhar();
		
		Programador pp = new Programador();
		pp.trabalhar();
	}
}
```
## SOBRECARGA DE MÉTODOS - overload
    • métodos com o mesmo nome, pórem com parâmetros e/ou tipos  de retornos diferentes  
    • dinâmico em tempo de compilação é escolhido
    • é o processo de fornecer várias implementações para um método com o mesmo nome, mas com diferentes assinaturas de parâmetros 
    • permite que a classe tenha vários métodos com o mesmo nome, mas que façam coisas diferentes, dependendo dos parâmetros que são passados
    • o java decide qual método chamar com base nos parâmetros que são passados durante a chamada do método
    
### exemplo 1 - calculadora
**classe calculadora**
```.java
package sobrecarga;

public class Calculadora {
	public int somar (int x, int y) {
		System.out.println("int");
		return x + y;
	}
	
	public int somar(int x, int y, int z) {
		System.out.println("int");
		return x+y+z;
	}
	
	public double somar(double a, double b) {
		System.out.println("double");
		return a+b;
	}
	
	public int multiplica(int a, int b) {
		System.out.println("int");
		return a*b;
	}
	
	public double multiplica(double a, double b) {
		System.out.println("double");
		return a*b;
	}
}
```
**classe principal**
```.java
package sobrecarga;
public class Principal {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int resultado=c.somar(2, 3);
		int resultado2=c.somar(2, 3, 4);
		System.out.println("Resultado = "+resultado);
		System.out.println("Resultado 2 = "+resultado2);
		
		double resultado3 = c.somar(3, 7);
		System.out.println("Resultado 3 = "+resultado3);

		int resultadomulti=c.multiplica(5, 4);
		System.out.println("Resultado multiplicação = "+resultadomulti);

		double resultadomultiD=c.multiplica(8.2, 4);
		System.out.println("Resultado multiplicação = "+resultadomultiD);			
	}
}

```
### jogo rápido
Crie uma classe Pessoa com um método dizerOla() que imprime "Olá!".
Sobrecarregue o método dizerOla() para aceitar um nome por parâmetro e
imprimir "Olá, <nome>!".

**classe pessoa**
```.java
package jogorapido2;
public class Pessoa {
	public String dizerOla(){
		return "Olá!";
	}
	public String dizerOla(String nome) {
		return "Olá, "+nome+"!";
	}
}

```
**classe principal**
```.java
package jogorapido2;
public class Principal {
	public static void main(String[] args) {
	Pessoa p = new Pessoa();
	String a = p.dizerOla();
	String nome = p.dizerOla("Vanessa");
	
	System.out.println(a);
	System.out.println(nome);
	}
}

```





