<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h3>Conocimientos de futbol con Struts</h3>
        <html:form action="/ControlAction">
            ¿Quién es el mejor jugador del mundo?
            <html:text property="mejorjugador"/>
            <html:submit value="Consultar respuesta correcta"/>
        </html:form>

    </body>
</html>
