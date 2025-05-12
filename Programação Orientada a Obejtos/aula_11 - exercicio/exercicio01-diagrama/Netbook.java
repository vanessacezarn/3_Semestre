package exercicio01;

public class Netbook extends Computador {
	
	public Netbook(String marca) {
		super(marca);
	}
	
	public void exibeMarca() {
		System.out.println("marca: "+marca);
	}
}
