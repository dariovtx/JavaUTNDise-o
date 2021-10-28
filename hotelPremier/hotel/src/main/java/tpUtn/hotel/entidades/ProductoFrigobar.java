package tpUtn.hotel.entidades;

public class ProductoFrigobar {
	private Integer idProductoFrigobar;
	private String nombre;
	private Float monto;
	public ProductoFrigobar() {
		super();
	}
	public ProductoFrigobar(Integer idProductoFrigobar, String nombre, Float monto) {
		super();
		this.idProductoFrigobar = idProductoFrigobar;
		this.nombre = nombre;
		this.monto = monto;
	}
	public Integer getIdProductoFrigobar() {
		return idProductoFrigobar;
	}
	public void setIdProductoFrigobar(Integer idProductoFrigobar) {
		this.idProductoFrigobar = idProductoFrigobar;
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
