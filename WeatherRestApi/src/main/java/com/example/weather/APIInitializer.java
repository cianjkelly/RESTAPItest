package com.fiserv.merchantmaintenance;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class APIInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { APIInitializer.class};
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {};
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}
