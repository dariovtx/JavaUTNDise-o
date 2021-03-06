package tpUtn.hotel.implementacion;

import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import tpUtn.hotel.entidades.Direccion;
import tpUtn.hotel.entidades.Localidad;
import tpUtn.hotel.entidades.Pais;
import tpUtn.hotel.entidades.Pasajero;
import tpUtn.hotel.entidades.Provincia;
import tpUtn.hotel.interfaces.Fechas;
import tpUtn.hotel.interfaces.PasajeroDAO;

public class PasajeroDAOImpl implements PasajeroDAO<Pasajero, Direccion, Pais, Localidad,Provincia>, ConexionDB {
	private PreparedStatement psBuscar;
	private PreparedStatement psBuscar2;
	private PreparedStatement psBuscar3;
	private PreparedStatement psBuscar4;
	private PreparedStatement psBuscar5;
	private PreparedStatement psInsertar;
	private PreparedStatement psInsertar2;
	
	@Override
	public List<Pasajero> buscarPasajero(String tipoDoc, int numeroDoc, String apellido, String nombre) {

		List<Pasajero> pasajeros = new ArrayList<Pasajero>();
		String query = "select * from pasajero "
				+ "where tipoDoc = ? or numeroDoc = ? or apellido = ? or nombre = ?";
		try {
			if(null == psBuscar) {
				psBuscar = getConexion().prepareStatement(query);
			}
			
			psBuscar.setString(1, tipoDoc);
			psBuscar.setInt(2, numeroDoc);
			psBuscar.setString(3, apellido);
			psBuscar.setString(4, nombre);
			ResultSet resultado = psBuscar.executeQuery(); 
			while(resultado.next()) {
				Pasajero pasajero = new Pasajero();
				pasajero.setApellido(resultado.getString("apellido"));
				pasajero.setNombre(resultado.getString("nombre"));
				pasajero.setId(resultado.getInt("idPasajero"));
				pasajero.setTipoDocumento(resultado.getString("tipoDoc"));
				pasajero.setDocumento(resultado.getInt("numeroDoc"));
				pasajero.setFechaNacimiento(Fechas.getStringAFechaSQL(resultado.getString("fecNacimiento")));
				pasajero.setCuit(resultado.getString("cuit"));
				pasajero.setDireccion(buscarDireccion(resultado.getInt("direccion")));
				pasajero.setPais(buscarPais(resultado.getInt("nacionalidad")));
				pasajero.setMail(resultado.getString("mail"));
				pasajero.setOcupacion(resultado.getString("ocupacion"));
				pasajero.setPosIVA(resultado.getString("posIVA"));
				pasajero.setTelefono(resultado.getInt("telefono"));
				
				
				pasajeros.add(pasajero);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pasajeros;
	}
	
	
	@Override
	public boolean crearPasajero(Pasajero pasajero) {
		
		//sentencia SQL 
	String query = "insert into pasajero ( apellido, nombre,"
			+" tipoDoc, numeroDoc, cuit, posIVA, fecNacimiento, telefono, mail, ocupacion, nacionalidad, direccion)"
						+"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	try {
	 if(null == psInsertar) {
	//nos conectamos a la base de datos 
		psInsertar = getConexion().prepareStatement(query);
	}
	//cargamos la informaci??n que le enviaremos a la base de datos
	// psInsertar.setInt(, pasajero.getId());
	 psInsertar.setString(1, pasajero.getApellido());
	 psInsertar.setString(2, pasajero.getNombre());
	 psInsertar.setString(3, pasajero.getTipoDocumento());
	 psInsertar.setInt(4, pasajero.getDocumento());
	 psInsertar.setString(5, pasajero.getCuit());
	 psInsertar.setString(6, pasajero.getPosIVA());
	 psInsertar.setDate(7,Date.valueOf( Fechas.getFechaSQLAString( pasajero.getFechaNacimiento() ) ));
	 psInsertar.setInt(8, pasajero.getTelefono());
	 psInsertar.setString(9,pasajero.getMail());
	 psInsertar.setString(10, pasajero.getOcupacion());
	 
	 psInsertar.setInt(11, pasajero.getPais().getIdPais());
	 if(crearDireccion(pasajero.getDireccion())) {

		 psInsertar.setInt(12, pasajero.getDireccion().getIdDireccion());
		 return psInsertar.executeUpdate() == 1;
	 }
					
	} catch (SQLException e) {
					e.printStackTrace();
		}
			return false;
	}

	@Override
	public Direccion buscarDireccion(int idDireccion) {
		String query = "select * from direccion where idDireccion = ? ";
		try {
			if(null == psBuscar2) {
				psBuscar2 = getConexion().prepareStatement(query);
			}
			psBuscar2.setInt(1, idDireccion);
			
			ResultSet resultado = psBuscar2.executeQuery(); 
			if(resultado.next()){
				Direccion direccion = new Direccion();
				direccion.setIdDireccion(resultado.getInt("idDireccion"));
				direccion.setCalle(resultado.getString("calle"));
				direccion.setNumero(resultado.getInt("numero"));
				direccion.setDepartamento(resultado.getString("departamento"));
				direccion.setPiso(resultado.getInt("piso"));
				direccion.setLocalidad(buscarLocalidad(resultado.getInt("localidad")));
				
				return direccion;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Localidad buscarLocalidad(int idLocalidad) {
		String query = "select * from localidad where idLocalidad = ? ";
		try {
			if(null == psBuscar3) {
				psBuscar3 = getConexion().prepareStatement(query);
			}
			psBuscar3.setInt(1, idLocalidad);
			
			ResultSet resultado = psBuscar3.executeQuery(); 
			if(resultado.next()){
				Localidad localidad = new Localidad();
				localidad.setIdLocalidad(resultado.getInt("idLocalidad"));
				localidad.setNombre(resultado.getString("nombre"));
				localidad.setCodigoPostal(resultado.getInt("codigoPostal"));
				localidad.setProvincia(buscarProvincia(resultado.getInt("provincia")));
								
				return localidad;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Provincia buscarProvincia(int idProvincia) {
		String query = "select * from provincia where idProvincia = ? ";
		try {
			if(null == psBuscar4) {
				psBuscar4 = getConexion().prepareStatement(query);
			}
			psBuscar4.setInt(1, idProvincia);
			
			ResultSet resultado = psBuscar4.executeQuery(); 
			if(resultado.next()){
				Provincia provinciad = new Provincia();
				provinciad.setIdProvincia(resultado.getInt("idProvincia"));
				provinciad.setNombre(resultado.getString("nombre"));
				provinciad.setPais(buscarPais(resultado.getInt("pais")));			
				return provinciad;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Pais buscarPais(int idPais) {
		String query = "select * from pais where idPais = ? ";
		try {
			if(null == psBuscar5) {
				psBuscar5 = getConexion().prepareStatement(query);
			}
			psBuscar5.setInt(1, idPais);
			
			ResultSet resultado = psBuscar5.executeQuery(); 
			if(resultado.next()){
				Pais pais = new Pais();
				pais.setIdPais(resultado.getInt("idPais"));
				pais.setNombre(resultado.getString("nombre"));
				pais.setNacionalidad(resultado.getString("nacionalidad"));			
				return pais;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean crearDireccion(Direccion d) {
		String query ="INSERT INTO direccion (idDireccion, calle, numero, departamento, piso, localidad) "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		
		try {
			 if(null == psInsertar2) {
			//nos conectamos a la base de datos 
				psInsertar2 = getConexion().prepareStatement(query);
			}
			//cargamos la informaci??n que le enviaremos a la base de datos
			 psInsertar2.setInt(1, d.getIdDireccion());
			 psInsertar2.setString(2, d.getCalle());
			 psInsertar2.setInt(3, d.getNumero());
			 psInsertar2.setString(4, d.getDepartamento());
			 psInsertar2.setInt(5, d.getPiso());
			 System.out.println(d.getLocalidad().getIdLocalidad());
			 psInsertar2.setInt(6, d.getLocalidad().getIdLocalidad());
			 
			 
			 //ejecutamos y devolvemos true o false si se realizo correctamente
			return psInsertar2.executeUpdate() == 1;
							
			} catch (SQLException e) {
							e.printStackTrace();
				}
		return false;
	}


	@Override
	public int devolverIdDireccion() {

		String query= "select max(idDireccion) as maximo, idDireccion from direccion";
		try {	
		if(null == psBuscar) {
				psBuscar = getConexion().prepareStatement(query);
		}
		
		ResultSet resultado = psBuscar.executeQuery();
		if(resultado.next()){
		return resultado.getInt("maximo");	
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}


	

	

}
