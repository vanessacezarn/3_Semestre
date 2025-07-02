package questao2;

public class Televisao implements Controlavel {

	@Override
	public void ligar() {
		System.out.println("Ligando televisão");
		System.out.println("A televisão está no Canal 2");
		System.out.println("-------------------");		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando televisão ");
		System.out.println("-------------------");		
		
	}

}
