<%-- 
    Document   : viewMissions
    Created on : 30-Nov-2019, 2:34:47 PM
    Author     : Nancy Chen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Here are the missions for ${sessionScope[param.agent].agent}</h1>

        <c:forEach var="mission" varStatus="counter" items="${sessionScope[param.agent].missions}">
            <h2> Mission ${counter.count} : ${mission.name}</h2>
            Gadgets:
            <ul>
                <c:forEach var="gadjet" items="${mission.gadgets}">
                    <li>${gadjet.name}</li>
                </c:forEach>               
            </ul>

        </c:forEach>             
        <form>
            <input type='submit' value='Delete Missions for  ${sessionScope[param.agent].agent}'>
        </form>        
        <a href="index.jsp">Back To Home Page</a>
    </body>
</html>
