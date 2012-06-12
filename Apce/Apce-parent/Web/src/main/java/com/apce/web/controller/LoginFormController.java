package com.apce.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.apce.web.form.LoginForm;

public class LoginFormController extends SimpleFormController {
 
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        LoginForm loginForm = (LoginForm) command;
        
        //return super.onSubmit(command);
        return new ModelAndView(new RedirectView("main.do"));
        
    }
    
    
    
}