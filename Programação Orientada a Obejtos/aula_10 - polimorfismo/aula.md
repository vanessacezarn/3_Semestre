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





