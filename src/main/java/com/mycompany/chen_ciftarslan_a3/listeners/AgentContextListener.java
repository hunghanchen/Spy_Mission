package com.mycompany.chen_ciftarslan_a3.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Hung-Han,Chen & Ali Cemilcan Ciftarslan
 */
public class AgentContextListener implements ServletContextListener {

    /**
     * Getting the agent and gadgets values and split it with ";" and save it on
     * array. After that we are setAtribute of these values to use in JSP pages
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String agents = sce.getServletContext().getInitParameter("agents");
        String gadgets = sce.getServletContext().getInitParameter("gadget");
        String filtereWords = sce.getServletContext().getInitParameter("filtereWords");
        String[] agent = agents.split(":");
        String[] gadget = gadgets.split(":");
        String[] filtereWord = filtereWords.split(":");

        sce.getServletContext().setAttribute("agents", agent);
        sce.getServletContext().setAttribute("gadgets", gadget);
        sce.getServletContext().setAttribute("filtereWords", filtereWord);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
