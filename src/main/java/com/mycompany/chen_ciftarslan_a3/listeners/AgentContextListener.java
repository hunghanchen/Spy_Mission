package com.mycompany.chen_ciftarslan_a3.listeners;

import com.mycompany.chen_ciftarslan_a3.model.MissioinList;
import javax.enterprise.context.SessionScoped;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Nancy Chen
 */
public class AgentContextListener implements ServletContextListener {

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

        for (int i = 0; i < agent.length; i++) {
            MissioinList missionList = new MissioinList();
            missionList.setAgent(agent[i]);
            sce.getServletContext().setAttribute(agent[i], missionList);
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
