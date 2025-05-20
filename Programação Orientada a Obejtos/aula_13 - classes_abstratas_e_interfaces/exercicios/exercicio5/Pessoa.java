/*5) Crie uma classe abstrata chamada Pessoa com aos atributos Nome e Cidade. Crie também um método abstrato chamado EfetuarCompra. 
 * Crie duas classes que herdam de Pessoa, uma chamada PessoaFIsica e outra chamada PessoaJuridica, que implementam o método EfetuarCompra. 
 * Crie atributos específicos para cada uma das novas classes, por exemplo, CPF em PessoaFisica e CNPJ em PessoaJuridica.
*/
package exercicio05;

public abstract class Pessoa {
	public String nome;
	public String cidade;
	public Pessoa(String nome, String cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}
	abstract void efetuarCompra();


}
