package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@WebServlet("/EightServlet")
 * Servlet implementation class SixthServlet
 */
public class SixthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SixthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        PrintWriter pw=response.getWriter();

        pw.println(request.getHeader("accept-language")+"<br/>");

        pw.println(request.getHeader("host"));

        pw.println("<br/>");

        Enumeration e=request.getHeaderNames();

		while(e.hasMoreElements()){
		
		        String s1=(String)e.nextElement();
		
		        String s2=request.getHeader(s1);
		
		        pw.println(s1+" = "+s2+"<br/>");
		
		}
		
		pw.println("<br/>");
		
		Enumeration e1=request.getHeaders("user-agent");
		
		while(e1.hasMoreElements()){
		
		        pw.println(e1.nextElement()+"<br/>");
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}