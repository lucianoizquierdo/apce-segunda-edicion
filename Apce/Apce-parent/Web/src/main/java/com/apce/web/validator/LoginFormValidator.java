package com.apce.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.apce.web.form.LoginForm;

public class LoginFormValidator implements Validator{

	private LoginForm loginForm;
//	LoginService loginService = FacadeService.getLoginService();
	
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return LoginForm.class.isAssignableFrom(clazz);
	}

	public void validate(Object commandObject, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "usuario", "error.usuario_incorrecto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pass", "error.password_vacio");
		
		loginForm = (LoginForm) commandObject;
		String usuario = loginForm.getUsuario();
		String pass = loginForm.getPass();
		Integer sucursal = loginForm.getSucursal();
	
		
	//	boolean existeUsiaro = loginService.validarUsuario(usuario, sucursal);
		
//		if(user == null)
//			errors.rejectValue("usuario","error.usuario_incorrecto");
//		
//		if( (loginForm.getPass() != "Password") && (loginForm.getUsuario() != "partha") )
//			errors.rejectValue("usuario","error.usuario_incorrecto");
			
	}

}
