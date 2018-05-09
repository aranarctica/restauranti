<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.*" %>
    <%
    if(request.getParameter("guardar").equals("guardar")){
    	if(request.getParameter("nombre")!= null && request.getParameter("apellido")!= null && request.getParameter("telefono")!= null){
    		
    		String nombre = request.getParameter("nombre");
    		String apellido = request.getParameter("apellido");
    		String telefono = request.getParameter("telefono");
    		
    		Cocinero cocinero = new Cocinero();
    		cocinero.setNombre(nombre);
    		cocinero.setApellido(apellido);
    		cocinero.setTelefono(telefono);
    		
    		CocineroModelo cocineroModelo = new CocineroModelo();
    		cocineroModelo.insert(cocinero);
    		
    	}
    }
    
    
    
    %>
    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Añadir Cocinero</title>
</head>
<body>


<tr><td>Nombre</td>
<td><input type="text" name="nombre"/></td></tr>
<tr><td>Apellido</td>
<td><input type="text" name="apellido"/></td></tr>
<tr><td>Telefono</td>
<td><input type="text" name="telefono"/></td></tr>
<tr><td></td><td>
<input type="submit" name="guardar" value="guardar"/></td></tr>

</body>
</html>