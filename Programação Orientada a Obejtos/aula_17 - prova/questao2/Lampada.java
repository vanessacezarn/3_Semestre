package questao2;

public class Lampada implements Controlavel{

	@Override
	public void ligar() {
		System.out.println("Ligando lampada ");
		System.out.println("Estado atual da lampada : LIGADO");
		System.out.println("-------------------");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando lampada ");
		System.out.println("Estado atual da lampada : DESLIGADO");
		System.out.println("-------------------");
	}

}
