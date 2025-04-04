# ENCAPSULAMENTO
    • utilizado usando modificadores de acesso
    • modificadores de acesso
      - public = qualquer classe pode acessar 
      - private = somente a propria classe pode acessar o membro
      - protected = subclasses e classes
      - default (package)
    • GET E SET
    • DIAGRAM DE CLASSE

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
**exemplo01 -  get = retorna valor e set = altera valor**
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
**exemplo 02 -  get = retorna valor e set = altera valor**
```.java
package pkg;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Vanessa",22,"037153");
		p.apresentarDados();
		int idade, ano;
		idade = p.getIdade();//retorna um dado
		ano = 2025 - idade;
		System.out.println("ano de nascimento :"+ano);
		p.setIdade(35);//altera o dado
		p.apresentarDados();
		p.setIdade(-20);
		p.apresentarDados();
		p.setNome("LUIZA");
		p.apresentarDados();
		// PRINT DOS DADOS NA MAIN
		System.out.println("nome: "+p.getNome()+" cezar");
		System.out.println("idade: "+p.getIdade());
		System.out.println("cpf: "+p.getCpf());
	}
}

```
```.java
package pkg;
public class Pessoa {
	private String nome;//public String nome;
	private int idade;//public int idade;
	public String cpf;
	// COMO É PRIVATE TEM QUE USAR METODOS, POIS NÃO PODE ATRIBUIR VALORES DIRETAMENTE NA MAIN
	public void apresentarDados() {
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
	}
	public Pessoa(String nome, int idade,String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade>=0) {
			this.idade = idade;
		}else {
			System.out.println("idade não pode ser negativa");
		}
	}

	public String getCpf() {
		return this.cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
```

**jogo rápido**

```.java
package jogorapido;
public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Vanessa");
		a.setNota1(8.6);
		a.setNota2(9);
		double media = a.calulamedia();
		a.dados();
		System.out.println("o aluno : "+a.getNome()+ " possui media = "+media);
	}
}

```
```.java
package jogorapido;
public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void dados() {
		System.out.println("nome: "+nome);
		System.out.println("nota 1 = "+nota1);
		System.out.println("nota 2 = "+nota2);
	}
	public double calulamedia() {
		double media;
		media=(nota1+nota2)/2;
		return media;
	}
}

```


