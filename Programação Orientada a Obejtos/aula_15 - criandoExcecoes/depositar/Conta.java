package depositar;

import pkg.MinhaExcecao;

public abstract class Conta {
	protected double saldo;
	protected double limite;
	
	abstract void Depositar(double valor) throws MinhaExcecao;
	abstract void Sacar(double valor)throws MinhaExcecao;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
	
	
	

	
}
