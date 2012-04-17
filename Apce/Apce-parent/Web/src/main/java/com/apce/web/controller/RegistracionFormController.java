package com.apce.web.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apce.modelo.Usuario;
import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.UsuarioService;
import com.apce.web.form.RegistracionForm;

public class RegistracionFormController extends SimpleFormController {
	
//	UsuarioService usuarioService = FacadeService.getInstance().getUsuarioService();
	UsuarioService usuarioService = FacadeService.getUsuarioService();
 
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        RegistracionForm registracionForm = (RegistracionForm) command;
        
        Usuario newUser = new Usuario();
		BeanUtils.copyProperties(registracionForm, newUser,new String[]{"fecha_nacimiento"});
		Date fecha_nacimiento = new Date(registracionForm.getFecha_nacimiento());
		newUser.setFecha_nacimiento(fecha_nacimiento);
		usuarioService.altaUsuario(newUser);
        return super.onSubmit(command);
    }
    
    
    
}