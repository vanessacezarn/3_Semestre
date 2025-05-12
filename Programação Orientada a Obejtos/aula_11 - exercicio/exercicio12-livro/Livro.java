/*Crie uma classe Livro com atributos titulo, autor e ano. Crie uma lista de livros e adicione alguns livros 
 * nessa lista. Em seguida, ordene a lista de livros pelo ano de lançamento e imprima os dados de cada livro.
*/
package exercicio12;

public class Livro {
	protected String titulo;
	protected String autor;
	protected int ano;
	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "ano de publicação: " + ano + ", titulo: " + titulo + " e autor: " + autor;
	}
	
	
	
}
