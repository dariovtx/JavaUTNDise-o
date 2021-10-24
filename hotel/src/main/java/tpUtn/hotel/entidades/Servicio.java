package tpUtn.hotel.entidades;

public class Servicio {
	private Integer idServicio;
	private String nombre;
	private Float monto;
	public Servicio() {
		super();
	}
	public Servicio(Integer idServicio, String nombre, Float monto) {
		super();
		this.idServicio = idServicio;
		this.nombre = nombre;
		this.monto = monto;
	}
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	
}
