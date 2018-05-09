<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.*" %>
    <%
    if(request.getParameter("guardar").equals("guardar")){
    	if(request.getParameter("nombre")!= null && request.getParameter("descripcion")!= null && request.getParameter("metalico")!= null){
    		
    		String nombre = request.getParameter("nombre");
    		String descripcion = request.getParameter("descripcion");
    		String metalico = request.getParameter("metalico");
    		
    		Premios premio = new Premios();
    		premio.setNombre(nombre);
    		premio.setDescripcion(descripcion);
    		premio.setPremioMetalico(metalico);
    		
    		PremiosModelo premiosModelo = new PremiosModelo();
    		premiosModelo.insert(premio);
    		
    		
    		
    	}
    	
    	
    }
    
    
    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Añadir Premio</title>
</head>
<body>

<tr><td>Nombre</td>
<td><input type="text" name="nombre"/></td></tr>
<tr><td>Descripcion</td>
<td><input type="text" name="descripcion"/></td></tr>
<tr><td>Premio en Metalico</td>
<td><input type="text" name="metalico"/></td></tr>
<tr><td></td><td>
<input type="submit" name="guardar" value="guardar"/></td></tr>

</body>
</html>