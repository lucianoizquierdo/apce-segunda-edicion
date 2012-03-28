package com.apce.servicio.servicio.Impl;

import com.apce.servicio.servicoInterfaz.LoginService;

public class FacadeService{

	private static LoginService loginService;
	
	private static FacadeService instance = null;
	
	public static FacadeService getInstance()
	{
		if(instance == null)
			instance = new FacadeService(); 

		return instance;
		
	}
	
	public void setLoginService(LoginService l) {
		this.loginService = l;
	}

	public static LoginService getLoginService() {
		// TODO Auto-generated method stub
		return loginService;
	}
	

}
