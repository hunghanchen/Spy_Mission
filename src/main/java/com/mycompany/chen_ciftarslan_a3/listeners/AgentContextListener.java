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
        String[] agent = agents.split(":");
        String[] gadget = gadgets.split(":");
        sce.getServletContext().setAttribute("agents", agent);
        //one initial once
        boolean once = true;
        while (once) {
            for (int i = 0; i < agent.length; i++) {
                MissioinList missionList = new MissioinList();
                missionList.setAgent(agent[i]);
                sce.getServletContext().setAttribute(agent[i], missionList);
            }
            once = false;
        }

        sce.getServletContext().setAttribute("gadgets", gadget);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
