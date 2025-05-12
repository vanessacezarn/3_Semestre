package exercicio07;

public class Notificacao {
	protected String texto;
	
	
	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public void enviar() {
		System.out.println("Notificação!!!");
		System.out.println(texto);
		
	}
}
