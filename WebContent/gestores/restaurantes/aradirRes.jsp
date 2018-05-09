<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="modelo.*" %>
 
 <%
 if(request.getParameter("guardar").equals("guardar")){
	 if(request.getParameter("nombre")!= null && request.getParameter("poblacion")!= null && request.getParameter("cocinero")!= null){
		 
		 String nombre = request.getParameter("nombre");
		 String direccion = request.getParameter("direccion");
		 String poblacion = request.getParameter ("poblacion");
		 
		 Jatetxeak jatetxe = new Jatetxeak();
		 jatetxe.setNombre(nombre);
		 jatetxe.setDireccion(direccion);
		 jatetxe.setPoblacion(poblacion);
		 
		 JatetxeakModelo jatetxeakModelo = new JatetxeakModelo();
		 jatetxeakModelo.insert(jatetxe);
		 
		 
	 }
 }
 
 %>
       
       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Añadir Restaurante</title>
</head>
<body>

Dir
<tr><td>Nombre</td>
<td><input type="text" name="nombre"/></td></tr>
<tr><td>Direccion</td>
<td><input type="text" name="direccion"/></td></tr>
<tr><td>Poblacion</td>
<td><input type="text" name="poblacion"/></td></tr>
<tr><td></td><td>
<input type="submit" name="guardar" value="guardar"/></td></tr>



</body>
</html>