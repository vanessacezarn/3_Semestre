package exercicio04;

public class Moto extends Veiculo {

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	@Override
	void Acelerar() {
		System.out.println("a moto está acelerando");
	}

	@Override
	void Frear() {
		System.out.println("a moto está freando");
	}

}
