package tpUtn.hotel.entidades;

public class DetallePagoFrigobar {
	
	private Integer idDetallePagoFrigobar;
	private Float valorTotalEnPesos;
	private CantidadConsumo cantidadFrigobar;
	public DetallePagoFrigobar() {
		super();
	}
	public DetallePagoFrigobar(Integer idDetallePagoFrigobar, Float valorTotalEnPesos,
			CantidadConsumo cantidadFrigobar) {
		super();
		this.idDetallePagoFrigobar = idDetallePagoFrigobar;
		this.valorTotalEnPesos = valorTotalEnPesos;
		this.cantidadFrigobar = cantidadFrigobar;
	}
	public Integer getIdDetallePagoFrigobar() {
		return idDetallePagoFrigobar;
	}
	public void setIdDetallePagoFrigobar(Integer idDetallePagoFrigobar) {
		this.idDetallePagoFrigobar = idDetallePagoFrigobar;
	}
	public Float getValorTotalEnPesos() {
		return valorTotalEnPesos;
	}
	public void setValorTotalEnPesos(Float valorTotalEnPesos) {
		this.valorTotalEnPesos = valorTotalEnPesos;
	}
	public CantidadConsumo getCantidadFrigobar() {
		return cantidadFrigobar;
	}
	public void setCantidadFrigobar(CantidadConsumo cantidadFrigobar) {
		this.cantidadFrigobar = cantidadFrigobar;
	}
	
	
	
}
