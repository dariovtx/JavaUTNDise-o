<%@page import="tpUtn.hotel.entidades.Pais"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="pasajeroABM" method="Post">
<div>
<h2>Datos Personales</h2>
<label for="tipoDocumento">Tipo de Documento</label>
     <select name="tipoDoc" required >
		<option value="DNI"  >DNI</option>
		<option value="PAS"  >PAS</option>
		<option value="LE"  >LE</option>
		<option value="CI"  >otro</option>
	</select>
	<label for="numeroDocumento">Numero de documento</label>
	<input type="text" name="numeroDoc" required>
	<label for="Apellido">Apellido</label>
	<input type="text" name="apellido" required>
	<label for="Nombre">Nombre</label>
	<input type="text" name="nombre" required>
	<label for="posIva">Posicion frente al iva</label>
     <select name="posIva" required >
		<option value="consumidor final" >Consumidor Final</option>
		<option value="no inscripto" >Responsable no Inscripto</option>
		<option value="inscripto" >Responsable Inscripto</option>
		<option value="no responsable" >no Responsable</option>
		<option value="sujeto Exento" >Sujeto Exento</option>
	</select>
	<label for="Cuit">Cuit</label>
	<input type="text" name="cuit" required>
	<label for="Ocupacion">Ocupacion</label>
	<input type="text" name="ocupacion" required>
	<label for="FechaNacimiento">Fecha de Nacimiento</label>
	<input type="date" name="fechaNacimiento" required>
	
	
</div>
	<div>
	<label for="pais">Pais</label>
     <select name="idPais" required id="pais">
		<option value=" " ></option>
		<option value="0" >Argentina</option>
		<option value="1" >Brasil</option>
		<option value="2" >Uruguay</option>
		<option value="3" >Paraguay</option>
		<option value="4" >Bolivia</option>
		<option value="5" >Chile</option>
	</select>
	<label for="nacionalidad">Nacionalidad</label>
     <select name="idNacionalidad" required id="nacionalidad" >
		<option value=" "  ></option>
		<option value="0"  >Argentino</option>
		<option value="1"  >Brasile�o</option>
		<option value="2"  >Paraguayo</option>
		<option value="3"  >Boliviano</option>
		<option value="4"  >Paraguayo</option>
		<option value="5"    >Chileno</option>
	</select>
	<label for="provincia">Provincia</label>
     <select name="idProvincia" required disabled id="provincia">
		<option value=" " ></option>
	</select>
	<label for="localidad">Localidad</label>
     <select name="idLocalidad" required disabled id="localidad">
		<option value=" " ></option>
	</select>
	
	<h2>Datos de Direccion</h2>
	
	<label for="calle">calle</label>
	<input type="text" name="calle" required>
	<label for="numero">numero</label>
	<input type="text" name="numero" required>
	<label for="departamento">Departamento</label>
	<input type="text" name="departamento" required>
	<label for="piso">Piso</label>
	<input type="text" name="piso" required>	
	<label for="codPostal">Codigo Postal</label>
	<input type="text" name="codPostal" required>
	</div>
	
	<div>
	
	<h2>Datos de Contacto</h2>
	
	<label for="telefono">Telefono</label>
	<input type="text" name="telefono" required>
	
	<label for="mail">E-mail</label>
	<input type="text" name="mail" required>
	</div>
	
	<input class="warning" type="button" onclick="location.href='index.jsp'" value="Cancelar" />
	<input class="success" type="submit" value="Siguiente"> 
</form>
<script src="jquery-3.6.0.min.js" type="text/javascript"></script> 
<script src="script.js" type="text/javascript"></script>   
        
</body>
</html>