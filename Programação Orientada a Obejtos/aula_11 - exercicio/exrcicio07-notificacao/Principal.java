package exercicio07;

public class Principal {
	public static void main(String[] args) {
		Notificacao n = new Notificacao();
		n.setTexto("bom dia, você está sendo notificado");
		n.enviar();
		
		NotificacaoEmail ne = new NotificacaoEmail();
		ne.setTexto("boa tarde");
		ne.enviar();
		ne.setTexto("boa tarde para todos ");
		ne.enviar(2,ne.getTexto());
		
		NotificacaoApp na = new NotificacaoApp();
		na.setTexto("boa noite");
		na.enviar();


		
	}
}
