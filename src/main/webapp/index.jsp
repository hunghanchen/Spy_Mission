<%-- 
    Document   : index
    Created on : 2-Dec-2019, 9:32:41 AM
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
        <h1>Our Super Cool Spy App</h1>
        <h2>Create a Mission</h2>
        <form>
            <input type="submit" formaction="createMission.jsp" value="Create a Mission">
            <h2>View Missions For</h2>

            Select an agent: <select>
                <c:forEach var="agent" items="${agents}">
                      <option value="${agent}">${agent}</option>
                </c:forEach>
            </select>
            <input type="submit" formaction="viewMissions.jsp" value="Go">
        </form>
    </body>
</html>

