package com.apce.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apce.web.form.LoginForm;

public class RegistracionFormController extends SimpleFormController {
 
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        LoginForm loginForm = (LoginForm) command;
        System.out.println("Username: " + loginForm.getUsuario());
        System.out.println("Password: " + loginForm.getPass());
        return super.onSubmit(command);
    }
    
    
    
}