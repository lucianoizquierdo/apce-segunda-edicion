package com.apce.web.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apce.modelo.MateriaPrima;
import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.MateriaPrimaService;
import com.apce.web.form.MateriaPrimaForm;

public class MateriasPrimasFormController extends SimpleFormController {
	
//	MateriaPrimaService materiaPrimaService = FacadeService.getInstance().getMateriaPrimaService();
	MateriaPrimaService materiaPrimaService = FacadeService.getMateriaPrimaService();
	
	
	 @Override
	    protected ModelAndView onSubmit(Object command) throws Exception {
	        MateriaPrimaForm materiaPrimaForm = (MateriaPrimaForm) command;
	        
	        MateriaPrima materiaPrima = new MateriaPrima();
			BeanUtils.copyProperties(materiaPrimaForm, materiaPrima);
			materiaPrimaService.altaMateriaPrima(materiaPrima);
			
	        return super.onSubmit(command);
	    }
	    

}
