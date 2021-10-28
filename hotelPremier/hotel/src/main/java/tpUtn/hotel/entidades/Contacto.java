package tpUtn.hotel.entidades;

public class Contacto {
	private Integer idContacto;
	private String apellido;
	private String nombre;
	private Integer telefono;
	private String mail;
	public Contacto() {
		super();
	}
	public Contacto(Integer idContacto, String apellido, String nombre, Integer telefono, String mail) {
		super();
		this.idContacto = idContacto;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;
	}
	public Integer getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
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
	
	
}
