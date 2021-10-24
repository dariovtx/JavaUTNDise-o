package tpUtn.hotelPremier.servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tpUtn.hotel.entidades.Pasajero;
import tpUtn.hotel.gestionar.GestionarPasajero;


/**
 * Servlet implementation class GestionarPasajero
 */
@WebServlet("/pasajeroABM")
public class PasajeroControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestionarPasajero gestionarPasajero;
       
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tipoDoc = request.getParameter("tipoDoc");
		int numeroDoc = Integer.valueOf(request.getParameter("numeroDoc"));
		String apellido = request.getParameter("apellido");
		String nombre = request.getParameter("nombre");
		HttpSession sesion = null;
		sesion = request.getSession();
		sesion.setAttribute("tipoDocSesion", tipoDoc);
		sesion.setAttribute("numeroDocSesion", numeroDoc);
		sesion.setAttribute("apellidoSesion", apellido);
		sesion.setAttribute("tipoDocSesion", tipoDoc);
	}

}
