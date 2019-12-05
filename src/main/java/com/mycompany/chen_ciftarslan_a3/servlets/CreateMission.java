/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chen_ciftarslan_a3.servlets;

import com.mycompany.chen_ciftarslan_a3.model.Gadget;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nancy Chen
 */
public class CreateMission extends HttpServlet {
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            ArrayList<Gadget> gadgets = new ArrayList<>();
            String[] gadget = request.getParameterValues("gadget");
            for(int i = 0 ; i < gadget.length ; i++){
                gadgets.add(new Gadget(gadget[i]));
            }
            
            String missionName = request.getParameter("mission");
            
            String agent =request.getParameter("agent");
            
            
            
            writeHeader(out);
            out.println("<h1> Here are the mission for </h1>");
            out.println("<h2> Mission </h2>");
            out.println("<form>");
            out.println("<input type='submit' value='Delete Missions for Jane Blond'>");
            out.println("</form>");
            writeFooter(out);
        } catch (Exception ex) {
            System.out.println(ex.toString());

        }

    }

    private void writeHeader(final PrintWriter out) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Create mission</title>");
        out.println("</head>");
        out.println("<body>");

    }

    private void writeFooter(final PrintWriter out) {
        out.println("<a href=\"index.html\">Back to Home Page</a>\n");
        out.println("</body>");
        out.println("</html>");
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
