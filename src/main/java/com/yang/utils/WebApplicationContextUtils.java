package com.yang.utils;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtils {
    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        ApplicationContext app = (ApplicationContext)servletContext.getAttribute("app");
        return app;
    }
}
