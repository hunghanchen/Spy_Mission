<%-- 
    Document   : viewMission
    Created on : 6-Dec-2019, 
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
      <!-- GET Agent from index.jsp -->
        <h1>Here are the missions for ${param.agent}</h1>
        <!--        if the agent has no mission will show "There is no missions"-->
        <c:if test="${ empty sessionScope[param.agent].missions  }">
            <h2> There is no missions</h2>
        </c:if> 

           <!--Get the agent`s mission and show it on the list !-->
        <c:forEach var="mission" varStatus="counter" items="${sessionScope[param.agent].missions}">
            <h2> Mission ${counter.count} : ${mission.name}</h2>
            Gadgets:
            <ul>
                <c:forEach var="gadjet" items="${mission.gadgets}">
                    <li>${gadjet.name}</li>
                    </c:forEach>               
            </ul>

        </c:forEach>   

            <!-- If agent is not empty show to delete option !-->
        <c:if test="${! empty sessionScope[param.agent].missions}">
            <form action="DeleteMission.do" method="POST" >
                <input type='submit' value='Delete Missions for  ${sessionScope[param.agent].agent}'>
            </form>  
        </c:if> 
        <br><br>


        <a href="index.jsp">Back To Home Page</a>
    </body>
</html>
