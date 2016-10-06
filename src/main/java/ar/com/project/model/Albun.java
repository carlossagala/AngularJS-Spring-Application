package ar.com.project.model;

public class Albun {
	
	private String nombre;
	private String banda;
	private int anio;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public Albun(){}
	
	public Albun(String nombre, String banda, int anio) {
		super();
		this.nombre = nombre;
		this.banda = banda;
		this.setAnio(anio);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
}
