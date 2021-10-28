package tpUtn.hotelPremier.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tpUtn.hotel.entidades.Direccion;
import tpUtn.hotel.entidades.Localidad;
import tpUtn.hotel.entidades.Pasajero;
import tpUtn.hotel.gestionar.GestionarPasajero;
import tpUtn.hotel.implementacion.PasajeroDAOImpl;
import tpUtn.hotel.interfaces.Fechas;


/**
 * Servlet implementation class GestionarPasajero
 */
@WebServlet("/pasajeroABM")
public class PasajeroControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 GestionarPasajero gestionarPasajero;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasajeroControlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	super.init();
    	gestionarPasajero = new GestionarPasajero();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipoDoc = request.getParameter("tipoDoc");
		int numeroDoc = Integer.valueOf(request.getParameter("numeroDoc"));
		String apellido = request.getParameter("apellido");
		String nombre = request.getParameter("nombre");
		String paginaRedireccion= "gestionarPasajero.jsp";
		HttpSession sesion = null;
		sesion = request.getSession();
		sesion.setAttribute("tipoDoc", tipoDoc);
		sesion.setAttribute("numeroDoc", numeroDoc);
		sesion.setAttribute("apellido", apellido);
		sesion.setAttribute("nombre", nombre);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(paginaRedireccion);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paginaRedireccion= "index.jsp";
		if(request.getParameter("idPasajero")==null && request.getParameter("tipoDoc")==null) {
			 paginaRedireccion= "altaPasajero.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(paginaRedireccion);

			requestDispatcher.forward(request, response);	
		}else if(request.getParameter("tipoDoc")==null){
			paginaRedireccion= "editarPasajero.jsp";
			
		}else {
			System.out.println("llego");
			try {
			
			String tipoDoc = request.getParameter("tipoDoc");
			int numeroDoc = Integer.valueOf(request.getParameter("numeroDoc"));
			String apellido = request.getParameter("apellido");
			String nombre = request.getParameter("nombre");
			String posIva = request.getParameter("posIva");
			String cuit = request.getParameter("cuit");
			String ocupacion = request.getParameter("ocupacion");
			Date fechaNacimiento;
			
				fechaNacimiento = Fechas.getStringAFechaSQL( request.getParameter("fechaNacimiento") );
			
			//date irica aca
			
			int idPais = Integer.valueOf(request.getParameter("idPais"));
			int idNacionalidad = Integer.valueOf(request.getParameter("idNacionalidad"));
			int idProvincia = Integer.valueOf(request.getParameter("idProvincia"));
			int idLocalidad = Integer.valueOf(request.getParameter("idLocalidad"));
			String calle = request.getParameter("calle");
			int numero = Integer.valueOf(request.getParameter("numero"));
			String departamento = request.getParameter("departamento");
			int piso =  Integer.valueOf(request.getParameter("piso"));
			int codPostal = Integer.valueOf(request.getParameter("codPostal"));
			int telefono = Integer.valueOf(request.getParameter("telefono"));
			String mail = request.getParameter("mail");
			
			Localidad localidad = new Localidad();
			localidad = gestionarPasajero.buscarLocalidad(idLocalidad);
			int idDireccion = gestionarPasajero.devolverIdDireccion() + 1;
			Direccion direccion = new Direccion(idDireccion, calle, numero, departamento, piso, localidad);
			Pasajero pasajero = new Pasajero(null, apellido, nombre, tipoDoc, numeroDoc, departamento, posIva, fechaNacimiento, telefono, mail, ocupacion, direccion, localidad.getProvincia().getPais());
		   if( (gestionarPasajero.darDeAltaPasajero(pasajero)) == true) {
			   paginaRedireccion= "pasajeroCreado.jsp";
		   }
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(paginaRedireccion);

		requestDispatcher.forward(request, response);
		
	}

}
