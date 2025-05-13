/*3 - Crie uma classe Livro com os atributos titulo e autor. Em seguida, crie uma lista de livros (ArrayList) e um método que recebe a lista 
 * e imprime os dados de cada livro.
*/
package exercicio03;

public class Livro {
	protected String titulo;
	protected String autor;
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "titulo: " + titulo + ", autor: " + autor;
	}
	
	
	
	
	

}
