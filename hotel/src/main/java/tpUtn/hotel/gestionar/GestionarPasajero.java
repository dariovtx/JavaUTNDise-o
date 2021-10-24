package tpUtn.hotel.gestionar;

import java.util.List;

import tpUtn.hotel.entidades.Pasajero;
import tpUtn.hotel.implementacion.PasajeroDAOImpl;

public class GestionarPasajero {
  
public List<Pasajero> buscarPasajero(String tipoDoc,int numeroDoc,
		String apellido,String nombre) {
	PasajeroDAOImpl pasajeroDAOImpl = new PasajeroDAOImpl();
	return pasajeroDAOImpl.buscarPasajero(tipoDoc, numeroDoc, apellido, nombre);
}

public boolean darDeAltaPasajero(Pasajero p) {
	  PasajeroDAOImpl pasajeroDAOImpl = new PasajeroDAOImpl();
	  
	return pasajeroDAOImpl.crearPasajero(p);
}


  
  
}
