package atores;

public class Livro {
	
	private int idLivro;
	private String titulo;
	private String ISBN;
	private String autor;
	
	public Livro(int id, String titulo, String ISBN, String autor){
		this.idLivro = id;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
	}
	
	public int getId(){
		return this.idLivro;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public String getISBN(){
		return this.ISBN;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	public void imprimeDados(){
		System.out.println("---------- Livro ----------");
		System.out.println("ID: " + this.idLivro);
		System.out.println("Título: " + this.titulo);
		System.out.println("ISBN: " + this.ISBN);
		System.out.println("Autor: " + this.autor);
	}

}
