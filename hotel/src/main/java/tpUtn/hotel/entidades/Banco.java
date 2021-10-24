package tpUtn.hotel.entidades;

public class Banco {
   private Integer idBanco;
   private String nombre;
   
   private Direccion direccion;

public Banco() {
	super();
}

public Banco(Integer idBanco, String nombre, Direccion direccion) {
	super();
	this.idBanco = idBanco;
	this.nombre = nombre;
	this.direccion = direccion;
}

public Integer getIdBanco() {
	return idBanco;
}

public void setIdBanco(Integer idBanco) {
	this.idBanco = idBanco;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Direccion getDireccion() {
	return direccion;
}

public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}
   
   
}
