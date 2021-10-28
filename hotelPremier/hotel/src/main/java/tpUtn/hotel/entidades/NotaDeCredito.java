package tpUtn.hotel.entidades;

public class NotaDeCredito {
	private Integer idNotaDeCredito;
	private Integer numero;
	private Float monto;
	
	private ResponsableDePago responsableDePago;

	public NotaDeCredito() {
		super();
	}

	public NotaDeCredito(Integer idNotaDeCredito, Integer numero, Float monto, ResponsableDePago responsableDePago) {
		super();
		this.idNotaDeCredito = idNotaDeCredito;
		this.numero = numero;
		this.monto = monto;
		this.responsableDePago = responsableDePago;
	}

	public Integer getIdNotaDeCredito() {
		return idNotaDeCredito;
	}

	public void setIdNotaDeCredito(Integer idNotaDeCredito) {
		this.idNotaDeCredito = idNotaDeCredito;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
	}

	public ResponsableDePago getResponsableDePago() {
		return responsableDePago;
	}

	public void setResponsableDePago(ResponsableDePago responsableDePago) {
		this.responsableDePago = responsableDePago;
	}
	
	
}
