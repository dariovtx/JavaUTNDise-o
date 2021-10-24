package tpUtn.hotel.entidades;

import java.util.Date;

public class Cheque {
	private Integer nroCheque;
	private Integer plaza;
	private Date fechaDeCobro;
	
	private Banco banco;

	public Cheque() {
		super();
	}

	public Cheque(Integer nroCheque, Integer plaza, Date fechaDeCobro, Banco banco) {
		super();
		this.nroCheque = nroCheque;
		this.plaza = plaza;
		this.fechaDeCobro = fechaDeCobro;
		this.banco = banco;
	}

	public Integer getNroCheque() {
		return nroCheque;
	}

	public void setNroCheque(Integer nroCheque) {
		this.nroCheque = nroCheque;
	}

	public Integer getPlaza() {
		return plaza;
	}

	public void setPlaza(Integer plaza) {
		this.plaza = plaza;
	}

	public Date getFechaDeCobro() {
		return fechaDeCobro;
	}

	public void setFechaDeCobro(Date fechaDeCobro) {
		this.fechaDeCobro = fechaDeCobro;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
	
}
