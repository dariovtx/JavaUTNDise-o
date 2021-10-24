<%@page import="java.util.LinkedList"%>
<%@page import="tpUtn.hotel.entidades.Pasajero"%>
<%@page import="java.util.List"%>
<%@page import="tpUtn.hotel.gestionar.GestionarPasajero"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%

%>
<body>
   <div>
     <form action="pasajeroABM" method="POST">
     <label for="tipoDocumento">Tipo de Documento</label>
     <select name="tipoDoc" required >
		<option value="DNI"  >DNI</option>
		<option value="PAS"  >PAS</option>
		<option value="LE"  >LE</option>
		<option value="CI"  >CI</option>
	</select>
	<label for="numeroDocumento">Numero de documento</label>
	<input type="text" name="numeroDoc" required>
	<label for="Apellido">Apellido</label>
	<input type="text" name="apellido" required>
	<label for="Nombre">Nombre</label>
	<input type="text" name="nombre" required>
	<input type="submit" value="Buscar"> 
     </form>
     </div>
     <section>
     <table>
	   <tr>
	   <th>Tipo de Documento</th>
	   <th>Numero de Documento</th>
	   <th>Apellido</th>
	   <th>Nombre</th>
	   <th>Accion</th>
	   </tr>
	   <%
	   String tipoDoc = "nada";
	   	int numeroDoc = -1;
	   	String apellido = "";
	   	String nombre = "";
	   
	   if(request.getParameter("tipoDoc")!=null){
		    tipoDoc = request.getParameter("tipoDoc");
		    numeroDoc = Integer.valueOf(request.getParameter("numeroDoc"));
		    apellido = request.getParameter("apellidon");
		    nombre = request.getParameter("nombren");
		   }
		   	System.out.println(request.getParameter("tipoDocSesion"));
		   	
	   GestionarPasajero gestionarPasajero= new GestionarPasajero();

        
	   for(Pasajero pasajero : gestionarPasajero.buscarPasajero(tipoDoc, numeroDoc, apellido, nombre)){
			   
	   %>
	   <tr>
	   <td><%=pasajero.getTipoDocumento() %></td>
	   <td><%=pasajero.getDocumento() %></td>
	   <td><%=pasajero.getApellido() %></td>
	   <td><%=pasajero.getNombre()%></td>
	   <td>
	   			
	   </td>
	   
	   </tr>
	   <%} %>
	</table>
     
     </section>
</body>
</html>