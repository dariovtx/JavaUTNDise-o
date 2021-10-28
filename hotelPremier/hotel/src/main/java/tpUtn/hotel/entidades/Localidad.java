package tpUtn.hotel.entidades;

public class Localidad {
	private Integer idLocalidad;
	private String nombre;
	private Integer codigoPostal;
	
	private Provincia provincia;

	public Localidad() {
		super();
	}

	public Localidad(Integer idLocalidad, String nombre, Integer codigoPostal, Provincia provincia) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}

	public Integer getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	
}
