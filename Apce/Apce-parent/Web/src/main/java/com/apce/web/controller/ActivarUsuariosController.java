package com.apce.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apce.modelo.Usuario;
import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class ActivarUsuariosController extends AbstractController {
	
	UsuarioService usuarioService = FacadeService.getUsuarioService();

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		//Deberia recuperar de algun lado el usuario para poder recuperar
		//la sucursal a donde pertence el usuario
		//ahora lo harcodeo pero deberia buscar eso
		List<Usuario> usuariosNoActivos = usuarioService.getUsuariosNoActivos(1);
		ModelAndView mav = new ModelAndView("peron", "usuariosNoActivos", usuariosNoActivos);
		return mav;
	}

}
