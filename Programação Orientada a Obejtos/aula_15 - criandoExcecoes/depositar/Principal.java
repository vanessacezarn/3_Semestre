package depositar;

import pkg.MinhaExcecao;

public class Principal {

	public static void main(String[] args)throws MinhaExcecao {
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(1000);
		cc.setLimite(200);
		cc.Depositar(150);
		try {
			cc.Depositar(-150);
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		try {
			cc.Sacar(8000);
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		cc.Sacar(50);
		try {
			cc.Sacar(-80);
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
	}
	

}
