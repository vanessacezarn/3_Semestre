//3) Crie uma classe chamada Pessoa. Nesta classe deve conter os atributos: Nome, email, data de nascimento, Endereço e o atributo Admin do 
//tipo booleano. Crie um método que retorne o Email da pessoa. Crie um método chamado promoverAdmin que ao ser chamado altera o atributo Admin.
//Faça a leitura de duas pessoas na main e mantenha uma como admin e outra não.

package exercicio03;

public class Pessoa {
	String nome;
	String email;
	String data_nascimento;
	String endereco;
	boolean admin = false;
	
	public Pessoa() {
		
	}
	
	public String Email() {
		
		return email;
	}
	
	public void promoverAdmin() {
		if(!admin) {
			admin=true;
			System.out.println("Pessoa 2 promovida a Admin com sucesso");
		}
	}

}
