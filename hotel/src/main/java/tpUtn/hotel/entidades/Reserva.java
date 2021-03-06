package tpUtn.hotel.entidades;

import java.util.Date;


public class Reserva {
	
	private Integer idReserva;
	private Date fechaInicio;
	private Date fechaFin;
	
	private Contacto contacto;
	private Conserje conserje;

		
	public Reserva() {
		super();
	}

	public Reserva(Integer idReserva, Date fechaInicio, Date fechaFin, Contacto contacto, Conserje conserje) {
		super();
		this.idReserva = idReserva;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.contacto = contacto;
		this.conserje = conserje;
	}

	
	public Conserje getConserje() {
		return conserje;
	}

	public void setConserje(Conserje conserje) {
		this.conserje = conserje;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
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

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	
	
}
