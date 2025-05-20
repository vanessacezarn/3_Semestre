package exercicio04;

public class Principal {

	public static void main(String[] args) {
		System.out.println("CARRO");
		Veiculo c = new Carro("ford","ka",2020);
		c.Acelerar();
		c.Frear();
		
		System.out.println("\nMOTO");
		Veiculo m = new Moto("honda","cb-300",2015);
		m.Acelerar();
		m.Frear();
		
		
	}

}
