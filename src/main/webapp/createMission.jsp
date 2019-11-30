<%-- 
    Document   : createMission
    Created on : 30-Nov-2019, 2:33:37 PM
    Author     : Nancy Chen
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create a Mission</h1>
        <form>
        Mission Title: <input type="text" name="mission">
        Select the agent:
        
        <h2>Select the Gadgets</h2>
        Other Gadget: <input type="text" name="gadget">
        <input type="submit" formaction="CreateMission.do" formmethod="POST" value="Create Mission">
        </form>
    </body>
</html>
