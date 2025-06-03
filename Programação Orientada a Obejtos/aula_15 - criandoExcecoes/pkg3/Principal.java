package pkg3;

import pkg2.MinhaExcecao;

public class Principal {

	public static void main(String[] args) {

		Agenda a = new Agenda();
		
		try {
			a.adicionarContato(null, "55991336889");
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
		
		Agenda a2 = new Agenda();
		try {
			a2.adicionarContato("vanessa", null);
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
		
		
		Agenda a3 = new Agenda();
		try {
			a3.adicionarContato("vanessa", "55991336889");
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
		
		Agenda a4 = new Agenda();
		try {
			a3.adicionarContato(null,null);
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
		

	}

}
