<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<div>
<h2>Datos Personales</h2>
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
</div>


</form>
</body>
</html>