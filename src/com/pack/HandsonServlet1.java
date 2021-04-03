package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandsonServlet1
 */
@WebServlet("/HandsonServlet1")
public class HandsonServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandsonServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String Firstname=request.getParameter("n1");
		pw.println(Firstname+"<br/>");
		String Lastname=request.getParameter("n2");
		pw.println(Lastname+"<br/>");
		int address=Integer.parseInt(request.getParameter("n3"));
		pw.println(address+"</br>");
		String Emailid=request.getParameter("n4");
		pw.println(Emailid+"<br/>");
		String City=request.getParameter("n5");
		pw.println(City+"<br/>");
		String State=request.getParameter("n6");
		pw.println(State+"<br/>");
		String PetName=request.getParameter("n7");
		pw.println(PetName+"<br/>");
		int PhoneNumber=Integer.parseInt(request.getParameter("n8"));
		pw.println(PhoneNumber+"</br>");
		String PetType=request.getParameter("Pet Type");
		pw.println(PetType+"</br>");
		int PetAge=Integer.parseInt(request.getParameter("n9"));
		pw.println(PetAge+"</br>");
		
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
