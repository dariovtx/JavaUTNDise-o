package tpUtn.hotel;



import java.text.ParseException;
import java.util.Date;

import tpUtn.hotel.entidades.Direccion;
import tpUtn.hotel.entidades.Localidad;
import tpUtn.hotel.entidades.Pais;
import tpUtn.hotel.entidades.Pasajero;
import tpUtn.hotel.entidades.Provincia;
import tpUtn.hotel.gestionar.GestionarPasajero;
import tpUtn.hotel.implementacion.PasajeroDAOImpl;
import tpUtn.hotel.interfaces.Fechas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	/*
    	 * insert into pais (idPais, nombre, nacionalidad) value (0,"Argentina","Argentino");
insert into provincia (idProvincia, nombre, pais) value (0,"santa fe",0);
insert into localidad (idLocalidad, nombre, codigoPostal, provincia) value (0,"santa fe",3000,0);
insert into direccion (idDireccion, calle, numero, departamento, piso, localidad ) value (0,"domingo silva",3333,2,2,0);

    	 */
    	
    	GestionarPasajero gestionarPasajero = new GestionarPasajero();
    	/*Pais pais = new Pais(0, "Argentina", "Argentino");
    	Provincia provincia = new Provincia(0,"santa fe",pais);
    	Localidad l = new Localidad(0,"santa fe",3000,provincia);
    	Direccion direccion = new Direccion(3, "san martin", 2222, "A", 3,l );
    	
    	Pasajero pasajero = new Pasajero();
    	
		pasajero.setApellido("Perez");
		pasajero.setNombre("Carlos");
		pasajero.setId(3);
		pasajero.setTipoDocumento("DNI");
		pasajero.setDocumento(35468);
		pasajero.setFechaNacimiento(Fechas.getStringAFechaSQL("10-01-2000") );
		pasajero.setCuit("20-35468-0");
		pasajero.setDireccion(direccion);
		pasajero.setPais(pais);
		pasajero.setTelefono( 44556);
		pasajero.setMail("CarPer@gmail.com");
		pasajero.setOcupacion("Ingeniero");
		pasajero.setPosIVA( "no se");
    	gestionarPasajero.darDeAltaPasajero(pasajero);
    	*/
    	for(Pasajero pas : gestionarPasajero.buscarPasajero("",0 , "","Carlos" ) ) {
		System.out.println(pas);
		}
    	
    }
}
