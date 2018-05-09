<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
			<tr><td>Titulo:</td><td><%=libro.getTitulo()%></td></tr>
			<tr><td>Autor:</td><td><%=libro.getAutor()%></td></tr>
		</table>
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="editarCoc.jsp">Editar Cocineros</button>


</body>
</html>