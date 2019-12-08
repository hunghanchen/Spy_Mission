package com.mycompany.chen_ciftarslan_a3.servlets;

import com.mycompany.chen_ciftarslan_a3.model.Gadget;
import com.mycompany.chen_ciftarslan_a3.model.MissionList;
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
 * @author Hung-Han,Chen & Ali Cemilcan Ciftarslan
 */
public class CreateMission extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();
            session.setAttribute("message", null);
            String missionName = request.getParameter("mission"); //Get the mission name from index

            //If user did not type mission or type empty space it will go index.jsp and show alert
            if (missionName.trim().equals("")) {

                String missionEmpty = "<h1 style=\"color:red;\">Mission cannot be blank</h1>";
                session.setAttribute("message", missionEmpty);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);

            } else {

                String agent = request.getParameter("agent");//Get the agent from jsp
                session.setAttribute("agentName", agent);

                ArrayList<Gadget> gadgets = new ArrayList<>();
                //Gadget is in checkbox so we are keeping all gadgets
                String[] gadget = request.getParameterValues("gadget");

                for (int i = 0; i < gadget.length; i++) {
                    if (!gadget[i].equals("")) { //When user did not enter in the gadget box will not add empty
                        gadgets.add(new Gadget(gadget[i]));
                    }
                }
                // Creating an instance of Mission
                Mission mission = new Mission();
                mission.setName(missionName);
                mission.setGadgets(gadgets);

                MissionList missionList = (MissionList) session.getAttribute(agent);

                //If missionList is null means we did not assign one at all
                if (missionList == null) {
                    missionList = new MissionList();
                    missionList.setAgent(agent);
                }

                missionList.addMission(mission);

                // We set as an agent since we want to keep different agent and their missions we just assign.
                session.setAttribute(agent, missionList);

                RequestDispatcher rd = request.getRequestDispatcher("viewMissions.jsp");
                rd.forward(request, response);

            }

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
