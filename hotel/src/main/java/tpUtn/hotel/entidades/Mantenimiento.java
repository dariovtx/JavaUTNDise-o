package tpUtn.hotel.entidades;

import java.util.Date;

public class Mantenimiento {

	private Integer idMantenimiento;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Mantenimiento() {
		super();
	}
	public Mantenimiento(Integer idMantenimiento, Date fechaInicio, Date fechaFin) {
		super();
		this.idMantenimiento = idMantenimiento;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public Integer getIdMantenimiento() {
		return idMantenimiento;
	}
	public void setIdMantenimiento(Integer idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
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
	
	
}
