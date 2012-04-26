<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head> 
<body>
<script type="text/javascript" src="/Web/Js/menu.js"></script>
<input type="button" value="Altas Materias Primas me" onclick="altaMateriaPrima('<%=request.getContextPath()%>');" />
<input type="button" value="Activar nuevos usuarios" onclick="activarNuevosUsuarios('<%=request.getContextPath()%>');" />
</body>
</html>
  