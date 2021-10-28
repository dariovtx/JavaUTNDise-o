package tpUtn.hotel.entidades;

import java.util.LinkedList;
import java.util.List;

public class CantidadConsumo {
  private Integer cantidad;
  private List<ProductoFrigobar> listaProductoFrigobar;
	public CantidadConsumo() {
	
		this.listaProductoFrigobar = new LinkedList<ProductoFrigobar>();
	}
	public CantidadConsumo(Integer cantidad, List<ProductoFrigobar> listaProductoFrigobar) {
		super();
		this.cantidad = cantidad;
		this.listaProductoFrigobar = listaProductoFrigobar;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public List<ProductoFrigobar> getListaProductoFrigobar() {
		return listaProductoFrigobar;
	}
	public void setListaProductoFrigobar(List<ProductoFrigobar> listaProductoFrigobar) {
		this.listaProductoFrigobar = listaProductoFrigobar;
	}
  
}
