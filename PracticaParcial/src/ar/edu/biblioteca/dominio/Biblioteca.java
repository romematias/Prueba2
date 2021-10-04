package ar.edu.biblioteca.dominio;

public class Biblioteca {

	private Estudiante[] estudiantes;
	private Libro[] libros;
	private Prestamo[] prestamosRealizados;

	public Biblioteca(int cantidadEstudiantes, int cantidadLibros) {
		this.estudiantes = new Estudiante[cantidadEstudiantes];
		this.libros = new Libro[cantidadLibros];
		this.prestamosRealizados = new Prestamo[cantidadLibros];
	}

	public Boolean agregarEstudiante(Integer dni, String nombre, String apellido) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i] == null) {
				estudiantes[i] = new Estudiante(dni, nombre, apellido);
				sePudoAgregar = true;
				break;
			}
		}
		return sePudoAgregar;
	}

	public Boolean prestarLibro(Integer codigoLibro, Integer dniEstudiante) {
		Boolean sePudoPrestar = false;

		if (checkearDisponibilidadLibro(codigoLibro)) {
			if (checkearExistenciaEstudiante(dniEstudiante)) {
				for (int i = 0; i < prestamosRealizados.length; i++) {
					if (prestamosRealizados[i] == null) {
						Prestamo prestamo = new Prestamo((dniEstudiante + 1),
								this.buscarEstudianteQuePidePrestamo(dniEstudiante),
								this.buscarLibroAPrestar(codigoLibro));
						prestamosRealizados[i] = prestamo;
						sePudoPrestar = true;
						break;
					}
				}
			}
		}

		return sePudoPrestar;
	}

	public Boolean checkearDisponibilidadLibro(Integer codigoLibro) {
		Boolean estaDisponible = false;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				if (libros[i].getCodigo().equals(codigoLibro)) {
					if (libros[i].getDisponible()) {
						estaDisponible = true;
						break;
					}
				}
			}
		}

		return estaDisponible;
	}

	public Boolean checkearExistenciaEstudiante(Integer dniEstudiante) {
		Boolean existe = false;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i] != null) {
				if (estudiantes[i].getDni().equals(dniEstudiante)) {
					existe = true;
					break;
				}
			}
		}
		return existe;
	}

	public Libro buscarLibroAPrestar(Integer codigoLibro) {
		Libro libroAPrestar = null;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {
				if (libros[i].getCodigo().equals(codigoLibro)) {
					if (libros[i].getDisponible()) {
						libroAPrestar = libros[i];
						break;
					}
				}
			}
		}

		return libroAPrestar;
	}

	public Estudiante buscarEstudianteQuePidePrestamo(Integer dniEstudiante) {
		Estudiante estudiantePrestamo = null;
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i] != null) {
				if (estudiantes[i].getDni().equals(dniEstudiante)) {
					estudiantePrestamo = estudiantes[i];
					break;
				}
			}
		}
		return estudiantePrestamo;
	}

	public Boolean agregarLibroHistoria(Integer codigo, String nombre, String autor) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = new LibroHistoria(codigo, nombre, autor);
				sePudoAgregar = true;
				break;
			}
		}
		return sePudoAgregar;
	}
	
	public Boolean agregarLibroGeografia(Integer codigo, String nombre, String autor) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = new LibroGeografia(codigo, nombre, autor);
				sePudoAgregar = true;
				break;
			}
		}
		return sePudoAgregar;
	}
	
	public Boolean agregarLibroMatematica(Integer codigo, String nombre, String autor) {
		Boolean sePudoAgregar = false;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = new LibroMatematica(codigo, nombre, autor);
				sePudoAgregar = true;
				break;
			}
		}
		return sePudoAgregar;
	}
	
	public String fotocopiarLibro(Integer codigo) {
		String fotocopia="";
		for (int i = 0; i < libros.length; i++) {
			if(libros[i]!=null) {
				if(libros[i].getCodigo().equals(codigo)) {
					fotocopia=libros[i].fotocopiar();
					break;
				}
			}
		}
		return fotocopia;
	}
	
}
