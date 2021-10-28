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
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/form.css">
<link rel="stylesheet" href="css/button.css">
<link rel="stylesheet" href="css/table.css">
<title>Insert title here</title>
</head>
<body>
   <div>
     <form action="pasajeroABM" method="get">
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
	<input class="success" type="submit" value="Buscar"> 
     </form>
     </div>
     <section>
     <form action="pasajeroABM" method="post" >
     <table>
	   <tr>
	   <th>Tipo de Documento</th>
	   <th>Numero de Documento</th>
	   <th>Apellido</th>
	   <th>Nombre</th>
	   <th>Accion</th>
	   </tr>
	   <%
	   boolean bandera = false;
	   
	   if(request.getParameter("tipoDoc")!=null){bandera =true;
		   String tipoDoc = request.getParameter("tipoDoc");
		   int numeroDoc = Integer.valueOf(request.getParameter("numeroDoc"));
		   String apellido = request.getParameter("apellidon");
		   String nombre = request.getParameter("nombren");
		   
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
	   		<input type="radio" value="<%=pasajero.getId() %>" name="idPasajero">
	   </td>
	   
	   </tr>
	   <%}}else {%> <tr>
	   <td></td>
	   <td></td>
	   <td></td>
	   <td></td>
	   <td>
	   		<input type="radio" value="" name="idPasajero">
	   </td>
	   
	   </tr>
	   <%} %>
	</table>  
	
	<input class="warning" type="button" onclick="location.href='index.jsp'" value="Cancelar" />
	<%if(bandera ==true){ %>
	<input class="success" type="submit" value="Siguiente"> 
	<%}else{ %>
	<input class="success" type="button" onclick="location.href='altaPasajero.jsp'" value="Siguiente"> 
	
	<%} %>
     </form>
     </section>
</body>
</html>