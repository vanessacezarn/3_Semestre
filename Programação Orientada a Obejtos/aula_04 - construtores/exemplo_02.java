package pkg2;

public class Carro {
	
		public String marca;
		public String modelo;
		public boolean alugado;
		
		public boolean verificaAlugado() {
			return alugado;
		}
		
		
		
		public void alugar() {
			if(!verificaAlugado()) {
				alugado = true;
				System.out.println("Carro alugado");
			}else {
				System.out.println("Carro disponivel para locação");
			}
		}
		
		public void devolver() {
			if(verificaAlugado()) {
			alugado = false;
			System.out.println("Carro devolvido");
			}else {
				System.out.println("Carro não alugado. não é possivel devoluçao");
			}
		}
		
		
		public void exibirDados(){
			System.out.println("MODELO: "+modelo);
			System.out.println("MARCA: "+marca);
			System.out.println("ALUGADO: "+alugado);

			
		}
}

