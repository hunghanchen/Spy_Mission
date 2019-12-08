<%-- 
    Document   : createMission
    Created on : 06-Dec-2019
    Author     : Hung-Han,Chen, Ali Cemilcan Ciftarslan
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
        <!--
        Creating page that shows agent list with using forEach retirieve form AgentContextListener
        -->
        <h1>Create a Mission</h1>
        <form action="CreateMission.do" method="POST">
            Mission Title: <input type="text" name="mission"><br>
            Select the agent:<select name="agent">
                <c:forEach var="agent" items="${agents}">
                    <option  value="${agent}">${agent}</option>
                </c:forEach>
            </select>

            <!--
            Using checkbox to allow multiple gadgets, using forEach to display and
            retrieve from AgentContextListener.
            -->
            
            <h2>Select the Gadgets</h2>
            <c:forEach var="gadget" items="${gadgets}">
                <input type="checkbox" name="gadget" value="${gadget}">${gadget}<br>
            </c:forEach>
            Other Gadget: <input type="text" name="gadget"><br>
            <input type="submit" formaction="CreateMission.do" formmethod="POST" value="Create Mission">
        </form>
    </body>
</html>
