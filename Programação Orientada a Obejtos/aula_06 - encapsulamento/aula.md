# ENCAPSULAMENTO
    • utilizado usando modificadores de acesso
    • modificadores de acesso
      - public = qualquer classe pode acessar 
      - private = somente a propria classe pode acessar o membro
      - protected = subclasses e classes
      - default (package)

  ## Exemplos
  **exemplo 01**
  ```.java
package pkg;
public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.atribuiDados("Vanessa",22);
		p.apresentarDados();
	}
}

```
```.java
package pkg;
public class Pessoa {
	private String nome;//public String nome;
	private int idade;//public int idade;
	// COMO É PRIVATE TEM QUE USAR METODOS, POIS NÃO PODE ATRIBUIR VALORES DIRETAMENTE NA MAIN
	public void atribuiDados(String n, int i) {
		nome=n;
		idade=i;
	}
	public void apresentarDados() {
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
	}
}

```
**exemplo get - retorna valor e set - altera valor**
```.java
package pkg;
public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Vanessa",22);
		p.setIdade(20); // altera um dado
		p.apresentarDados();

		int idade, ano;
		idade = p.getIdade(); // retorna um dado
		ano = 2025 - idade;
		System.out.println("ano de nascimento :"+ano);
	}
}
```
```.java
package pkg;

public class Pessoa {
	private String nome;//public String nome;
	private int idade;//public int idade;
	// COMO É PRIVATE TEM QUE USAR METODOS, POIS NÃO PODE ATRIBUIR VALORES DIRETAMENTE NA MAIN

	public void apresentarDados() {
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}

```



