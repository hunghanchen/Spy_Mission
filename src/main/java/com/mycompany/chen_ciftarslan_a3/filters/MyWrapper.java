

package com.mycompany.chen_ciftarslan_a3.filters;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author Nancy Chen
 */
public class MyWrapper extends HttpServletResponseWrapper{
    CharArrayWriter caw = new CharArrayWriter();
    PrintWriter writer = new PrintWriter(caw);

    public MyWrapper(HttpServletResponse response) {
        super(response);
    }
    
    @Override
    public PrintWriter getWriter()  {
        return writer;
    }

    @Override
    public String toString() {
        return caw.toString();
    }

}
