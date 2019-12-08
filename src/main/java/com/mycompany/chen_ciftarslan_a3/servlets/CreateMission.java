/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chen_ciftarslan_a3.servlets;

import com.mycompany.chen_ciftarslan_a3.model.Gadget;
import com.mycompany.chen_ciftarslan_a3.model.MissioinList;
import com.mycompany.chen_ciftarslan_a3.model.Mission;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nancy Chen
 */
public class CreateMission extends HttpServlet {
//    MissioinList missioinList = null;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            MissioinList missioinList;

            HttpSession session = request.getSession();
            String agent = request.getParameter("agent");
            session.setAttribute("agentName", agent);

            missioinList = (MissioinList) getServletContext().getAttribute(agent);

            ArrayList<Gadget> gadgets = new ArrayList<>();

            String[] gadget = request.getParameterValues("gadget");

            for (int i = 0; i < gadget.length; i++) {
                gadgets.add(new Gadget(gadget[i]));
            }

            String missionName = request.getParameter("mission");
            Mission mission = new Mission();
            mission.setName(missionName);
            mission.setGadgets(gadgets);

            missioinList.addMission(mission);

            session.setAttribute(agent, missioinList);

            String test = "5";
            session.setAttribute("deleteMessage", null);

            RequestDispatcher rd = request.getRequestDispatcher("viewMissions.jsp");
            rd.forward(request, response);

        } catch (Exception ex) {
            System.out.println(ex.toString());

        }

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
