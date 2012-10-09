<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head> 
<body>
<script type="text/javascript" src="/Web/Js/menu.js"></script>
<input type="button" value="Altas Materias Primas" onclick="altaMateriaPrima('<%=request.getContextPath()%>');" />
<sec:authorize access="hasRole('ROLE_ADMINISTRADOR')">
<input type="button" value="Activar nuevos usuarios" onclick="activarNuevosUsuarios('<%=request.getContextPath()%>');" />
<input type="button" value="Administrar Usuarios" onclick="administrarUsuarios('<%=request.getContextPath()%>');" />
<input type="button" value="Administrar Sucursales" onclick="administrarSucursales('<%=request.getContextPath()%>');" />
</sec:authorize>
</body>
</html>
    