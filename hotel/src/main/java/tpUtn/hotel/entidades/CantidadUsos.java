package tpUtn.hotel.entidades;

import java.util.LinkedList;
import java.util.List;

public class CantidadUsos {
	private Integer cantidad;
	private List<Servicio> listaServicio;
	
	public CantidadUsos() {
		this.listaServicio = new LinkedList<Servicio>();
	}

	public CantidadUsos(Integer cantidad, List<Servicio> listaServicio) {
		super();
		this.cantidad = cantidad;
		this.listaServicio = listaServicio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public List<Servicio> getListaServicio() {
		return listaServicio;
	}

	public void setListaServicio(List<Servicio> listaServicio) {
		this.listaServicio = listaServicio;
	}
	

}
