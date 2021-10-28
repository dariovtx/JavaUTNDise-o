package tpUtn.hotel.interfaces;

import java.util.List;

public interface PasajeroDAO < P, D, S, L, PV > {

	boolean crearPasajero(P p);
	
	boolean crearDireccion(D d);
	int devolverIdDireccion();
	D buscarDireccion(int d);
	S buscarPais(int id);
	PV buscarProvincia(int id);
	L buscarLocalidad(int id);
	List<P> buscarPasajero(String tipoDoc,int numeroDoc,String apellido,String nombre);
	
	
	//boolean modificarPasajero(P p);
		//boolean borrarPasajero(P p);
		//P buscarPasajero(int id);
	//boolean eliminarDireccion(D d);
	
	
}
