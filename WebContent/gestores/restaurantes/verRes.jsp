<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%
	int idJatetxeak = Integer.parseInt(request.getParameter("idJatetxeak"));
	JatetxeakModelo jatetxeakModelo = new JatetxeakModelo();
	Jatetxeak jatetxe = jatetxeakModelo.select(idJatetxeak);
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ver Restaurante</title>
</head>
<body>

	<table>

		<tr>
			<td>Nombre</td>
			<td><%=jatetxe.getNombre()%></td>
		</tr>
		<tr>
			<td>Direccion</td>
			<td><%=jatetxe.getDireccion()%></td>
		</tr>
		<tr>
			<td>Poblacion</td>
			<td><%=jatetxe.getPoblacion()%></td>
		</tr>

	</table>

	<button type="button" class="navbar-toggle" data-toggle="collapse"
		data-target="edtiarRes.jsp">Editar Restaurante</button>



</body>
</html>