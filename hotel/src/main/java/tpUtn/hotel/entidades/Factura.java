package tpUtn.hotel.entidades;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Factura {
	private String numeroFactura;
	private String mailEmpresa;
	private Direccion direccionEmpresa;
	private Integer telefonoEmpresa;
	private String condFiscEmpresa;
	private Date fechaEmision;
	private char tipoFactura;
	private Float valorEstadia;
	private Float iva;
	private Float totalFinal;
	
  
	private List<DetallePagoFactura> listaDetallePagoFactura;
	private List<CantidadConsumo> listaCantidadConsumo;
	private List<CantidadUsos> listaCantidadUsos ;
	private ResponsableDePago ResponsableDePago;
	private NotaDeCredito notaDeCredito;
	private Ocupacion ocupacion;
	private Conserje conserje;
	
	public Factura() {
		this.listaDetallePagoFactura = new LinkedList<DetallePagoFactura>();
		this.listaCantidadConsumo = new LinkedList<CantidadConsumo>();
		this.listaCantidadUsos = new LinkedList<CantidadUsos>();
	}
	
	public Factura(String numeroFactura, String mailEmpresa, Direccion direccionEmpresa, Integer telefonoEmpresa,
			String condFiscEmpresa, Date fechaEmision, char tipoFactura, Float valorEstadia, Float iva,
			Float totalFinal, tpUtn.hotel.entidades.ResponsableDePago responsableDePago, NotaDeCredito notaDeCredito,
			Ocupacion ocupacion,Conserje conserje) {
		super();
		this.numeroFactura = numeroFactura;
		this.mailEmpresa = mailEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.condFiscEmpresa = condFiscEmpresa;
		this.fechaEmision = fechaEmision;
		this.tipoFactura = tipoFactura;
		this.valorEstadia = valorEstadia;
		this.iva = iva;
		this.totalFinal = totalFinal;
		ResponsableDePago = responsableDePago;
		this.notaDeCredito = notaDeCredito;
		this.ocupacion = ocupacion;
		this.conserje = conserje;
	}
	
	
	public Conserje getConserje() {
		return conserje;
	}

	public void setConserje(Conserje conserje) {
		this.conserje = conserje;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getMailEmpresa() {
		return mailEmpresa;
	}
	public void setMailEmpresa(String mailEmpresa) {
		this.mailEmpresa = mailEmpresa;
	}
	public Direccion getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(Direccion direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	public Integer getTelefonoEmpresa() {
		return telefonoEmpresa;
	}
	public void setTelefonoEmpresa(Integer telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}
	public String getCondFiscEmpresa() {
		return condFiscEmpresa;
	}
	public void setCondFiscEmpresa(String condFiscEmpresa) {
		this.condFiscEmpresa = condFiscEmpresa;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public char getTipoFactura() {
		return tipoFactura;
	}
	public void setTipoFactura(char tipoFactura) {
		this.tipoFactura = tipoFactura;
	}
	public Float getValorEstadia() {
		return valorEstadia;
	}
	public void setValorEstadia(Float valorEstadia) {
		this.valorEstadia = valorEstadia;
	}
	public Float getIva() {
		return iva;
	}
	public void setIva(Float iva) {
		this.iva = iva;
	}
	public Float getTotalFinal() {
		return totalFinal;
	}
	public void setTotalFinal(Float totalFinal) {
		this.totalFinal = totalFinal;
	}
	public List<DetallePagoFactura> getListaDetallePagoFactura() {
		return listaDetallePagoFactura;
	}
	public void setListaDetallePagoFactura(List<DetallePagoFactura> listaDetallePagoFactura) {
		this.listaDetallePagoFactura = listaDetallePagoFactura;
	}
	public List<CantidadConsumo> getListaCantidadConsumo() {
		return listaCantidadConsumo;
	}
	public void setListaCantidadConsumo(List<CantidadConsumo> listaCantidadConsumo) {
		this.listaCantidadConsumo = listaCantidadConsumo;
	}
	public List<CantidadUsos> getListaCantidadUsos() {
		return listaCantidadUsos;
	}
	public void setListaCantidadUsos(List<CantidadUsos> listaCantidadUsos) {
		this.listaCantidadUsos = listaCantidadUsos;
	}
	public ResponsableDePago getResponsableDePago() {
		return ResponsableDePago;
	}
	public void setResponsableDePago(ResponsableDePago responsableDePago) {
		ResponsableDePago = responsableDePago;
	}
	public NotaDeCredito getNotaDeCredito() {
		return notaDeCredito;
	}
	public void setNotaDeCredito(NotaDeCredito notaDeCredito) {
		this.notaDeCredito = notaDeCredito;
	}
	public Ocupacion getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	
	
	
	
	  
}
