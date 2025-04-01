# ENCAPSULAMENTO
    • utilizado usando modificadores de acesso
    • modificadores de acesso
      - public = qualquer classe pode acessar 
      - private = somente a propria classe pode acessar o membro
      - protected = subclasses e classes
      - default (package)

  ## Exemplos
  **exemplo1**
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
	// COMO É PRIVATE TEM QUE USAR CONSTRUTORES, POIS NÃO PODE ATRIBUIR VALORES DIRETAMENTE NA MAIN
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
