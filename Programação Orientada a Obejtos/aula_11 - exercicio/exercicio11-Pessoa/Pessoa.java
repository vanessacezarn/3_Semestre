/*Crie uma classe Pessoa com atributos nome, idade e sexo. Crie uma lista de pessoas e adicione algumas pessoas
 *  nessa lista. Em seguida, crie um método que recebe uma lista de pessoas e retorna a quantidade de mulheres.
 *   Por fim, chame esse método passando a lista de pessoas e imprima a quantidade de mulheres.
*/
package exercicio11;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
