package ort.edu.ar.ejercicio2;

public class Atleta {
	private String nombre;
	private double segundo;

////////////////CONSTRUCTOR///////////////////
	public Atleta(String nombre, double segundo) {
		super();
		this.nombre = nombre;
		this.segundo = segundo;
	}

////////////////GETTERS Y SETTERS///////////////////
	public String getNombre() {
		return nombre;
	}

	public double getSegundo() {
		return segundo;
	}

////////////////TOSTRING///////////////////
	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", segundo=" + segundo + "]";
	}

}
