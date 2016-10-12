package ar.com.project.model;

//import javax.persistence.Column;	
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity(name="Albunes")
public class Albun {

	// @Id
	// @Column(name = "Albun_id")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// @Column(name="nombre")
	private String nombre;
	// @Column(name="banda")
	private String banda;
	// @Column(name="año")
	private int anio;

	public String getNombre() {
		return nombre;
	}

	public Albun() {
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
