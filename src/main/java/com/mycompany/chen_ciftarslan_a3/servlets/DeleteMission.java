
package com.mycompany.chen_ciftarslan_a3.servlets;

import com.mycompany.chen_ciftarslan_a3.model.MissioinList;
import com.mycompany.chen_ciftarslan_a3.model.Mission;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *@author Hung-Han,Chen & Ali Cemilcan Ciftarslan
 */
public class DeleteMission extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String agent = (String) session.getAttribute("agentName");
        //Delete each mission 
        session.setAttribute(agent, new MissioinList(agent, new ArrayList<Mission>()));
        
        String deleteMessage = "<h1 style=\"color:red;\">Missions Deleted for " + agent + "</h1>";
        session.setAttribute("message", deleteMessage);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
