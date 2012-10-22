package com.apce.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.MateriaPrimaService;

public class MateriasPrimasFormController2  extends MultiActionController{

	MateriaPrimaService materiaPrimaService = FacadeService.getMateriaPrimaService();

	public ModelAndView altaSucursal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("CustomerPage", "msg","add() method");

	}
	// 
	//	public ModelAndView delete(HttpServletRequest request,
	//		HttpServletResponse response) throws Exception {
	// 
	//		return new ModelAndView("CustomerPage", "msg","delete() method");
	// 
	//	}
	// 
	//	public ModelAndView update(HttpServletRequest request,
	//		HttpServletResponse response) throws Exception {
	// 
	//		return new ModelAndView("CustomerPage", "msg","update() method");
	// 
	//	}

	public ModelAndView listMateriasPrimas(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("/materiasprimas/listMateriaPrima","materiasPrimasList",materiaPrimaService.getMateriasPrimas());
		//return new ModelAndView("/materiasprimas/listMateriaPrima","test",new  (10, false));
		  

	}

}
