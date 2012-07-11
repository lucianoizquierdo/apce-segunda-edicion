package com.apce.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class ToloController extends SimpleFormController { 
	
	    @Override
	    protected ModelAndView onSubmit(Object command) throws Exception {
	        return super.onSubmit(command);
	        
	    }

}
