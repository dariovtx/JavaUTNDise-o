package tpUtn.hotel.entidades;
import java.util.LinkedList;
import java.util.List;

public class Habitacion {
	
	private Integer idHabitacion;
	
	private String observacionEstado;
	private String numero;
	private String piso;
	private Integer capacidad;


	private List<Reserva> listaReserva;
	private List<Ocupacion> listaOcupacion;
	private List<Mantenimiento> listaMantenimiento;
	private TipoHabitacion tipo;
	
	public Habitacion() {
		this.listaReserva = new LinkedList<Reserva>();
		this.listaOcupacion = new LinkedList<Ocupacion>();
		this.listaMantenimiento = new LinkedList<Mantenimiento>();
	}

	public Habitacion(Integer idHabitacion, String observacionEstado, String numero, String piso, Integer capacidad,
			TipoHabitacion tipo) {
		super();
		this.idHabitacion = idHabitacion;
		this.observacionEstado = observacionEstado;
		this.numero = numero;
		this.piso = piso;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}


	public Integer getIdHabitacion() {
		return idHabitacion;
	}


	public void setIdHabitacion(Integer idHabitacion) {
		this.idHabitacion = idHabitacion;
	}


	public String getObservacionEstado() {
		return observacionEstado;
	}


	public void setObservacionEstado(String observacionEstado) {
		this.observacionEstado = observacionEstado;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getPiso() {
		return piso;
	}


	public void setPiso(String piso) {
		this.piso = piso;
	}


	public Integer getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}


	public List<Reserva> getListaReserva() {
		return listaReserva;
	}


	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}


	public List<Ocupacion> getListaOcupacion() {
		return listaOcupacion;
	}


	public void setListaOcupacion(List<Ocupacion> listaOcupacion) {
		this.listaOcupacion = listaOcupacion;
	}


	public List<Mantenimiento> getListaMantenimiento() {
		return listaMantenimiento;
	}


	public void setListaMantenimiento(List<Mantenimiento> listaMantenimiento) {
		this.listaMantenimiento = listaMantenimiento;
	}
	
	
}



	