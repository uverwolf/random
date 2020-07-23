<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Titulo</title>
</head>

<body>
<h5><c:out value="${boton}"/> </h5>
<h5>Contador : <c:out value="${contador.getContador() }"/> </h5>
<h5><c:out value="${palabra}"/> </h5>

<form action="Random">
<input type="submit" value="agregar" onclick="funcion()" name="boton">
</form>




<h4>FECHA uLTIMA PALABRA <c:out value="${objeto.getFecha() }"/></h4>
</body>
</html>