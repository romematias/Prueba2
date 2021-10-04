package ar.edu.biblioteca.dominio;

public class LibroMatematica extends Libro {

	public LibroMatematica(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		
	}

	
	public String fotocopiar() {
		return "Este libro no se puede fotocopiar";
	}
}
