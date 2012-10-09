package com.apce.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.apce.modelo.Usuario;
import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.UsuarioService;
import com.apce.web.form.UsuarioForm;

public class UsuariosFormController  extends MultiActionController{
	
		UsuarioService usuarioService = FacadeService.getUsuarioService();
	 
		public ModelAndView altaSucursal(HttpServletRequest request,
			HttpServletResponse response, Object command) throws Exception {

			UsuarioForm usuarioForm = (UsuarioForm) command;

			Usuario usuario = new Usuario();
			BeanUtils.copyProperties(usuarioForm, usuario);
			usuarioService.altaUsuario(usuario);
			return listUsuarios(request, response);
		}
//	 
//		public ModelAndView delete(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//	 
//			return new ModelAndView("CustomerPage", "msg","delete() method");
//	 
//		}
//	 
//		public ModelAndView update(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//	 
//			return new ModelAndView("CustomerPage", "msg","update() method");
//	 
//		}
	 
		public ModelAndView listUsuarios(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	 
			return new ModelAndView("usuariosList","usuariosList", usuarioService.getUsuarios());
	 
		}
	 
	}