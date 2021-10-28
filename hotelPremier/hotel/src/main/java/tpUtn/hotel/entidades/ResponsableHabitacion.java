package tpUtn.hotel.entidades;

import java.util.List;

public class ResponsableHabitacion {
	private Pasajero pasajero;
	private List<Ocupacion> listaOcupacion;
	public ResponsableHabitacion() {
		super();
	}
	public ResponsableHabitacion(Pasajero pasajero, List<Ocupacion> listaOcupacion) {
		super();
		this.pasajero = pasajero;
		this.listaOcupacion = listaOcupacion;
	}
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	public List<Ocupacion> getListaOcupacion() {
		return listaOcupacion;
	}
	public void setListaOcupacion(List<Ocupacion> listaOcupacion) {
		this.listaOcupacion = listaOcupacion;
	}
	
}
