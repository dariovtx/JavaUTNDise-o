package tpUtn.hotel.entidades;

public class Pais {
	private Integer idPais;
	private String nombre;
	private String nacionalidad;
	public Pais() {
		super();
	}
	public Pais(Integer idPais, String nombre, String nacionalidad) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
