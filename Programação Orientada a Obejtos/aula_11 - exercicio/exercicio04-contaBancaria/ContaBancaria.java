package exercicio04;

public class ContaBancaria {
	protected String numeroConta;
	protected double saldo;
	
	
	public ContaBancaria(String numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	

	public String getNumeroConta() {
		return numeroConta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void depositar(double valor) {
		if(valor>0) {
			saldo=saldo+valor;
			System.out.println("valor depositado com sucesso");
		}else {
			System.out.println("valor inválido");
		}
		
	}
	public void depositar(Cheque c) {
		if(c.getValor()>0) {
			saldo=saldo+c.getValor();
			System.out.println("valor depositado com sucesso");
		}else {
			System.out.println("valor inválido");
		}
		
	}
	
	
	


}
