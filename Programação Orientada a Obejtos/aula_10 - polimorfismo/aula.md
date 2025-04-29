# POLIMORFISMO

## sobreescrita de métodos 
    • processo de fornecer uma implementação
    --> override
    
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
	public void emitirSom() { 
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
	public void emitirSom() { 
		System.out.println("piu piu");
	}

}

```
**classe Peixe**
```.java
package AULA;

public class Peixe extends Animal {
	
	@Override
	public void emitirSom() { 
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
## SOBRECARGA

### exemplo 1
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





