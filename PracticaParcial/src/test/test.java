package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.biblioteca.dominio.Biblioteca;
import ar.edu.biblioteca.dominio.Estudiante;
import ar.edu.biblioteca.dominio.Libro;
import ar.edu.biblioteca.dominio.LibroGeografia;
import ar.edu.biblioteca.dominio.LibroHistoria;
import ar.edu.biblioteca.dominio.LibroMatematica;

public class test {

	@Test
	public void queSePuedaCrearBiblioteca() {
		Biblioteca bibliotecaNacional=new Biblioteca(10,10);
		
		
		assertNotNull(bibliotecaNacional);
	}
	
	@Test
	public void queSePuedaCrearUnAlumno() {
		Estudiante estudiante=new Estudiante(1234, "Juan", "Perez");
		
		assertNotNull(estudiante);
	}
	
	@Test
	public void queSePuedanCrearLibros() {
		LibroHistoria libroHistoria=new LibroHistoria(1, "Libro", "Jose");
		LibroGeografia libroGeografia=new LibroGeografia(2, "Libro2", "Ramiro");
		LibroMatematica libroMatematica=new LibroMatematica(3, "Libro3", "Pedro");
		
		assertNotNull(libroHistoria);
		assertNotNull(libroGeografia);
		assertNotNull(libroMatematica);
		
	}
	
	@Test
	public void queSePuedaAgregarEstudianteABiblioteca() {
		Biblioteca bibliotecaNacional=new Biblioteca(10,10);
		bibliotecaNacional.agregarEstudiante(123, "Juan", "Perez");
		
		assertTrue(bibliotecaNacional.checkearExistenciaEstudiante(123));
	}
	
	@Test
	public void queSePuedaAgregarUnLibroABiblioteca() {
		Biblioteca bibliotecaNacional=new Biblioteca(10,10);
		
		
		bibliotecaNacional.agregarLibroHistoria(1, "Libro", "Jose");
		bibliotecaNacional.agregarLibroGeografia(2, "Libro2", "Ramiro");
		bibliotecaNacional.agregarLibroMatematica(3, "Libro3", "Pedro");
		
		assertTrue(bibliotecaNacional.checkearDisponibilidadLibro(1));
		assertTrue(bibliotecaNacional.checkearDisponibilidadLibro(2));
		assertTrue(bibliotecaNacional.checkearDisponibilidadLibro(3));
		
		
	}
	
	@Test
	public void queSePuedaRealizarUnPrestamo() {
		Biblioteca bibliotecaNacional=new Biblioteca(10,10);
		bibliotecaNacional.agregarLibroHistoria(1, "Libro", "Jose");
		bibliotecaNacional.agregarEstudiante(123, "Juan", "Perez");
		
		assertTrue(bibliotecaNacional.prestarLibro(1, 123));
		
	}
	
	@Test
	public void queSePuedanFotocopiarLibrosHistoriaYGeografia() {
		Biblioteca bibliotecaNacional=new Biblioteca(10,10);
		bibliotecaNacional.agregarLibroHistoria(1, "Libro", "Jose");
		bibliotecaNacional.agregarLibroGeografia(2, "Libro2", "Ramiro");
		bibliotecaNacional.agregarLibroMatematica(3, "Libro3", "Pedro");
		
		String textoEsperadoHistoria="Texto del libro codigo 1";
		String textoEsperadoGeografia="Texto del libro codigo 2";
		String textoEsperadoMate="Este libro no se puede fotocopiar";
		
		assertEquals(textoEsperadoHistoria, bibliotecaNacional.fotocopiarLibro(1));
		assertEquals(textoEsperadoGeografia, bibliotecaNacional.fotocopiarLibro(2));
		assertEquals(textoEsperadoMate, bibliotecaNacional.fotocopiarLibro(3));
	}
}
