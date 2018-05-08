<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import= "modelo.*"%>
<% 
	UsuarioModelo usuarioModelo = new UsuarioModelo();
	
	String dni = request.getParameter("Dni");
	String contrasena = request.getParameter("Contrasena");
	Usuario usuario = usuarioModelo.selectPorDni(dni);
	if(usuario != null);
	if(dni.equals("Dni") && contrasena.equals("Contrasena")){
		
		session.setAttribute("iniciado", "si");
		response.sendRedirect("sistema.jsp");
	}else{
		response.sendRedirect("login_form.jsp");
	}
	
	
	

%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>