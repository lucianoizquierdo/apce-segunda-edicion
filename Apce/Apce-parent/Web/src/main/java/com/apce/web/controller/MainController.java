package com.apce.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apce.modelo.Usuario;
import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class MainController extends AbstractController {
	
	UsuarioService usuarioService = FacadeService.getUsuarioService();	 
	
		@Override
		protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
				HttpServletResponse arg1) throws Exception {
	    	
			//Obtengo el usuario
	    	Authentication au = SecurityContextHolder.getContext().getAuthentication();
	    	String nombreUsuario = au.getName();
	    	Usuario user = usuarioService.getUsuario(nombreUsuario); 
	    	
			return new ModelAndView("menu.htm");
		}

}
