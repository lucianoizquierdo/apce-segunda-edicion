package com.apce.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.apce.web.form.LoginForm;

public class LoginFormController extends SimpleFormController {
 
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        LoginForm loginForm = (LoginForm) command;
        
        //ModelAndView a = new ModelAndView();
        
        
        //return new ModelAndView(new RedirectView("main.htm"));
          return super.onSubmit(command);
        
    }

    /*
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		LoginForm loginForm = (LoginForm) super.formBackingObject(request);
		loginForm.setUsuario("peron");
		return loginForm;
		//return super.formBackingObject(request);
	}
    */
    
    
}