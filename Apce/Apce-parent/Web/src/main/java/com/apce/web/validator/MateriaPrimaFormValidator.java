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
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigoMateriaPrima", "materiaPrimaForm.codigoMateriaPrima.vacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tipo", "materiaPrimaForm.tipo.vacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tamanio", "materiaPrimaForm.tamanio.vacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "color", "materiaPrimaForm.color.vacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descripcion", "materiaPrimaForm.descripcion.vacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "kilos", "materiaPrimaForm.kilos.vacio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "litros", "materiaPrimaForm.litros.vacio");
		
		MateriaPrimaForm materiaPrimaForm = (MateriaPrimaForm) target;
		
		String codigoMateriaPrima = materiaPrimaForm.getCodigoMateriaPrima();
		boolean existeMateriaPrima = materiaPrimaService.existeMateriaPrima(codigoMateriaPrima);
		if(existeMateriaPrima)
			errors.rejectValue("codigoMateriaPrima","materiaPrimaForm.error.materiaPrimaExistente");
	}

}
