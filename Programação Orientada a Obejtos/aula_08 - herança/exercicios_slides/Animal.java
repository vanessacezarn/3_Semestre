/*3) Crie uma classe chamada Pessoa que herda da classe SerHumano os
atributos nome e idade e o método falar. A classe SerHumano também
possui herança e herda o atributo tipo e o método andar da classe Animal.
Desse modo, crie uma classe Principal para exibir na tela o conteúdo de
todos os atributos e realizar a chamada de todos os métodos envolvidos no
processo. O método falar retorna a string “Nem todos falam” e o método
andar imprime na tela a string “Todos andam, mas o modo é variado”.
Solicite ao usuário para informar o nome, a idade e o tipo.*/
package exercicio3;

public class Animal {
	protected String tipo;
		
	public Animal(String tipo) {
		super();
		this.tipo = tipo;
	}

	public void andar() {
		System.out.println("Todos andam, mas o modo é variado");
	}
	
	
}
