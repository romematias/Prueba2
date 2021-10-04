package ar.edu.biblioteca.dominio;

public class Prestamo {

	private Integer codigoPrestamo;
	private Estudiante estudiantePrestamo;
	private Libro libroPrestamo;
	
	
	public Prestamo (Integer codigo, Estudiante estudiante, Libro libro) {
		this.codigoPrestamo=codigo;
		this.estudiantePrestamo=estudiante;
		this.libroPrestamo=libro;
	}


	public Integer getCodigoPrestamo() {
		return codigoPrestamo;
	}


	public void setCodigoPrestamo(Integer codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}


	public Estudiante getEstudiantePrestamo() {
		return estudiantePrestamo;
	}


	public void setEstudiantePrestamo(Estudiante estudiantePrestamo) {
		this.estudiantePrestamo = estudiantePrestamo;
	}


	public Libro getLibroPrestamo() {
		return libroPrestamo;
	}


	public void setLibroPrestamo(Libro libroPrestamo) {
		this.libroPrestamo = libroPrestamo;
	}
	
	
}
