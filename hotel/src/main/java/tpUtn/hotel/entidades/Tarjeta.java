package tpUtn.hotel.entidades;

public class Tarjeta {

	private String tipo;
	private String nombre;
	private String numero;
	
	private Banco banco;

	public Tarjeta() {
		super();
	}

	public Tarjeta(String tipo, String nombre, String numero, Banco banco) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.numero = numero;
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
}
