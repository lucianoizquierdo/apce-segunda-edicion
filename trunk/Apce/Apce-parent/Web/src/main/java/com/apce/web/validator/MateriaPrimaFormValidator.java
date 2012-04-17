package com.apce.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.MateriaPrimaService;
import com.apce.web.form.MateriaPrimaForm;

public class MateriaPrimaFormValidator implements Validator {
	
//	MateriaPrimaService materiaPrimaService = FacadeService.getInstance().getMateriaPrimaService();
	MateriaPrimaService materiaPrimaService = FacadeService.getMateriaPrimaService();

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return MateriaPrimaForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigoMateriaPrima", "error.registracion.nombreVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tipo", "error.registracion.nombreVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tamanio", "error.registracion.apellidoVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "color", "error.registracion.sucursalVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descripcion", "error.registracion.dniVacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "kilos", "error.registracion.fechaNacimiento");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "litros", "error.registracion.telefonoVacio");
		
		MateriaPrimaForm materiaPrimaForm = (MateriaPrimaForm) target;
		
		String codigoMateriaPrima = materiaPrimaForm.getCodigoMateriaPrima();
		boolean existeMateriaPrima = materiaPrimaService.existeMateriaPrima(codigoMateriaPrima);
		if(existeMateriaPrima)
			errors.rejectValue("codigoMateriaPrima","error.materiasPrimas.materiaPrimaExistente");
	}

}
