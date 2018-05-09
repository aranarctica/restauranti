<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.*" %>
   <%  
    int idPremios = Integer.parseInt(request.getParameter("idPremios"));
    PremiosModelo premiosModelo = new PremiosModelo();
    Premios premio = premiosModelo.select(idPremios);
   
    %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<tr><td>Nombre</td><td><%= premio.getNombre()%></td></tr>
			<tr><td>Descripcion</td><td><%= premio.getDescripcion()%></td></tr>
		 	<tr><td>Premio Metalico</td><td><%= premio.getPremioMetalico()%></td></tr>
		</table>

<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="editarPre.jsp">Editar Premio</button>


</body>
</html>