package com.apce.servicio.servicio.Impl;


import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.apce.modelo.Usuario;
import com.apce.persistencia.interfaz.BaseDAO;
import com.apce.persistencia.interfaz.UsuarioDAO;
import com.apce.servicio.servicoInterfaz.LoginService;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class LoginServiceImpl implements LoginService {
	
	private UsuarioDAO dao;

	@Override
	public Usuario getUsuario(String user, String pass, Integer sucursal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDao(BaseDAO dao) {
		// TODO Auto-generated method stub
		this.dao = (UsuarioDAO) dao;
		
	}

	@Override
	public boolean existeUser(String aliasUsuario, Integer idSucursal) {
		// TODO Auto-generated method stub
		
		boolean existeUsuario = this.dao.existeUser(aliasUsuario,idSucursal);
		return existeUsuario;
	}



}
