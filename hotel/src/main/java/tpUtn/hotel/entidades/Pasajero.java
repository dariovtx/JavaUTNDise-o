package tpUtn.hotel.entidades;

import java.util.Date;

public class Pasajero {

	private Integer id;
	private String apellido;
	private String nombre;
	private String tipoDocumento;
	private Integer documento;	
	private String cuit;
	private String posIVA;
	private Date fechaNacimiento;
	private Integer telefono;
	private String mail;
	private String ocupacion;
	
	
	private Direccion direccion;
	private Pais pais;
	
	
	public Pasajero() {
		
	}
	
	public Pasajero(Integer id, String apellido, String nombre, String tipoDocumento, Integer documento, String cuit,
			String posIVA, Date fechaNacimiento, Integer telefono, String mail, String ocupacion,Direccion direccion,Pais pais) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.cuit = cuit;
		this.posIVA = posIVA;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.mail = mail;
		this.ocupacion = ocupacion;
		this.pais = pais;
		this.direccion = direccion;
	}
	
	//------------------- GET and SET -------------------\\
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getDocumento() {
		return documento;
	}
	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", tipoDocumento="
				+ tipoDocumento + ", documento=" + documento + ", cuit=" + cuit + ", posIVA=" + posIVA
				+ ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", mail=" + mail + ", ocupacion="
				+ ocupacion + ", direccion=" + direccion + ", pais=" + pais + "]";
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getPosIVA() {
		return posIVA;
	}
	public void setPosIVA(String posIVA) {
		this.posIVA = posIVA;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
