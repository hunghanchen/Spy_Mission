

package com.mycompany.chen_ciftarslan_a3.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Nancy Chen
 */
public class AgentContextListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String agents = sce.getServletContext().getInitParameter("agents");
        String[] agent = agents.split(":");
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
