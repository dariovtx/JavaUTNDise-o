package tpUtn.hotel.entidades;

import java.util.LinkedList;
import java.util.List;

import tpUtn.hotel.enumerados.MetodoPagoEnum;
import tpUtn.hotel.enumerados.NombreDivisaEnum;


public class DetallePagoFactura {

	private Integer idDetallePagoFactura;
	private MetodoPagoEnum metodoDePago;
	private Float monto;
	private NombreDivisaEnum nombreDivisa;
	
	private List<DetallePagoFrigobar> listaDetallePagoFrigobar;
	private List<DetallePagoServicio> listaDetallePagoServicio;
	private Tarjeta tarjeta;
	private Cheque cheque;
	
	public Float CalcularMontoEnPesos() {
		
		if( this.nombreDivisa.name() == "DOLAR") {
			return this.monto * 180;
		}else if(this.nombreDivisa.name() == "EUROS") {
			return this.monto * 180;
		}else if(this.nombreDivisa.name() == "PESOS_URUGUAYOS") {
			return this.monto * 180;
		}else {//moneda real
			return this.monto * 180;
		}
		
	}
	
	
	public DetallePagoFactura() {
		this.listaDetallePagoFrigobar = new LinkedList<DetallePagoFrigobar>();
		this.listaDetallePagoServicio = new LinkedList<DetallePagoServicio>();
	}
	
	public DetallePagoFactura(Integer idDetallePagoFactura, MetodoPagoEnum metodoDePago, Float monto,
			NombreDivisaEnum nombreDivisa, Tarjeta tarjeta, Cheque cheque) {
		super();
		this.idDetallePagoFactura = idDetallePagoFactura;
		this.metodoDePago = metodoDePago;
		this.monto = monto;
		this.nombreDivisa = nombreDivisa;
		this.tarjeta = tarjeta;
		this.cheque = cheque;
	}


	public List<DetallePagoServicio> getListaDetallePagoServicio() {
		return listaDetallePagoServicio;
	}


	public void setListaDetallePagoServicio(List<DetallePagoServicio> listaDetallePagoServicio) {
		this.listaDetallePagoServicio = listaDetallePagoServicio;
	}


	public MetodoPagoEnum getMetodoDePago() {
		return metodoDePago;
	}


	public void setMetodoDePago(MetodoPagoEnum metodoDePago) {
		this.metodoDePago = metodoDePago;
	}


	public NombreDivisaEnum getNombreDivisa() {
		return nombreDivisa;
	}


	public void setNombreDivisa(NombreDivisaEnum nombreDivisa) {
		this.nombreDivisa = nombreDivisa;
	}


	public Integer getIdDetallePagoFactura() {
		return idDetallePagoFactura;
	}
	public void setIdDetallePagoFactura(Integer idDetallePagoFactura) {
		this.idDetallePagoFactura = idDetallePagoFactura;
	}
	
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	
	public List<DetallePagoFrigobar> getListaDetallePagoFrigobar() {
		return listaDetallePagoFrigobar;
	}
	public void setListaDetallePagoFrigobar(List<DetallePagoFrigobar> listaDetallePagoFrigobar) {
		this.listaDetallePagoFrigobar = listaDetallePagoFrigobar;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public Cheque getCheque() {
		return cheque;
	}
	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}
	
	
	
}
