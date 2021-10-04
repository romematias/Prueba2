package ar.edu.biblioteca.dominio;

public class LibroHistoria extends Libro {

	public LibroHistoria(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	
	public String fotocopiar() {
		return "Texto del libro codigo "+this.getCodigo();
	}
	
	
}
