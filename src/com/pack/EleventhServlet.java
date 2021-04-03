package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EleventhServlet
 */
//@WebServlet("/EleventhServlet")
public class EleventhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EleventhServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		ServletConfig sc=getServletConfig();
		String s1=sc.getInitParameter("city");
		pw.println(s1+"<br/>");
		String s2=sc.getInitParameter("state");
		pw.println(s2+"<br/>");
		
		ServletContext sc1=getServletContext();
		String s3=sc1.getInitParameter("email");
		pw.println(s3+"<br/>");
		String s4=sc1.getInitParameter("website");
		pw.println(s4+"<br/>");
		
		pw.println("<br/>");
		Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements()) {
			String pname=(String)e.nextElement();
			String pvalue=sc.getInitParameter(pname);
			pw.println(pname+"="+pvalue+"<br/>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
