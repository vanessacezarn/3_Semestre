package exercicio08;

public class ReservaDeVoo extends Reserva{
	public void adicionarReserva() {
		System.out.println("Reserva de VOO feita para "+nome+" na data de "+data);		
	}
	public void adicionarReserva(String classe) {
		System.out.println("Reserva de VOO feita para "+nome+" na data de "+data+" na classe: "+classe);
	
		
	}
	public void cancelarReserva() {
		System.out.println("Cancelamento:Tratando de políticas de cancelamento especificas de Voo");

	}
	

}
