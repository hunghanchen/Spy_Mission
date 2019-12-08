package com.mycompany.chen_ciftarslan_a3.filters;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Hung-Han,Chen & Ali Cemilcan Ciftarslan
 */
public class CensorFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        MyWrapper wrapper = new MyWrapper((HttpServletResponse) response);
        chain.doFilter(request, wrapper);

        //Getting the gadgets from web.xml with ServletContext().
        String[] filterwords = (String[]) request.getServletContext().getAttribute("filtereWords");

        String fromJsp = wrapper.toString();

        String output = fromJsp.replace("", "");

        // We wont shot the specific gadgets so we use loop to replace all
        for (String filters : filterwords) {
            output = output.replace(filters, "***");
        }

        PrintWriter out = response.getWriter();

        out.print(output);
    }

    @Override
    public void destroy() {
    }

}
