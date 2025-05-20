package exercicio04;

public class Carro extends Veiculo {

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	@Override
	void Acelerar() {
		System.out.println("o carro está acelerando");
	}

	@Override
	void Frear() {
		System.out.println("o carro está freando");
	}

}
