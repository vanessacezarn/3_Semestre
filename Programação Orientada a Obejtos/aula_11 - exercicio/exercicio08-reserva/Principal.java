package exercicio08;

public class Principal {

	public static void main(String[] args) {

		Reserva r = new Reserva();
		r.nome= "VANESSA";
		r.data = "15/06/2025";
		r.adicionarReserva();
		
		ReservaDeHotel rh = new ReservaDeHotel();
		System.out.println("\nHOTEL");
		rh.nome = "AMANDA";
		rh.data = "02/06/2025";
		rh.adicionarReserva();
		rh.cancelarReserva();
		
		ReservaDeVoo rv = new ReservaDeVoo();
		System.out.println("\nVOO");

		rv.nome = "Eric";
		rv.data = "06/05/2025";
		rv.adicionarReserva();
		
		rv.nome="Guilherme";
		rv.data = "07/05/2025";
		rv.adicionarReserva("executiva");
		rv.cancelarReserva();

	}

}
