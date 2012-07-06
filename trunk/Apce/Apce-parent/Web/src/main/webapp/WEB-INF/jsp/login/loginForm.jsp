<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>APCE - Login</title>
</head>
<body>
<h2>${exception.customMsg}</h2>
 
	<h3>Login Form</h3>
	<FONT color="blue">
		<h6>User Name="UserName" and password="password"</h6>
	</FONT>
	
	<form:form commandName="loginForm" method="POST">
		<table>
			<tr>
				<td>Usuario:<FONT color="red"><form:errors path="usuario" /></FONT></td>
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
	
	<FONT color="blue">
		<h6>Si queres registrar un usuarioUser Name="UserName" and password="password"</h6>
	</FONT>
	
	<FONT color="blue">
		<h6>Registrarse en el sistema</h6>
	</FONT>
	<button onclick="registrarse();"">REGISTRARSE</button>
	<!--
	<form method="post">
		<table>
			<tr>
				<td>Username:</td>
				<spring:bind path="loginForm.usuario">
					<td><input type="text" name="usuario" /></td>
				</spring:bind>
			</tr> 
			<tr>
				<td>Password:</td>
				<spring:bind path="loginForm.pass">
					<td><input type="password" name="pass" /></td>
				</spring:bind>
			</tr>
			<tr>
				<td colspan=2><input type="submit" /></td>
			</tr>
		</table>
	</form>
		-->


</body>

<script type="text/javascript">

function registrarse()
{
	var paginaRegistracion =  "<%=request.getContextPath()%>/registracion.htm";    
	//alert(paginaRegistracion);
	document.location.href = paginaRegistracion;  
}


 
</script>
</html>