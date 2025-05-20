/*4) Crie uma classe abstrata chamada Veiculo com os atributos Marca, Modelo e Ano. Crie dois métodos abstratos chamados Acelerar e Frear. 
 * Crie duas classes que herdam de Veiculo, uma chamada Carro e outra chamada Moto, que implementam os métodos Acelerar e Frear.*/
package exercicio04;

public abstract class Veiculo {
	public String marca;
	public String modelo;
	public int ano;
	
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	abstract void Acelerar();
	abstract void Frear();


}
