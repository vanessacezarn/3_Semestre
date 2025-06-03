//Use uma classe Pessoa crie um construtor que inicialize esses atributos e um método validarIdade que
//lance uma exceção caso a idade informada seja menor que zero ou maior que 120.

package pkg1;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void validaIdade() throws MinhaExcecao {
		if(idade<0 || idade>120) {
			throw new MinhaExcecao ("Idade invalida");
		}else {
			System.out.println("idade valida");
		}
		
	}
	

}
