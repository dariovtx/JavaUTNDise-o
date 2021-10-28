package tpUtn.hotel.entidades;

public class PersonaJuridica {
	private Integer idPersonaJuridica;
	private String nombre;
	private String cuit;
	private String razonSocial;
	private Integer telefono;
	private String mail;
	
	private Direccion direccion;

	public PersonaJuridica() {
		super();
	}

	public PersonaJuridica(Integer idPersonaJuridica, String nombre, String cuit, String razonSocial, Integer telefono,
			String mail, Direccion direccion) {
		super();
		this.idPersonaJuridica = idPersonaJuridica;
		this.nombre = nombre;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.mail = mail;
		this.direccion = direccion;
	}

	public Integer getIdPersonaJuridica() {
		return idPersonaJuridica;
	}

	public void setIdPersonaJuridica(Integer idPersonaJuridica) {
		this.idPersonaJuridica = idPersonaJuridica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
