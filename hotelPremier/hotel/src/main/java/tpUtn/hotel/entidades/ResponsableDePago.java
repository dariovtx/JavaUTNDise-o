package tpUtn.hotel.entidades;

public class ResponsableDePago {
	
	private Pasajero pasajero;
	private PersonaJuridica personaJuridica;

	public ResponsableDePago() {
		super();
	}

	public ResponsableDePago(Pasajero pasajero, PersonaJuridica personaJuridica) {
		super();
		this.pasajero = pasajero;
		this.personaJuridica = personaJuridica;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public PersonaJuridica getPersonaJuridica() {
		return personaJuridica;
	}

	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
	}

	
	
}
