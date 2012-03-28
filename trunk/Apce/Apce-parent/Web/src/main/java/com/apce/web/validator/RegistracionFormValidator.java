package com.apce.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.apce.web.form.RegistracionForm;

public class RegistracionFormValidator implements Validator{

	private RegistracionForm registracionForm;
	
//	LoginService loginService = FacadeService.getLoginService();
	
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return RegistracionForm.class.isAssignableFrom(clazz);
	}

	public void validate(Object commandObject, Errors errors) {
		// TODO Auto-generated method stub
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "error.registracion.nombreVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellido", "error.registracion.apellidoVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idSucursal", "error.registracion.sucursalVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dni", "error.registracion.dniVacio");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fechaNacimiento", "error.registracion.fechaNacimiento");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono", "error.registracion.telefonoVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "direccion", "error.registracion.direccionVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "aliasUsuario", "error.registracion.aliasUsuarioVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pass", "error.registracion.passVacio");
		
		registracionForm = (RegistracionForm) commandObject;
		String nombre = registracionForm.getNombre();
		String apellido = registracionForm.getApellido();
		Integer idSucursal = registracionForm.getIdSucursal();
		Integer dni = registracionForm.getDni();
		//Date fecha_nacimiento = registracionForm.getFecha_nacimiento();
		Integer telefono = registracionForm.getTelefono();
		String direccion = registracionForm.getDireccion();
		String aliasUsuario = registracionForm.getAliasUsuario();
		String pass = registracionForm.getPass();
		
//		boolean existeUsuario = loginService.existeUser(aliasUsuario, idSucursal);
//		if(existeUsuario)
//			errors.rejectValue("usuario","error.registracion.usuarioExistente");
			
	}

}
