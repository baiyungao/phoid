package com.wgt.ezsso.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AccountYadisServlet extends HttpServlet {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
    		throws IOException, ServletException
{
    	response.setContentType("application/xrds+xml");
    	PrintWriter out = response.getWriter();

    	out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    	out.println("<xrds:XRDS xmlns:xrds=\"xri://$xrds\" xmlns=\"xri://$xrd*($v*2.0)\">");
    	out.println(" <XRD>");
    	out.println("<Service priority=\"0\">");
    	out.println("<Type>http://specs.openid.net/auth/2.0/server</Type>");

    	out.println("<Type>http://openid.net/srv/ax/1.0</Type>");
    	out.println("<Type>http://specs.openid.net/extensions/ui/1.0/mode/popup</Type>");
    	out.println("<Type>http://specs.openid.net/extensions/ui/1.0/icon</Type>");
    	out.println("<Type>http://specs.openid.net/extensions/pape/1.0</Type>");
    	out.println("<URI>https://www.google.com/accounts/o8/ud</URI>");
    	out.println("</Service>");
    	out.println("</XRD>");
    	out.println("</xrds:XRDS>");
}


}

