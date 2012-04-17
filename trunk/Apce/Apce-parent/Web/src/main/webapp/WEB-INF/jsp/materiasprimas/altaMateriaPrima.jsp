<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Altas de Materias Primas</title>
</head>
<body>
<form:form commandName="materiaPrimaForm" method="POST">
		<table>
			<tr>
				<td>Codigo de Materia Prima:<FONT color="red"><form:errors path="codigoMateriaPrima" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="codigoMateriaPrima" /></td>
			</tr>
			<tr>
				<td>Tipo:<FONT color="red"><form:errors path="tipo" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="tipo" /></td>
			</tr>
			<tr>
				<td>Tamaño:<FONT color="red"><form:errors path="tamanio" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="tamanio" /></td>
			</tr>
			<tr>
				<td>Color:<FONT color="red"><form:errors path="color" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="color" /></td>
			</tr>
			<tr>
				<td>Descripcion:<FONT color="red"><form:errors path="descripcion" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="descripcion" /></td>
			</tr>
			<tr>
				<td>Kilos:<FONT color="red"><form:errors path="kilos" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="kilos" /></td>
			</tr>
			<tr>
				<td>Litros:<FONT color="litros"><form:errors path="litros" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="litros" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>