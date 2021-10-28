package tpUtn.hotel.entidades;

public class TipoHabitacion {
	private String nombre;
	private Float costoPorNoche;
	public TipoHabitacion() {
		super();
	}
	public TipoHabitacion(String nombre, Float costoPorNoche) {
		super();
		this.nombre = nombre;
		this.costoPorNoche = costoPorNoche;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getCostoPorNoche() {
		return costoPorNoche;
	}
	public void setCostoPorNoche(Float costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}
	
}
