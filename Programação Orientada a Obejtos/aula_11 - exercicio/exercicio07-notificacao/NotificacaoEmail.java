package exercicio07;

public class NotificacaoEmail extends Notificacao {
	
	public void enviar() {
		System.out.println("\nNotificação via email !!!");
		System.out.println(texto);
		
	}
	public void enviar(int destinatarios, String texto) {
		for(int i=0;i<destinatarios; i++) {
			System.out.println("\nNotificação via email para todos!!!");
			System.out.println(texto);
		}
	}
}
