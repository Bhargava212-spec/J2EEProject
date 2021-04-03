package com.pack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListner
 *
 */
@WebListener
public class MySessionListner implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        HttpSession hs=se.getSession();
        System.out.println("Session created");
        hs.setAttribute("dog", "labrado");
        hs.setAttribute("name", "Bhargava");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        HttpSession hs=se.getSession();
        System.out.println("Session destroyed");
        System.out.println(hs.getAttribute("dog"));
        System.out.println(hs.getAttribute("name"));
        
    }
	
}
