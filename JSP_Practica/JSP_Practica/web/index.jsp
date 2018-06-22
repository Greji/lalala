<%-- 
    Document   : index
    Created on : 21/06/2018, 09:50:46 PM
    Author     : start
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="resultados.jsp" method="get">
            Numerador 1:<input type="text" name="numerador"/><br>
            Denominador 1:<input type="text" name="denominador"/>
            <br>
            <br>
            Numerador 2:<input type="text" name="numerador1"/><br>
            Denominador 2:<input type="text" name="denominador1"/>
            <input type="submit" name="valores" value="Resultado"/>
        </form>
    </body>
</html>
