package tpUtn.hotel.entidades;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Ocupacion {

	private Integer idOcupacion;
	private Date fechaInicio;
	private Date fechaFin;
	private Integer horaChekin;
	private Integer horaChekout;
	
	/**
	 * Relaciones de Ocupacion
	 */
	private List<Pasajero> listaPasajero;
	private List<Servicio> listaServicio;
	private List<ProductoFrigobar> listaProductoFrigobar;
	private Pasajero responsableHabitacion;
	
	private Conserje conserje;
	
	//------------------- Constructores -------------------\\
	public Ocupacion() {
		this.listaPasajero = new LinkedList<Pasajero>();
		this.listaServicio = new LinkedList<Servicio>();
		this.listaProductoFrigobar = new LinkedList<ProductoFrigobar>();
	}
	public Ocupacion(Integer idOcupacion, Date fechaInicio, Date fechaFin, Integer horaChekin, 
			Integer horaChekout,Pasajero responsableHabitacion, Conserje conserje) {
		super();
		this.idOcupacion = idOcupacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.horaChekin = horaChekin;
		this.horaChekout = horaChekout;
		this.responsableHabitacion = responsableHabitacion;
		this.conserje = conserje;
		
	}
	
	
	//------------------- GET and SET -------------------\\
	
	public List<Pasajero> getListaPasajero() {
		return listaPasajero;
	}
	
	public Pasajero getResponsableHabitacion() {
		return responsableHabitacion;
	}
	public Conserje getConserje() {
		return conserje;
	}
	public void setConserje(Conserje conserje) {
		this.conserje = conserje;
	}
	public void setResponsableHabitacion(Pasajero responsableHabitacion) {
		this.responsableHabitacion = responsableHabitacion;
	}
	public void setListaPasajero(List<Pasajero> listaPasajero) {
		this.listaPasajero = listaPasajero;
	}
	public List<Servicio> getListaServicio() {
		return listaServicio;
	}
	public void setListaServicio(List<Servicio> listaServicio) {
		this.listaServicio = listaServicio;
	}
	public List<ProductoFrigobar> getListaProductoFrigobar() {
		return listaProductoFrigobar;
	}
	public void setListaProductoFrigobar(List<ProductoFrigobar> listaProductoFrigobar) {
		this.listaProductoFrigobar = listaProductoFrigobar;
	}
	
	public Integer getIdOcupacion() {
		return idOcupacion;
	}
	public void setIdOcupacion(Integer idOcupacion) {
		this.idOcupacion = idOcupacion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Integer getHoraChekin() {
		return horaChekin;
	}
	public void setHoraChekin(Integer horaChekin) {
		this.horaChekin = horaChekin;
	}
	public Integer getHoraChekout() {
		return horaChekout;
	}
	public void setHoraChekout(Integer horaChekout) {
		this.horaChekout = horaChekout;
	}
	
	

	
}
