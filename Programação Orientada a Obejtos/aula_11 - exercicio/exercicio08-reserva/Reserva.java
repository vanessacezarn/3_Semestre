package exercicio08;

public class Reserva {
	protected String nome;
	protected String data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void adicionarReserva() {
		System.out.println("reserva feita para "+nome+" na data de "+data);
		
	}
	public void cancelarReserva() {
		
	}

}
