<%-- 
    Document   : resultados
    Created on : 21/06/2018, 09:53:46 PM
    Author     : start
--%>

<%@page import="Fracciones.Fraccion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            Fraccion a = new Fraccion();
            a.setNum(Integer.parseInt(request.getParameter("numerador")));
            a.setDenom(Integer.parseInt(request.getParameter("denominador")));
            
            Fraccion b  =new Fraccion();
            b.setNum(Integer.parseInt(request.getParameter("numerador1")));
            b.setDenom(Integer.parseInt(request.getParameter("denominador1")));
           
            
            Fraccion resultado = new Fraccion();
            resultado = resultado.suma(a, b);
            out.println("Suma = " +resultado.getNum()+"/"+resultado.getDenom() );
            resultado = resultado.resta(a, b);
            out.println("Resta = " +resultado.getNum()+"/"+resultado.getDenom() );
            resultado = resultado.multiplicacion(a, b);
            out.println("Multiplicacion = " +resultado.getNum()+"/"+resultado.getDenom() );
            resultado = resultado.division(a, b);
            out.println("División = " +resultado.getNum()+"/"+resultado.getDenom() );
            out.println(resultado.mayorMenor(a, b));

        %>
    </body>
</html>
