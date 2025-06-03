package pkg1;


public class Principal {

	public static void main(String[] args) throws pkg1.MinhaExcecao {
		Pessoa p = new Pessoa("Vanessa",150);
		try {
			p.validaIdade();
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		Pessoa p2 = new Pessoa("Amanda",2);

		try {
			p2.validaIdade();
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}		
	}
	
}
