package com.apce.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.MateriaPrimaService;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class ActivarUsuariosController extends AbstractCommandController {
	
	UsuarioService usuarioService = FacadeService.getUsuarioService();

	@Override
	protected ModelAndView handle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
		//Deberia recuperar de algun lado el usuario para poder recuperar
		//la sucursal a donde pertence el usuario
		//ahora lo harcodeo pero deberia buscar eso
		usuarioService.getUsuariosNoActivos(1);
		
		return null;
	}

}
