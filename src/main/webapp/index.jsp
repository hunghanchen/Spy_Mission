<%-- 
    Document   : index
    Created on : 2-Dec-2019, 9:32:41 AM
    Author     : Hung-Han,Chen, Ali Cemilcan Ciftarslan
    Heroku     :https://spy-mission-chen-ciftarslan-a3.herokuapp.com/
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
        <!--get from the DeleteMission servlet message-->
        <c:if test="${!empty message}">
            <h2>${message}</h2>
        </c:if> 
 

        <h1>Our Super Cool Spy App</h1>
        <h2>Create a Mission</h2>
        <form>
            <input type="submit" formaction="createMission.jsp" value="Create a Mission">
            <h2>View Missions For</h2>

            <!--get from the AgentContextListner attribute message-->
            Select an agent: 
            <select name="agent">
                <c:forEach var="agents" items="${agents}">
                    <option value="${agents}">${agents}</option>
                </c:forEach>
            </select>
            <input type="submit" formaction="viewMissions.jsp" value="Go">
        </form>
    </body>
</html>

