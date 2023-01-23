package com.yang.listener;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class ContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextConfigXML = servletContext.getInitParameter("contextConfigXML");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigXML);
        servletContext.setAttribute("app",app);
        System.out.println("ContextLoaderListener...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
