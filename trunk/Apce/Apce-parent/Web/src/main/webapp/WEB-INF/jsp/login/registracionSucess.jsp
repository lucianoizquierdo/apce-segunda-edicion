<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registracion</title>
</head>
<body>
<h4>Registracion</h4>

<form:form commandName="registracionForm" method="POST">
		<table>
			<tr>
				<td>Nombre:<FONT color="red"><form:errors path="nombre" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>Apellido:<FONT color="red"><form:errors path="apellido" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>Sucursal:<FONT color="red"><form:errors path="idSucursal" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>DNI:<FONT color="red"><form:errors path="dni" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>Fecha de Nacimiento:<FONT color="red"><form:errors path="fechaNacimiento" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>Telefono:<FONT color="red"><form:errors path="telefono" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>Direccion:<FONT color="red"><form:errors path="direccion" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			<tr>
				<td>Alias Usuario:<FONT color="red"><form:errors path="aliasUsuari" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="usuario" /></td>
			</tr>
			
			<tr>
				<td>Password:<FONT color="red"><form:errors path="pass" /></FONT></td>
			</tr>
			<tr>  
				<td><form:password path="pass" /></td>
			</tr>
			<tr>
				<td><form:errors id="passincorrecto"  ></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>