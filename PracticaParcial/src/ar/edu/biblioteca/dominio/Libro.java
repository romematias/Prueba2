package ar.edu.biblioteca.dominio;

public abstract class Libro {

	private Integer codigo;
	private String nombre;
	private String autor;
	private Boolean disponible;
	
	public Libro (Integer codigo, String nombre, String autor) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.autor=autor;
		this.disponible=true;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Boolean getDisponible() {
		return disponible;
	}


	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	
	public abstract String fotocopiar();
	
	
}
