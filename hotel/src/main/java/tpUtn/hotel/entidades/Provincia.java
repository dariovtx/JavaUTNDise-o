package tpUtn.hotel.entidades;

public class Provincia {
	private Integer idProvincia;
	private String nombre;
	
	private Pais pais;

	public Provincia() {
		super();
	}

	public Provincia(Integer idProvincia, String nombre, Pais pais) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
		this.pais = pais;
	}

	public Integer getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
