package com.pack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class MySessionAttributeListner
 *
 */
@WebListener
public class MySessionAttributeListner implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MySessionAttributeListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
          HttpSession hs=se.getSession();
          System.out.println("Attribute Added");
          System.out.println(se.getName()+" "+se.getValue());
          
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
        HttpSession hs=se.getSession();
        System.out.println("Attribute removed");
        System.out.println(se.getName()+" "+se.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
       HttpSession hs=se.getSession();
       System.out.println("Attribute Replaced");
       System.out.println(se.getName()+" "+se.getValue());
    }
	
}
