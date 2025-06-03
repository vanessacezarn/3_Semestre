//Crie uma classe Agenda com um método adicionarContato que receba o nome e o telefone de um contato e lance uma exceção 
//IllegalArgumentException caso o nome ou o telefone sejam nulos ou vazios.


package pkg3;

import pkg2.MinhaExcecao;

public class Agenda {
	public String nome;
	public String telefone;
	
	public void adicionarContato (String nome, String telefone)  throws MinhaExcecao {
		if(nome == null && telefone == null) {
			throw new MinhaExcecao ("campo nome e campo telefone estão vazios");
		}else if(nome == null) {
			throw new MinhaExcecao ("campo nome está vazio");
		}else if(telefone == null){
			throw new MinhaExcecao ("campo telefone está vazio");

		}else {
			System.out.println("Contato adicionado com sucesso!!");
		}
		
	}
	
	
	
}
