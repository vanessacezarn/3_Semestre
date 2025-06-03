package pkg2;


public class Principal {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(5,2,1);
		try {
			t.validarTriangulo();
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
		Triangulo t2 = new Triangulo(1,1,1);
		try {
			t2.validarTriangulo();
		}catch(MinhaExcecao e ) {
			System.out.println("ERRO:"+e.getMessage());
		}
		
	}

}
