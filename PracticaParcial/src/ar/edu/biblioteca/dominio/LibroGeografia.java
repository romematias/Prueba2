package ar.edu.biblioteca.dominio;

public class LibroGeografia extends Libro {

	public LibroGeografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		
	}

	
	public String fotocopiar() {
		return "Texto del libro codigo "+this.getCodigo();
	}
}
