package tpUtn.hotel.entidades;

public class Direccion {
	private Integer idDireccion;
	private String calle;
	private Integer numero;
	private String departamento;
	private Integer piso;
	private Localidad localidad;
	public Direccion() {
		super();
	}
	public Direccion(Integer idDireccion, String calle, Integer numero, String departamento, Integer piso, Localidad localidad) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
		this.piso = piso;
		this.localidad = localidad;
	}
	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
}
