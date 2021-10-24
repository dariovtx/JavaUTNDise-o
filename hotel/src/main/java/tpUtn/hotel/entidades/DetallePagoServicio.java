package tpUtn.hotel.entidades;

public class DetallePagoServicio {
	private Integer idDetallePagoServicio;
	private Float valorTotalEnPesos;
	private CantidadUsos cantidadServicios;
	public DetallePagoServicio() {
		super();
	}
	public DetallePagoServicio(Integer idDetallePagoServicio, Float valorTotalEnPesos, CantidadUsos cantidadServicios) {
		super();
		this.idDetallePagoServicio = idDetallePagoServicio;
		this.valorTotalEnPesos = valorTotalEnPesos;
		this.cantidadServicios = cantidadServicios;
	}
	public Integer getIdDetallePagoServicio() {
		return idDetallePagoServicio;
	}
	public void setIdDetallePagoServicio(Integer idDetallePagoServicio) {
		this.idDetallePagoServicio = idDetallePagoServicio;
	}
	public Float getValorTotalEnPesos() {
		return valorTotalEnPesos;
	}
	public void setValorTotalEnPesos(Float valorTotalEnPesos) {
		this.valorTotalEnPesos = valorTotalEnPesos;
	}
	public CantidadUsos getCantidadServicios() {
		return cantidadServicios;
	}
	public void setCantidadServicios(CantidadUsos cantidadServicios) {
		this.cantidadServicios = cantidadServicios;
	}
	
	
}
